package globaltek.usa.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(	
		plugin = {"pretty","json:target/cucumber.json"},
		features = ".//Features/", 
        glue = {"globaltek.usa.stepDefintions","globaltek.usa.hooks"},
        tags = "@Sanity"
		)
public class MyRunner extends AbstractTestNGCucumberTests{

}
