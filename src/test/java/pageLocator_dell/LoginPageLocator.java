package pageLocator_dell;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util_dell.utilTestBase;

public class LoginPageLocator extends utilTestBase{

	public LoginPageLocator() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	
	@FindBy(how=How.ID, using= "EmailAddress")
	public WebElement EmailAddress;
	
	@FindBy(how=How.ID, using= "Password")
	public WebElement Password;
	
	@FindBy(how=How.XPATH, using= "//button[@id='sign-in-button']")
	public WebElement Login;
	
	@FindBy(how=How.XPATH, using= "//span[text()='Farhana']")
	public WebElement VerifyLogin;
	
	
	
	
	
	
	
}
