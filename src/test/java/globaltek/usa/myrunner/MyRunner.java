package globaltek.usa.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(	
		plugin = {"pretty","json:target/cucumber.json"},
		features = ".//Features/", 
        glue = {"globaltek.usa.stepDefintions","globaltek.usa.hooks"},
        dryRun = false, 
        // dryRun true -> stop existing test and extra step out come pass
        // dryRun false -> existing test run and extra step out come pass
        monochrome = true,  //true, read the test case in consul      
        // strict false -> existing test run and extra step out come pass
        // strict true -> existing test fail and extra step out come failed
        strict = false,
        tags = "@Sanity"       
		)
public class MyRunner extends AbstractTestNGCucumberTests{

}
