package globaltek.usa.stepDefintions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import globaltek.usa.basepage.BasePage;
import globaltek.usa.elementpage.ElementLoginPage;
import globaltek.usa.hooks.Hooks;


public class For_Sale_StepDef extends BasePage {
	ElementLoginPage pf;
	//ElementLoginPage obj;

	@Given("^User able to enter the userName and passWord$")
	public void user_able_to_enter_the_userName_and_passWord() {
		pf = PageFactory.initElements(driver, ElementLoginPage.class);
		
	   // obj = new ElementLoginPage();
		
		pf.getUserName().sendKeys("Admin");
		pf.getpassWord().sendKeys("admin123");
	}
	
	@When("^User able to click on sign in BTN$")
	public void user_able_to_click_on_sign_in_BTN() {
		//pf.getclickSignIn().click();
	}
	@Then("^User can verify the page title$")
	public void user_can_verify_the_page_title() {
		System.out.println(Hooks.driver.getTitle());
	}
	
}
