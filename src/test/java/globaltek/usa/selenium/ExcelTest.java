/*
package globaltek.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.util.TestUtil;

public class ExcelTest {

	
	// page factory class
        public void enterShippingAddrees(String fName, String lName, String company, String Address, String city,
			String zipcode, String phone) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		comPany.sendKeys(company);
		address.sendKeys(Address);
		City.sendKeys(city);
		zipCode.sendKeys(zipcode);
		phoneNum.sendKeys(phone);
	}
	
	
	// Test class
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String title, String firstName, String lastName, String company){
		homePage.clickOnNewContactLink();
		//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
		contactsPage.createNewContact(title, firstName, lastName, company);
		
	}
}
 */