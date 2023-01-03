package globaltek.usa.hooks;



import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import globalteck.usa.utility.CommonUtil;
import globaltek.usa.basepage.SupperClass;


public class Hooks extends SupperClass {
    
	public Scenario scenario;

	@Before
	public void suiteSetup()  { 
		initialization();
		logger.info("");
		logger.info("...........START AUTOMATION.............");
		logger.info("");
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
		CommonUtil.getScreenshot(driver, scenario);
		}		driver.quit();
		logger.info("");
		logger.info("...........END AUTOMATION.............");
		logger.info("");
	}

}
