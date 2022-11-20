package globaltek.usa.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globaltek.usa.basepage.BasePage;

public class ElementLoginPage extends BasePage{
	
	// Constructor invoke implicitly
	public ElementLoginPage() {
		// PageFactory = Class
		// initElements it's a predefine method from
		// Selenium to invoke page factory concept

		// driver -> instance from web driver
		// this key word from java which one refer the current class properties
		PageFactory.initElements(driver, this);
	}

	// How to store the locator
	// By using @FindBy annotation
	@FindBy(xpath = "//*[@name='username']")
	// What is the @CacheLookup annotation
	// CacheLookup one of the annotation which can
	// lookup the computer cash memory to run testcaes more faster way
	@CacheLookup

	// What is the private
	// It's a access modifier

	// Why do you use private access modifier
	// In order to implement encapsulation concept

	// why you use encapsulation concept?
	// keep secure our data
	private WebElement userName;

	// What is the WebElement?
	// WebElement is interface

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(xpath = "//*[@type='password']")
	@CacheLookup
	private WebElement passWord;

	public WebElement getpassWord() {
		return passWord;
	}
	
	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	private WebElement clickSignIn;

	public WebElement getclickSignIn() {
		return clickSignIn;
	}
}
