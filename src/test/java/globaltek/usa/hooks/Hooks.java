package globaltek.usa.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void setUP() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zoopla.co.uk/");
		driver.manage().deleteAllCookies();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Accept all cookies']")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		// if element found then we will use- In this example I just called isDisplayed method
		boolean status = element.isDisplayed();
		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}
		
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alammohammed79@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SAYEDawan2008@");
		driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
		
	}
	//@After
	public void tearDown() {
		driver.quit();
	}
}
