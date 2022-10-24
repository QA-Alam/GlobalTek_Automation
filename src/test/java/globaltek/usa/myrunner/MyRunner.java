package globaltek.usa.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(	
		plugin = {"pretty","json:target/cucumber.json"},
		features = ".//Features/", // features = location of Features folder,where i added all feature files
glue = {"globaltek.usa.stepDefintions","globaltek.usa.hooks"},  
       //glue = step definition location and hooks package location 
tags = "@Sanity"
		)
public class MyRunner extends AbstractTestNGCucumberTests{

}
