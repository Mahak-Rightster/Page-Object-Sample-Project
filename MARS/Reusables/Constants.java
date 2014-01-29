package Reusables;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

public class Constants{
	public static final String TestDataFileLocation = "C:\\Users\\rightster\\Documents\\MARSTestInput1405.xls";
	public static final String FuncTest_URL = "";
	public static final String LogInScreen_URL = "/user/login";
	private static final String SIGN_OUT_XPATH = "html/body/div[1]/div/header/div/div/div[3]/a";
	public static final String PAGE_TITLE_EPG_SCREEN = "P";
	

	
	Base base = new Base();
	
	public WebElement SignOutLocator()
	{
		
		WebElement element = base.FindElementByXpath(getSignOutXpath());
		return element;
	}
	
	
	
		
		
	
	public static String GetCountryInputID(String CountryName)
	{
		String ContinentXpath = country.get(CountryName);
		return ContinentXpath;
	}









	
	
	public static String getFunctestUrl() {
		return FuncTest_URL;
	}
	public static String getLoginscreenUrl() {
		return LogInScreen_URL;
	}




	public static String getSignOutXpath() {
		return SIGN_OUT_XPATH;
	}
	
	

}
