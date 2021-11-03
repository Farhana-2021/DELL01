package stepDefinition_dell;









import org.testng.log4testng.Logger;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageAction_dell.HomePageAction;
import util_dell.LogsHelper;
import util_dell.utilOthers;
import util_dell.utilTestBase;

public class stepDefinitionHomePage extends utilTestBase{
	
	HomePageAction homePageAction = new HomePageAction();	
	Logger loggs = LogsHelper.getLogs(LogsHelper.class);
	
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
					
		ApplicationLaunch(URL);
		utilOthers.takescreenshot(driver, "Home Page");
		loggs.info("Opening URL");
	}

	@Then("^Enter XPS in Search Field$")
	public void enter_XPS_in_Search_Field() throws Throwable {
	    
		homePageAction.EnterXPSinSearchField();
		loggs.info("Entering name of product");
	
	}

	@Then("^Click on SearchLink$")
	public void click_on_SearchLink() throws Throwable {
	    
		homePageAction.ClickonSearchLink();
		loggs.info("Clicking search link");
		
	}

	@Then("^Verify search result display$")
	public void verify_search_result_display() throws Throwable {
	    
		homePageAction.Verifysearchresultdisplay();
		utilOthers.takescreenshot(driver, "Search Result Page");
		loggs.info("Search result page");
	}


}
