package Objects;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;


import Reusables.Base;

public class CreatePropertyObject {
	
	Base base = new Base();
	SignInObject signin = new SignInObject();
	
	//Values Details Tab
	public static final String VALUE_DESCRIPTION_FIELD = "Property Description";
	public static final String VALUE_COMPANY_NAME_FIELD = "Wrongster";
	public static final String VALUE_CONTACT_FIELD = "Mahak";
	public static final String VALUE_JOB_TITLE_FIELD = "QA";
	public static final String VALUE_EMAIL_FIELD = "mahak@rightster.com";
	public static final String VALUE_TELEPHONE_FIELD = "987654321";
	
	
	public static final String PAGE_TITLE_CREATE_PROPERTY = "Create Property - Live Sports - Rightster";
	
	public static final String EVENTS_TAB_XPATH = "html/body/div[1]/div/header/div/nav/ul/li[1]/a";
	public static final String EVENTS_AND_PROPERTIES_XPATH = "html/body/div[1]/div/div[2]/ul/li[1]/a";
	public static final String PROPERTIES_SUBTAB_XPATH = "html/body/div[1]/div/div[2]/form/section/aside/div[1]/ul/li[2]/a/b";
	public static final String CREATE_PROPERTY_XPATH = "html/body/div[1]/div/div[2]/ul/li[3]/a";
	
	//Details Tab XPATH
	public static final String PROPERTY_NAME_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/input";
	public static final String DESCRIPTION_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[3]/textarea";
	public static final String SLATE_DURATION_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[6]/input";
	public static final String EVENT_DURATION_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[7]/input";
	public static final String ENCODING_AFL_MODULE_RADIO_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[9]/span/input[1]";
	public static final String ENCODING_IMG_MODULE_RADIO_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[9]/span/input[2]";
	public static final String COMPANY_NAME_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[11]/input";
	public static final String CONTACT_NAME_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[12]/input";
	public static final String JOB_TITLE_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[13]/input";
	public static final String EMAIL_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[14]/input";
	public static final String TELEPHONE_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[15]/input";
	public static final String CONTINUE_BUTTON_DETAILS_TAB_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[16]/input";
	
	//Restrictions Tab XPATH
	
	public static final String RESTRICTIONS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[2]/a";
	public static final String ALLOW_ALL_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[1]/div[2]/a[1]";
	public static final String DENY_ALL_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[1]/div[2]/a[2]";
	public static final String IP_WHITELIST_FROM_FIELD_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[5]/div[2]/input[1]";
	public static final String IP_WHITELIST_TO_FIELD_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[5]/div[2]/input[2]";
	public static final String IP_BLACKLIST_FROM_FIELD_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[6]/div[2]/input[1]";
	public static final String IP_BLACKLIST_TO_FIELD_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[6]/div[2]/input[2]";
	public static final String ADD_ANOTHER_IP_RANGE_WHITELIST_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[5]/a";
	public static final String ADD_ANOTHER_IP_RANGE_BLACKLIST_XPATH =  "html/body/div[1]/div/div[2]/div[1]/form/div[6]/a";
	public static final String CONTINUE_BUTTON_RESTRICTIONS_TAB_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[9]/input";
	public static final String SUMMARY_LIST_ALLOWED_COUNTRIES_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[3]/div[2]/span";
	
	public static final String REGION_AFRICA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[1]/a";
	public static final String REGION_ANTARTICA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[2]/a";
	public static final String REGION_ASIA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[3]/a";
	public static final String REGION_EUROPE_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[7]/a";
	public static final String REGION_NORTH_AMERICA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[11]/a";
	public static final String REGION_OCEANIA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[12]/a";
	public static final String REGION_SCANDINAVIA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[13]/a"; 
	public static final String REGION_SOUTH_AMERICA_XPATH = "html/body/div[1]/div/div[2]/div[1]/form/div[2]/h3[14]/a";
	
	//Events Tab Xpath
	
	public static final String CREATE_EVENT_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[1]/div[1]/a";
	
	
	
	
	
	
	public WebElement EventsTabLocator()
	{
		WebElement element = base.FindElementByXpath(EVENTS_TAB_XPATH);
		return element;
	}
	
	public WebElement CreatePropertyTabLocator()
	{
		WebElement element = base.FindElementByXpath(CREATE_PROPERTY_XPATH);
		return element;
	}
	
