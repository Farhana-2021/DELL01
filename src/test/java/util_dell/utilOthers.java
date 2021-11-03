package util_dell;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilOthers {

	public static long implicitlyWait_wait = 30;
	public static long pageLoadTimeout_wait = 20;

	
public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String correntdir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(correntdir+"/Screenshots/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}	 