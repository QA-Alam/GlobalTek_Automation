package globaltek.usa.hooks;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class For_Sale_Page {
	public static String value;

	public static void getPropertiesPrice2() {
		List<WebElement> price = Hooks.driver.findElements(By.xpath("//*[@class='c-bTssUX']"));
		System.out.println("Total number of properties  : " + price.size());
		for (WebElement value : price) {
			String priceValue = value.getText();
			System.out.println("Price of properties  : " + priceValue);
		}
	}

	
	
	
	// How you find out specific element from web site
	// how you can handle multiple element from DOM page
	public static List<WebElement> selectProperties(int num) {
		// First i take help from list interface, declare find elements & passing the
		// dynamic xpath
		List<WebElement> element = Hooks.driver.findElements(By.xpath("//*[@class='c-bTssUX']"));
		// WaitHelper.waitVisibilityOfAllElements(element);

		// I am use the looping concept for take the control of all the web elements
		for (int i = 1; i < element.size(); i++) {
			// Then i have to use java condition, inside the condition i have to pass i >
			// require number
			// Which element i want to click
			if (i > num) { // 6
				 value = element.get(i).getText();
				System.out.println("Selected property number is :: " + i);
				System.out.println("Selected property price is :: " + value);

				// help with get method i am clicking the element
				element.get(i).click();
				// after condition satisfy i have break the loop
				// that's pretty much about dynamic elements handling option
				break;
			}
		}
		return element;
	}
}
