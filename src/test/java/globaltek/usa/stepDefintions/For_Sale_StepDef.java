package globaltek.usa.stepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import globaltek.usa.hooks.For_Sale_Page;
import globaltek.usa.hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class For_Sale_StepDef {

	@Given("^User already loging the application$")
	public void user_already_loging_the_application() throws InterruptedException {
         Thread.sleep(3000);
		String actualResult = "Welcome back to your account";
		WebElement ele = Hooks.driver.findElement(By.xpath("//*[text()='Welcome back to your account']"));
		String expected = ele.getText();
		Assert.assertEquals(actualResult, expected);
		System.out.println("My Expected result is : " + expected);

	}

	@When("^Users are able to click on for sale module$")
	public void users_are_able_to_click_on_for_sale_module() throws InterruptedException {
		Thread.sleep(3000);
		Hooks.driver.findElement(By.linkText("For sale")).click();
	}

	@When("^Enter the desired location on the search box and hit enter$")
	public void enter_the_desired_location_on_the_search_box_and_hit_enter() {

		WebElement ele = Hooks.driver.findElement(By.xpath("//input[contains(text(),'')]"));
		ele.sendKeys("New York, Lincolnshire");
		ele.sendKeys(Keys.ENTER);

	}

	@When("^Print-Out all the price list in the console$")
	public void print_Out_all_the_price_list_in_the_console() {

		For_Sale_Page.getPropertiesPrice2();
	}

	@When("^Select (\\d+)nd number property and store the price$")
	public void select_nd_number_property_and_store_the_price(int num) {
		For_Sale_Page.selectProperties(2);

	}

	@Then("^Verify the stored price with expected price$")
	public void verify_the_stored_price_with_expected_price() {
		Assert.assertEquals(For_Sale_Page.value, Hooks.driver.findElement(By.xpath("(//*[@class='c-dPyNJo'])[1]")).getText());
		System.out.println("My Actual result is a : " + For_Sale_Page.value + " My Expected result is a : "
				+ Hooks.driver.findElement(By.xpath("(//*[@class='c-dPyNJo'])[1]")).getText());
	}
	@Then("^Verify the agent informations on the grid$")
	public void verify_the_agent_informations_on_the_grid() {
		System.out.println(
				"House details : " + Hooks.driver.findElement(By.xpath("(//*[@class='c-dPyNJo'])[2]")).getText());
	}
}
