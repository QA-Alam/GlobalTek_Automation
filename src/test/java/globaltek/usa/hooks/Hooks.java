package globaltek.usa.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import globaltek.usa.basepage.BasePage;

public class Hooks extends BasePage {

	@Before
	public void setUP() throws InterruptedException {
		System.out.println(" >>>>>>> Automation Start<<<<<< ");
		BasePage.getAutomationStart();

	}

	@After
	public void tearDown() {
		System.out.println(" >>>>>>> Automation End <<<<<< ");
		driver.quit();
	}
}
