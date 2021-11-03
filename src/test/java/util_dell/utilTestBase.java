package util_dell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilTestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public utilTestBase() {//Constructor creation to initialize the configuration file 
							//To create constuctor we need to create two methods for these two classes:Properties and FileInputStream
	
		
			try {
				
				System.out.println("we are inside constructor BEFORE file input steam");
				
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\configuration_dell\\config.properties");
				
				System.out.println("we are inside constructor AFTER file input steam");//link from src of configuration file
			
				prop = new Properties();//make properties global
				
				prop.load(fis);
				
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//To Set-up browser
	//First initialize the browser
	public void initialize() {
		
		String browsername = prop.getProperty("browser1");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 																				//path of chromedriver in the project's driver folder
			driver = new ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(utilOthers.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(utilOthers.pageLoadTimeout_wait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//Alert alertCancel = driver.switchTo().alert();
			//alertCancel.dismiss();
			//driver.switchTo().alert().dismiss();
	
			System.out.println("The Chrome browser WAS FOUND");
		}
		
		else if (browsername.equals("FF")) {
			System.out.println("The browser found is FF");
		}
		
		else {
			System.out.println("No browser was found");
		}
	}
	
	//Launching URL
	public static void ApplicationLaunch(String URL) {		
		
		driver.get(prop.getProperty("url_QA"));//prop used to make the method dynamic
		
		
	}
	
	
		
	
}
