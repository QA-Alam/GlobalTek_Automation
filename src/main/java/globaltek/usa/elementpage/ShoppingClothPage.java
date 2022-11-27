package globaltek.usa.elementpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globaltek.usa.basepage.SupperClass;

public class ShoppingClothPage extends SupperClass{

	public ShoppingClothPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='email']")
	@CacheLookup
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(xpath = "//*[@id='pass']")
	@CacheLookup
	private WebElement passWord;

	public WebElement getpassWord() {
		return passWord;
	}

	@FindBy(linkText = "Sign In")
	@CacheLookup
	private WebElement clickSignIn;

	public WebElement getclickSignIn() {
		return clickSignIn;

	}

	@FindBy(xpath = "(//*[text()='Sign In'])[1]")
	@CacheLookup
	private WebElement clickLogIn;

	public WebElement getclickclickLogIn() {
		return clickLogIn;
	}

	@FindBy(xpath = "(//*[text()='Sign In'])[1]")
	@CacheLookup
	private WebElement verifyUserInfo;

	public WebElement getVerifyUserInfo() {
		return verifyUserInfo;
	}
	
	//(//*[@class='logged-in'])[1]
	public void getLogin() {
		getclickSignIn().click();
		getUserName().sendKeys(prop.getProperty("userName"));
		getpassWord().sendKeys(prop.getProperty("textPassword"));
		getclickclickLogIn().click();
	}
}
