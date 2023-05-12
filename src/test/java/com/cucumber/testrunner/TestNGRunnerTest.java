		
package com.cucumber.testrunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/resources/features",
				  glue = {"com.cucumber.stepdef", "com.cucumber.hooks"},
				  plugin = {"pretty",
						  "html:target/html-report.html",
						  "json:target/json-report.json",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				  },
				  dryRun = false,
				  monochrome = true
				 
		)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {
			
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}