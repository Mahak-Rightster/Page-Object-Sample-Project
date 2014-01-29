package Reusables;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

public class Constants{
	public static final String TestDataFileLocation = "C:\\Users\\rightster\\Documents\\MARSTestInput1405.xls";
	public static final String FuncTest_URL = "https://176.34.240.152";
	public static final String LogInScreen_URL = "/user/login";
	private static final String SIGN_OUT_XPATH = "html/body/div[1]/div/header/div/div/div[3]/a";
	public static final String PAGE_TITLE_EPG_SCREEN = "Programme Guide - Live Sports - Rightster";
	
	//country Xpaths to be used when setting restrictions
	public static final String AFRICA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[1]/a";
	public static final String ASIA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[3]/a";	
	public static final String EUROPE_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[7]";
	public static final String NORTHAMERICA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[11]/a";
	public static final String OCEANIA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[12]/a";
	public static final String SOUTHAMERICA_DROP_DOWN_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[14]/a";
	
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
