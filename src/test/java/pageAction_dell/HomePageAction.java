package pageAction_dell;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import pageLocator_dell.HomePageLocator;
import util_dell.utilTestBase;
import util_dell.utilTestData;

public class HomePageAction extends utilTestBase{
	
	HomePageLocator homePageLocator = new HomePageLocator(); //create an object of the class: 
															//since pageAction is creating methods for each locator 
															//hence classname is same as pageLocator classname
	//method for each step in the test case
	public void EnterXPSinSearchField() {
		//homePageLocator.SearchField.sendKeys("xps");
		homePageLocator.SearchField.sendKeys(utilTestData.laptop);//to make the input dynamic
	}
	
	public void ClickonSearchLink() {
		Actions ac = new Actions(driver);
		ac.moveToElement(homePageLocator.SearchLink).build().perform();
		
		
	}
	
	public void Verifysearchresultdisplay() {
		
		boolean searchResult = homePageLocator.VerifySearchResult.isDisplayed();
		Assert.assertTrue(searchResult);
		System.out.println("Find results can be viewed");
	}
	
	
	
	public void ClickonSignInbutton() {
		homePageLocator.SignInButton.click();
		
	}
	
	public void ClickonSignInlink() {
		homePageLocator.SignInLink.click();
	}
	
}
