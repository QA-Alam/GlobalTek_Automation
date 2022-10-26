package globaltek.usa.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
		plugin = {"pretty","json:target/cucumber.json"},
		features = ".//Features/", 
        glue = {"globaltek.usa.stepDefintions","globaltek.usa.hooks"},  
        tags = "@Sanity"
		)
public class MyRunner extends AbstractTestNGCucumberTests{

}
