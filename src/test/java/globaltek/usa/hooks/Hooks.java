package globaltek.usa.hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zoopla.co.uk/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alammohammed79@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SAYEDawan2008@");
		driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