	//Details tab locator
	public WebElement PropertyNameTextFieldLocator()
	{
		WebElement element = base.FindElementByXpath(PROPERTY_NAME_XPATH);
		return element;
	}
	
	public WebElement DescriptionTextAreaLocator()
	{
		WebElement element = base.FindElementByXpath(DESCRIPTION_XPATH);
		return element;
	}
	
	public WebElement SlateDurationTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(SLATE_DURATION_XPATH);
		return element;
	}
	
	public WebElement EventDurationTextBoxLocator1()
	{
		WebElement element = base.FindElementByXpath(EVENT_DURATION_XPATH);
		return element;
	}
	
	public WebElement AFLEncodingSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(ENCODING_AFL_MODULE_RADIO_BUTTON_XPATH);
		return element;
	}
	
	public WebElement IMGEncodingSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(ENCODING_IMG_MODULE_RADIO_BUTTON_XPATH);
		return element;
	}
	
	public WebElement CompanyNameTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(COMPANY_NAME_XPATH);
		return element;
	}
	
	public WebElement ContactTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(CONTACT_NAME_XPATH);
		return element;
	}
	
	public WebElement JobTitleTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(JOB_TITLE_XPATH);
		return element;
	}
	
	public WebElement EmailTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(EMAIL_XPATH);
		return element;
	}
	
	public WebElement TelephoneTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(TELEPHONE_XPATH);
		return element;
	}
	
	public WebElement ContinueButtonDetailsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CONTINUE_BUTTON_DETAILS_TAB_XPATH);
		return element;
	}
	
	//Restriction tab locators
	
	public WebElement RestrictionsTabLocator()
	{
		WebElement element = base.FindElementByXpath(RESTRICTIONS_TAB_XPATH);
		return element;
	}
	
	public WebElement AllowAllLinkLocator()
	{
		WebElement element = base.FindElementByXpath(ALLOW_ALL_XPATH);
		return element;
	}
	
	public WebElement DenyAllLinkLocator()
	{
		WebElement element = base.FindElementByXpath(DENY_ALL_XPATH);
		return element;
	}
	
	public WebElement FromFieldWhiteListIPLocator()
	{
		WebElement element = base.FindElementByXpath(IP_WHITELIST_FROM_FIELD_XPATH);
		return element;
	}
	
	public WebElement ToFieldWhiteListIPLocator()
	{
		WebElement element = base.FindElementByXpath(IP_WHITELIST_TO_FIELD_XPATH);
		return element;
	}
	
	public WebElement FromFieldBlackListIPLocator()
	{
		WebElement element = base.FindElementByXpath(IP_BLACKLIST_FROM_FIELD_XPATH);
		return element;
	}
	
	public WebElement ToFieldBlackListIPLocator()
	{
		WebElement element = base.FindElementByXpath(IP_BLACKLIST_TO_FIELD_XPATH);
		return element;
	}
	
	public WebElement AddAnotherWhitelistIPLocator()
	{
		WebElement element = base.FindElementByXpath(ADD_ANOTHER_IP_RANGE_WHITELIST_XPATH);
		return element;
	}
	
	public WebElement AddAnotherBlacklistIPLocator()
	{
		WebElement element = base.FindElementByXpath(ADD_ANOTHER_IP_RANGE_BLACKLIST_XPATH);
		return element;
	}
	
	public WebElement ContinueButtonRestrictionsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CONTINUE_BUTTON_RESTRICTIONS_TAB_XPATH);
		return element;
	}
	
	public WebElement WhitelistedCountriesSummaryListLocator()
	{
		WebElement element = base.FindElementByXpath(SUMMARY_LIST_ALLOWED_COUNTRIES_XPATH);
		return element;
	}
	
	public WebElement AfricaRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_AFRICA_XPATH);
		return element;
	}
	
	public WebElement AnatarticaRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_ANTARTICA_XPATH);
		return element;
	}
	
	public WebElement AsiaRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_ASIA_XPATH);
		return element;
	}
	
	public WebElement EuropeRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_EUROPE_XPATH);
		return element;
	}
	
	public WebElement OceaniaRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_OCEANIA_XPATH);
		return element;
	}
	
	public WebElement ScandivaniRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_SCANDINAVIA_XPATH);
		return element;
	}
	
	public WebElement SouthAmericaRegionSelectorLocator()
	{
		WebElement element = base.FindElementByXpath(REGION_SOUTH_AMERICA_XPATH);
		return element;
	}
	
	
	
	
	public String ReachCreateProperty() throws Exception
	{
		
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		String Title;
		Title = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		base.assertPageTitleSame(ExpectedTitle, Title);
		base.WaitforElementPresentByXpath(EVENTS_TAB_XPATH);
		base.click(EventsTabLocator());
		base.WaitforElementPresentByXpath(CREATE_PROPERTY_XPATH);
		base.click(CreatePropertyTabLocator());
		String CreateAccountPageTitle = base.getTitle();
		return CreateAccountPageTitle;
		
	}
	
	public void EnterValuesDetailsTabPass(String PropertyName, String Category, String SlateDuration, String EventDuration, String EncodingService) throws Exception
	{
		String ExpectedTitle = PAGE_TITLE_CREATE_PROPERTY;
		String ReturnedTitle = ReachCreateProperty();
		base.assertPageTitleSame(ExpectedTitle, ReturnedTitle);
		base.WaitforElementPresentByXpath(PROPERTY_NAME_XPATH);
		base.EnterValueInTextField(PropertyNameTextFieldLocator(), PropertyName);
		base.EnterValueInTextField(DescriptionTextAreaLocator(), VALUE_DESCRIPTION_FIELD);
		base.SelectOptionFromADropdown(Category);
		base.EnterValueInTextField(SlateDurationTextBoxLocator(), SlateDuration);
		base.EnterValueInTextField(EventDurationTextBoxLocator1(), EventDuration);
		base.EnterValueInTextField(CompanyNameTextBoxLocator(), VALUE_COMPANY_NAME_FIELD);
		base.EnterValueInTextField(ContactTextBoxLocator(), VALUE_CONTACT_FIELD);
		base.EnterValueInTextField(JobTitleTextBoxLocator(), VALUE_JOB_TITLE_FIELD);
		base.EnterValueInTextField(EmailTextBoxLocator(), VALUE_EMAIL_FIELD);
		base.EnterValueInTextField(TelephoneTextBoxLocator(), VALUE_TELEPHONE_FIELD);
		//String EncodingServiceForTheProperty = EncodingService;
		
		if("AFL".equalsIgnoreCase(EncodingService))
		{
			base.click(AFLEncodingSelectorLocator());
			Thread.sleep(2000);
			base.PressEscape();
			
		}
		else if("IMG".equalsIgnoreCase(EncodingService))
		{
			base.click(IMGEncodingSelectorLocator());
			Thread.sleep(2000);
			base.PressEscape();
		
		}
		base.click(ContinueButtonDetailsTabLocator());
		
	}
	
	public void EnterValueRestrictionsTabPassALLorNONE(String CountriesAllowed, String WhiteListIPFrom, String WhiteListIPTo, String BlackListIPFrom, String BlackListIPTo)
	{
		
		if("ALL".equalsIgnoreCase(CountriesAllowed))
		{
			base.click(AllowAllLinkLocator());
		}
		
		else if("NONE".equalsIgnoreCase(CountriesAllowed))
		{
			base.click(DenyAllLinkLocator());
		}
		
		base.EnterValueInTextField(FromFieldWhiteListIPLocator(), WhiteListIPFrom);
		base.EnterValueInTextField(ToFieldWhiteListIPLocator(), WhiteListIPTo);
		base.EnterValueInTextField(FromFieldBlackListIPLocator(), BlackListIPFrom);
		base.EnterValueInTextField(ToFieldBlackListIPLocator(), BlackListIPTo);
		base.click(ContinueButtonRestrictionsTabLocator());
		
		
	}
	
	public void EnterValueRestrictionsTabPassThreeCountriesAllowed(ArrayList<String> CountriesAllowed, String WhiteListIPFrom, String WhiteListIPTo, String BlackListIPFrom, String BlackListIPTo) throws InterruptedException
	{
		base.SetCountryRestrictions(CountriesAllowed);
		base.EnterValueInTextField(FromFieldWhiteListIPLocator(), WhiteListIPFrom);
		base.EnterValueInTextField(ToFieldWhiteListIPLocator(), WhiteListIPTo);
		base.EnterValueInTextField(FromFieldBlackListIPLocator(), BlackListIPFrom);
		base.EnterValueInTextField(ToFieldBlackListIPLocator(), BlackListIPTo);
		base.WaitforElementPresentByXpath(CONTINUE_BUTTON_RESTRICTIONS_TAB_XPATH);
		base.click(ContinueButtonRestrictionsTabLocator());
		
		
	}
	

}
