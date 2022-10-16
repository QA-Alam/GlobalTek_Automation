package seleniumchallenges;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {

	public static void main(String[] args) {

		// How to open the browser in selenium?
		// System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		// WebDriver driver = new ChromeDriver(); // Up-casting

		// How do you ignore the browser version?
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Up-casting
		// How to enter the URL?
		// Ans: I can enter the url with the help of get method as well as navigate
		// method

		// What is the deference between get & navigate?
		// Ans: Get method just enter the url and open the application
		// Other hand get navigate method can help us to do some extra features
		// like forward, backword refresh and manymore
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// How to maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String Actual = "Paul Collings"; // Actual value requirement form my document
		String expected = driver.findElement(By.linkText("Paul Collings")).getText(); // Expected result
		// Assertion from testNG for validation Expected and Actual matching or not
		Assert.assertEquals(Actual, expected);
		System.out.println("Expected & Actual are match : " + expected);

		// How to close the browser?
		// Ans: I can close the browsers with the help of close method as well as quit
		// method

		// What is the deference between close & quit method
		// Close method only close the browser
		// Other hand quit method close the browser as well as server

		// driver.close();
		// driver.quit();

		// Do you use IE browser in your automation?
		// Yes, before 6 month ago

		// What are the challenge you face in IE browser during the automation?
		// 1. For browser closing purpose i have to use close method quit method dosen't
		// support
		// 2. Zoom should be 100%
		// 3. All security should be check or un-check
		// 4. Some time other locator not support except css selector

		// How you identify the web elements?
		// Ans: by locator
		// What is the locator?
		// Ans: To identify the web elements
		// Where is the locator located?
		// Ans: In side the DOM page
		// What is the DOM page
		// Document Object Model
		// DOM page contain many languages, 1, HTML, CSS Javascript
		// HTML contain all the text in the web page
		// CSS contain all design -> Color, Logo IMG
		// Javascript contain all functionalities

		// 1. UPS
		// Facebook
		// Zoopla
		// http://automationpractice.com/index.php

	}

}
