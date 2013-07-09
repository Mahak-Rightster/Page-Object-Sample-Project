package Reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.HashMap;


public class DriverLoad 
{
	public static HashMap<String, WebDriver> config = new HashMap<String, WebDriver>();	
	public static WebDriver getFirefox()
		{
		WebDriver driver = new FirefoxDriver();
		config.put("Firefox", driver);
		return driver;
		}

}





