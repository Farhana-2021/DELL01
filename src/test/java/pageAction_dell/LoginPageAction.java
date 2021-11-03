package pageAction_dell;

import org.testng.Assert;

import pageLocator_dell.LoginPageLocator;
import util_dell.utilTestBase;

public class LoginPageAction extends utilTestBase{

	LoginPageLocator loginPageLocator = new LoginPageLocator();
	
		public void userCredential(String u, String p) {
			loginPageLocator.EmailAddress.clear();
			loginPageLocator.Password.clear();
			loginPageLocator.EmailAddress.sendKeys(u);
			loginPageLocator.Password.sendKeys(p);
			loginPageLocator.Login.click();
		}
	
		
		public void Verifyusercanlogin() {
			boolean verification = loginPageLocator.VerifyLogin.isDisplayed();
			Assert.assertTrue(verification);
			//System.out.println("User can login");
		}
	
	
	
}
