package util_dell;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class LogsHelper {

	private static boolean root=false;
	
	public static Logger getLogs(Class cls) {
		if(root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root=true;
		return Logger.getLogger(cls);
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

