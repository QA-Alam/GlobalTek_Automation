package globaltek.usa.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// How to handle multiple elements
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
	
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='central-featured']/div"));
		System.out.println("Total number of language  : " + ele.size());
		Thread.sleep(300);
		for (WebElement value : ele) {
			if (value.getText().equalsIgnoreCase("Español") || value.getText().contains("Español")) {
				System.out.println("Selected Languag name is  : " + value.getText());
				Thread.sleep(300);
				value.click();
				break;
			}

		}

		// How to handle drop down 1st way
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");

		Select fruits = new Select(driver.findElement(By.id("searchLanguage")));
		fruits.selectByVisibleText("বাংলা");
		Thread.sleep(300);

		// How to handle drop down 2nd way
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");

		List<WebElement> suggestionResults = driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
		System.out.println("Total number of language  : " + suggestionResults.size());
		for (WebElement result : suggestionResults) {
			System.out.println("Languag name is : " + result.getText());
		/*	if (result.getText().equalsIgnoreCase("বাংলা") && result.getText().contains("বাংলা")) {
				System.out.println("Selected Languag name is  : " + result.getText());
				Thread.sleep(300);
				result.click();
				break;
			} */
			
		}

	}
}
