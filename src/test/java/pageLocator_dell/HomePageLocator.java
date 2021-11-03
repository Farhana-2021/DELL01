package pageLocator_dell;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util_dell.utilTestBase;

public class HomePageLocator extends utilTestBase{


	public HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	//Locators for each step in the test case @TestCase01
	@FindBy(how=How.ID, using= "mh-search-input")
	public WebElement SearchField;
	
	
	@FindBy(how=How.XPATH, using= "//button[@class='mh-search-btn mh-search-submit']")
	public WebElement SearchLink;
	
	
	@FindBy(how=How.XPATH, using= "//div[@class='anavmfe__facets__wrapper']")
	public WebElement VerifySearchResult;
	
	
	
	
	@FindBy(how=How.ID, using= "um-si-label")
	public WebElement SignInButton;
	
	@FindBy(how=How.XPATH, using= "//a[@class='mh-btn mh-btn-primary navigate']")
	public WebElement SignInLink;
	
	
}
