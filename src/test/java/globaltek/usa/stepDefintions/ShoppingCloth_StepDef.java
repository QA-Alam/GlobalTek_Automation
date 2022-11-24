package globaltek.usa.stepDefintions;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import globaltek.usa.basepage.BasePage;
import globaltek.usa.elementpage.ShoppingClothPage;

public class ShoppingCloth_StepDef extends BasePage {
	ShoppingClothPage pf;
	
	@Given("^User is already in-home page and verify user information$")
	public void user_is_already_in_home_page_and_verify_user_information() {
		pf = PageFactory.initElements(driver, ShoppingClothPage.class);
		pf.getLogin();
	}

	@When("^User can select Jackets from men dropdown$")
	public void user_can_select_Jackets_from_men_dropdown() {
	    
	    
	}

	@When("^User can verify Jupiter All-Weather Trainer is on the screen and click on it$")
	public void user_can_verify_Jupiter_All_Weather_Trainer_is_on_the_screen_and_click_on_it() {
	    
	    
	}

	@When("^User can select the M and select the Green$")
	public void user_can_select_the_M_and_select_the_Green() {
	    
	    
	}

	@When("^User can select the <Quantity >$")
	public void user_can_select_the_Quantity() {
	    
	    
	}

	@When("^User can click on addToCart$")
	public void user_can_click_on_addToCart() {
	    
	    
	}

	@When("^User can click on upper right corner cart and click on Checkout$")
	public void user_can_click_on_upper_right_corner_cart_and_click_on_Checkout() {
	    
	    
	}

	@When("^User can add address and click on ship here$")
	public void user_can_add_address_and_click_on_ship_here() {
	    
	    
	}

	@When("^User can select shipping method and click on next$")
	public void user_can_select_shipping_method_and_click_on_next() {
	    
	    
	}

	@When("^User able to click on place order$")
	public void user_able_to_click_on_place_order() {
	    
	    
	}

	@Then("^User can verify the Your order number and text on the screen \"([^\"]*)\"$")
	public void user_can_verify_the_Your_order_number_and_text_on_the_screen(String text) {
	    
	    
	}
}
