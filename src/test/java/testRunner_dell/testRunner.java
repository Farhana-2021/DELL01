package testRunner_dell;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import util_dell.utilTestBase;

@CucumberOptions(features = {"src\\test\\resources\\features_dell"} , 
plugin = {"json:target/cucumber.json"},
glue = {"stepDefinition_dell"},
tags= {"@TestCase01"})



public class testRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void LaunchApplicationURL() {
		
		utilTestBase launch = new utilTestBase();
		launch.initialize();
	}
	
	@AfterTest
	public void CloseApplicationURL() {
		
		utilTestBase close = new utilTestBase();
		close.driver.quit();
	}
	
	
	
}
