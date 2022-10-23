package globaltek.usa.stepDefintions;

import org.openqa.selenium.By;
import cucumber.api.java.en.*;
import globaltek.usa.hooks.Hooks;

public class For_Sale_StepDef{
	
  
	@Given("^User already loging the application$")
	public void user_already_loging_the_application() throws InterruptedException  {
		
		String title = Hooks.driver.getTitle();
	    System.out.println(title);
	   
	    
	}
	@When("^Users are able to click on for sale module$")
	public void users_are_able_to_click_on_for_sale_module()  {
	    
		Hooks.driver.findElement(By.linkText("For sale")).click();
	}
	
	@When("^Enter the desired location on the search box and hit enter$")
	public void enter_the_desired_location_on_the_search_box_and_hit_enter()  {
	    
	    
	}
	@When("^Print-Out all the price list in the console$")
	public void print_Out_all_the_price_list_in_the_console()  {
	    
	    
	}
	@When("^Select (\\d+)nd number property and store the price$")
	public void select_nd_number_property_and_store_the_price(int arg1)  {
	    
	    
	}
	@Then("^Verify the stored price with expected price$")
	public void verify_the_stored_price_with_expected_price()  {
	    
	    
	}
	@Then("^Verify the agent informations on the grid$")
	public void verify_the_agent_informations_on_the_grid()  {
	    
	    
	}
}
