package stepDefinition_dell;

import org.testng.log4testng.Logger;

import cucumber.api.java.en.Then;
import pageAction_dell.HomePageAction;
import pageAction_dell.LoginPageAction;
import util_dell.LogsHelper;
import util_dell.utilOthers;
import util_dell.utilTestBase;

public class stepDefinitionLoginPage extends utilTestBase{

	LoginPageAction loginPageAction = new LoginPageAction();
	HomePageAction homePageAction = new HomePageAction();
	//Logger loggs = LogsHelper.getLogs(LogsHelper.class);
	
	@Then("^Click on Sign In button$")
	public void click_on_Sign_In_button() throws Throwable {
		homePageAction.ClickonSignInbutton();
		//loggs.info("Clicking Sign in button");
	}

	@Then("^Click on Sign In link$")
	public void click_on_Sign_In_link() throws Throwable {
		homePageAction.ClickonSignInlink();
		//loggs.info("Clicking sign in link");
	}

	@Then("^Enter username and password and click$")
	public void enter_username_and_password_and_click() throws Throwable {
		loginPageAction.userCredential(prop.getProperty("username1"), prop.getProperty("password1"));
		//loggs.info("Login Page");
	}

	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
		loginPageAction.Verifyusercanlogin();
		utilOthers.takescreenshot(driver, "User Profile Page");
		//loggs.info("User can login");
	}
	
	
	
}
