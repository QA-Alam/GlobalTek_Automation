package globalteck.usa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Level;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.Scenario;
import globaltek.usa.basepage.SupperClass;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class CommonUtil extends SupperClass {

	private static final String ACTION = "arguments[0].click();";
	static String projectPath = "user.dir";
	public static String TESTDATA_SHEET_PATH = "./TestData/testData.xlsx";
	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	// static WebDriver driver;
	public static void mouseHoverElement(WebElement hoverElement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverElement).build().perform();
	}

	public static String getRandomString(int length) {
		String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrsuvwxyz";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(ch.charAt(new Random().nextInt(26)));
		}
		return sb.toString();
	}

	public static void clearText(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).keyDown(element, Keys.LEFT_CONTROL).sendKeys(Keys.chord("A"), Keys.BACK_SPACE)
					.click(element).build().perform();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public static void sendKeys(WebElement element, String data) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).sendKeys(Keys.chord(data)).build().perform();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public static void clickbutton(WebElement element) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);

		}
	}

	public static void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	public static String getScreenshot(WebDriver driver, Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		String dateName = new SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty(projectPath) + "/screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			logger.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
		return destination;
	}

	public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
	
	}

	public static void WindowHandle() throws Throwable {
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			System.out.println(driver.getTitle());
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				// Closing the Child Window.
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}

	public static boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.findElement(by).click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", element);
	}

	public static void scrollView(String Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public static String threeDaysBefore() {
		String threeDaysBefore = "";
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, -3);
		Date before = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd");
		threeDaysBefore = formatter.format(before);
		return threeDaysBefore;
	}

	public static WebElement getWebElClickable(String xpath, int waitSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitSeconds));
		return wait.ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath(xpath))));
	}

	// Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

	// Created for generating random string for Unique email
	public static String randomNumeric() {
		String generatedString = RandomStringUtils.randomNumeric(10);
		return (generatedString);
	}

	public static void main(String[] args) {
		System.out.println("Alam" + randomestring() + "@gmail.com");
		System.out.println("My Phone Number is : " + randomNumeric());
	}

	public void selectTheCheckBoxfromList(WebElement element, String valueToSelect) {
		List<WebElement> allOptions = element.findElements(By.tagName("input"));
		for (WebElement option : allOptions) {
			logger.info("Option value " + option.getText());
			if (valueToSelect.equals(option.getText())) {
				option.click();
				break;
			}
		}
	}

	public void selectTheCheckbox(WebElement element) {
		try {
			if (element.isSelected()) {
				logger.info("Checkbox: " + element + "is already selected");
			} else {
				// Select the check box
				element.click();
			}
		} catch (Exception e) {
			logger.info("Unable to select the checkbox: " + element);
		}
	}

	public static void highLightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
		try {
			Thread.sleep(500);
		} catch (Throwable t) {
			logger.info("Error with : element cannot finds " + t.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px blue');", element);
	}

	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(ACTION, ele);
	}

	public static void click(WebDriver driver, By by) {
		try {
			(new WebDriverWait(driver, Duration.ofSeconds(30))).until(ExpectedConditions.elementToBeClickable(by));
			driver.findElement(by).click();
		} catch (StaleElementReferenceException sere) {
			driver.findElement(by).click();
		}
	}

	public static void waitForElement(WebElement element) {
		int i = 0;
		while (i < 10) {
			try {
				element.isDisplayed();
				break;
			} catch (WebDriverException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException a) {
					logger.log(Level.WARN, "Interrupted! ", a);
					Thread.currentThread().interrupt();
				}
				i++;
			}
		}
	}

	public static void waitThenClick(WebElement element, WebDriver driver) {
		try {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
			if (element.isDisplayed() && element.isEnabled()) {
				getAction().moveToElement(element);
				getAction().click(element).build().perform();
			}
		} catch (TimeoutException toe) {
			logger.log(Level.WARN, " Interrupted! ", toe);
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			logger.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
	}

	public static void clickWithAction(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.click(element).build().perform();
	}

	public static WebDriverWait getWebDriverWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait;
	}

	public static void clickWithJS(WebElement element) {
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript(ACTION, element);
	}

	public static void mouseHover(WebElement elementtoclick, WebDriver driver) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(elementtoclick).build().perform();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].style.border='4px groove green'", elementtoclick);
			String mouseOverScript = "if(document.createEvent)" + "{"
					+ "    var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false);"
					+ " arguments[0].dispatchEvent(evObj);" + "} " + "else if(document.createEventObject) " + "{ "
					+ "    arguments[0].fireEvent('onmouseover');" + "}";
			jse.executeScript(mouseOverScript, elementtoclick);
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(elementtoclick));
			highLightElement(elementtoclick);
			jse.executeScript(ACTION, elementtoclick);
		} catch (Exception e) {
			logger.log(Level.WARN, "Interrup ted!", e);
			Thread.currentThread().interrupt();
		}
	}

	public static void waitForStaleElement(WebElement element) {
		int y = 0;
		while (y <= 15) {
			try {
				element.isDisplayed();
				break;
			} catch (StaleElementReferenceException st) {
				y++;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e1) {
					logger.log(Level.WARN, "Interrupted!", e1);
					Thread.currentThread().interrupt();
				}
			} catch (WebDriverException we) {
				y++;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e2) {
					logger.log(Level.WARN, "Interrupted!", e2);
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	
	
	

	public void pageLoad(int time) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	public static Actions getAction() {
		Actions action = new Actions(driver);
		return action;
	}

	public static void sendkeys(String text) {
		try {
			Robot robot = new Robot();
			String lol = text.toUpperCase();
			for (int i = 0; i < lol.length(); i++) {
				robot.keyPress(Character.getNumericValue(lol.charAt(i)));
			}
		} catch (java.awt.AWTException exc) {
			System.out.println("error");
		}
	}

	public static void moveMouse(int x, int y) {
		try {
			Robot robot = new Robot();
			robot.mouseMove(x, y);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public static void dropDownMenu(WebElement ele, String value) {
		List<WebElement> myList = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(ele));
		for (WebElement myOptions : myList) {
			if (myOptions.getText().contains(value)) {
				System.out.println("Selected value is a : " + myOptions.getText());
				new WebDriverWait(driver, Duration.ofSeconds(30))
						.until(ExpectedConditions.elementToBeClickable(myOptions));
				myOptions.click();
				break;
			}
		}
	}

	public void uploadFile(String filepath) {
		try {
			// put file path in a clip-board
			StringSelection strSel = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
			// imitate mouse event ENTER/COPY/PASTE
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			logger.info("Success to upload file: " + filepath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testUpload() throws InterruptedException {
		driver.get("");
		WebElement element = driver.findElement(By.name("uploadfile"));
		element.click();
		uploadFile("path to the file");
		Thread.sleep(2000);
	}

	public static void handleDropDownMenu(String dropDownValues) {
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		for (WebElement option : list) {
			if (option.getText().contains(dropDownValues)) {
				option.click();
				break;
			}
		}
	}

	// What is iframe?
	// iframe is a document overwrapping the project. Before we click any operation
	// on the
	// web-page with any operation, we need to handle the iframe
	// How to handle iframe in selenium?
	// I can handle many way like ->
	// 1. using explicit wait and frame to beavailable and switch to it method and
	// pass frame name
	// 2. using driver.switchto.frame method and pass the tag name
	public static void waitForFrameAndSwitch(String frameDetails) {
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameDetails));
	}

	
	
	
	
	
	public static void handleframe() {
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	}

	public static void handleDropDownMenu(WebDriver driver, String dropDownValues) {
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		for (WebElement option : list) {
			if (option.getText().contains(dropDownValues)) {
				System.out.println("Selected value is a : " + option.getText());
				option.click();
				break;
			}
		}
	}

	public void selectFromList(String option) {
		// Use any locator by which select drop down node could be found
		WebElement element = driver.findElement(By.xpath("//select[@id='select1']"));
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}

	public static void selectDate() {
		WebElement dateWidget = driver.findElement(By.xpath(""));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals("13")) {
				cell.findElement(By.linkText("13")).click();
				break;
			}
		}
	}

	// element click by index number
	public void elementsClickByIndex(List<WebElement> ele, int num) {
		List<WebElement> element = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(ele));
		for (int i = 0; i < element.size(); i++) {
			if (i > num) {
				System.out.println(
						"clicked element number : " + i + " & Name of the value : " + element.get(i).getText());
				new WebDriverWait(driver, Duration.ofSeconds(30))
						.until(ExpectedConditions.elementToBeClickable(element.get(i)));
				element.get(i).click();
				break;
			}
		}

	}

	// element click by name of value
	public void elementsClickByValue(List<WebElement> ele, String value) {
		List<WebElement> element = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(ele));
		for (WebElement myValue : element) {
			if (myValue.getText().contains(value)) {
				System.out.println("Selected value details : " + myValue.getText());
				new WebDriverWait(driver, Duration.ofSeconds(30))
						.until(ExpectedConditions.elementToBeClickable(myValue));
				myValue.click();
				break;
			}
		}
	}

	public static void sendKysByJavaScript(WebElement elem, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(elem));
		js.executeScript("arguments[0].setAttribute('value', '" + text + "')", elem);
	}

	@SuppressWarnings("unused")
	public static void multipleClick(WebElement elem) {
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(elem));
		for (int i = 0; i <= 20; i++) {
			elem.click();
			break;
		}
	}
}