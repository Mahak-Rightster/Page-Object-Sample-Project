package Objects;

import org.openqa.selenium.WebElement;

import Reusables.Base;
import org.apache.log4j.Logger;

public class CreateEventObject {
	
	private static Logger logger = Logger.getLogger(Base.class);
	Base base = new Base();
	SignInObject signin = new SignInObject();
	
	public static final String PAGE_TITLE_CREATE_EVENT = "Create Event - Live Sports - Rightster";

	public static final String EVENTS_TAB_XPATH = "html/body/div[1]/div/header/div/nav/ul/li[1]/a";
	public static final String CREATE_EVENT_XPATH = "html/body/div[1]/div/div[2]/ul/li[2]/a";
    public static final String SEARCH_BOX_XPATH = "html/body/div[1]/div/div[2]/form/div/section[1]/section/input[1]";
    public static final String SEARCH_SUBMIT_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div/section[1]/section/input[2]";
	
	//Schedule Tab Xpaths
	public static final String CE_SCHEDULE_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[1]/a";
	public static final String CE_TITLE_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[2]/div[1]/input";
	public static final String CE_DESCRIPTION_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[2]/div[7]/textarea";
	public static final String CE_EVENT_START_TIME_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[1]/div[2]/input[1]";
	public static final String CE_EVENT_START_DATE_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[1]/div[2]/input[2]";
	public static final String CE_EVENT_END_TIME_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[2]/div[2]/input[1]";
	public static final String CE_EVENT_END_DATE_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[2]/div[2]/input[2]";
	public static final String CE_SLATE_START_TIME_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[3]/div[2]/input[1]";
	public static final String CE_SLATE_END_TIME_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[4]/div[2]/input[1]";
	public static final String CE_SLATE_START_DATE_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[3]/div[2]/input[2]";
	public static final String CE_SLATE_END_DATE_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[4]/div[2]/input[2]";
	public static final String CE_EVENT_LENGTH_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[5]/input";
	public static final String CE_AFL_ENCODING_SERVICE_RADIO_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[6]/span/input[1]";
	public static final String CE_IMG_ENCODING_SERVICE_RADIO_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[4]/div[6]/span/input[2]";
	public static final String CE_SAVE_AND_CREATE_ANOTHER_EVENT_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[5]/input[1]";
	public static final String CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div[1]/div[5]/input[2]";
	
	//Restrictions tab xpath
	public static final String CE_RESTRICTIONS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[2]/a";
	public static final String CE_ALLOWED_COUNTRY_1_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div[1]/select/option[1]";
	public static final String CE_DENIED_COUNTRY_1_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div[3]/select/option";
	public static final String CE_ALLOW_IP_FROM_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/div[2]/div[1]/input[1]";
	public static final String CE_ALLOW_IP_TO_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/div[2]/div[1]/input[2]";
	public static final String CE_DENY_IP_FROM_XPATH = "html/body/div[1]/div/div[2]/form/div/div[3]/div[2]/div[1]/input[1]";
	public static final String CE_DENY_IP_TO_XPATH = "html/body/div[1]/div/div[2]/form/div/div[3]/div[2]/div[1]/input[2]";
	public static final String CE_ALLOW_IP_ADD_ANOTHER_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/div[2]/a";
	public static final String CE_DENY_IP_ADD_ANOTHER_XPATH = "html/body/div[1]/div/div[2]/form/div/div[3]/div[2]/a";
	public static final String CE_RESTRICTIONS_TAB_CONTINUE_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div/div[4]/input";
	public static final String CE_MOVE_COUNTRY_RIGHT_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div[2]/input[1]";
	public static final String CE_MOVE_COUNTRY_LEFT_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div[2]/input[2]";
	
	//Contacts tab xpath
	public static final String CE_CONTACTS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[3]/a";
	public static final String CE_ACCOUNTS_MANAGER_NAME_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/input";
	public static final String CE_COMPANY_NAME_XPATH = "html/body/div[1]/div/div[2]/form/div/div[3]/input";
	public static final String CE_COMPANY_EMAIL_XPATH = "html/body/div[1]/div/div[2]/form/div/div[4]/input";
	public static final String CE_COMPANY_TELEPHONE_XPATH = "html/body/div[1]/div/div[2]/form/div/div[5]/input";																						
	public static final String CE_CONTACTS_TAB_CONTINUE_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div/div[21]/input";
	
	//DealsTabXpath
	public static final String CE_DEALS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[4]/a";
	public static final String CE_MAKE_OFFER_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[1]/section/form/input";
	public static final String CE_DEAL_1_XPATH = "html/body/div[1]/div/div[2]/div[1]/section/ul/li[1]/a";
	public static final String CE_DENIED_COUNTRIES_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[1]/div[3]/select/option[1]";
	public static final String CE_MOVE_LEFT_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[1]/div[2]/input[2]";
	public static final String CE_ALLOWED_COUNTRIES_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[1]/div[1]/select/option[1]";
	public static final String CE_MOVE_RIGHT_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[1]/div[2]/input[1]";
	public static final String CE_PROFILE_FLASH_LQ_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[1]";
	public static final String CE_PROFILE_FLASH_MQ_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[2]";
	public static final String CE_PROFILE_FLASH_HQ_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[3]";
	public static final String CE_PROFILE_HLS_800K_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[4]";
	public static final String CE_PROFILE_HLS_600K_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[5]";
	public static final String CE_PROFILES_HLS_264K_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[6]";
	public static final String CE_PROFILES_HLS_AUDIO_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/span/input[7]";
	public static final String CE_DEALS_TAB_ALLOW_FROM_IP_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[3]/div[2]/div/input[1]";
	public static final String CE_DEALS_TAB_ALLOW_TO_IP_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[3]/div[2]/div/input[2]";
	public static final String CE_DEALS_TAB_DENY_FROM_IP_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[4]/div[2]/div/input[1]";
	public static final String CE_DEALS_TAB_DENY_TO_IP_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[4]/div[2]/div/input[2]";
	public static final String CE_DEALS_TAB_ALLOW_IP_ADD_ANOTHER_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[3]/div[2]/a";
	public static final String CE_DEALS_TAB_DENY_IP_ADD_ANOTHER_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[4]/div[2]/a";
	public static final String CE_UPDATE_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[2]/form/div[5]/input";
	
	
	public static final String CE_EVENTS_AND_PROPERTIES_XPATH = "html/body/div[1]/div/div[2]/ul/li[1]/a";
	public static final String CE_EVENTS_SUB_TAB_XPATH = "html/body/div[1]/div/div[2]/form/section/aside/div[1]/ul/li[1]/a/b";
	
	
	
	
	//Locators
	public WebElement EventsTabLocator()
	{
		WebElement element = base.FindElementByXpath(EVENTS_TAB_XPATH);
		return element;
	}
	
	public WebElement CreateEventSubTabLocator()
	{
		WebElement element = base.FindElementByXpath(CREATE_EVENT_XPATH);
		return element;
	}
	public WebElement SearchBoxLocator()
	{
		WebElement element = base.FindElementByXpath(SEARCH_BOX_XPATH);
		return element;
	}
	public WebElement SearchSubmitButtonLocator()
	{
		WebElement element = base.FindElementByXpath(SEARCH_SUBMIT_BUTTON_XPATH);
		return element;
	}
	public WebElement ScheduleTabLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SCHEDULE_TAB_XPATH);
		return element;
	}
	public WebElement TitleFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	public WebElement DescriptionFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DESCRIPTION_XPATH);
		return element;
	}
	public WebElement EventStartTimeFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_EVENT_START_TIME_XPATH);
		return element;
	}
	public WebElement EventEndTimeFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_EVENT_END_TIME_XPATH);
		return element;
	}
	public WebElement EventStartDateFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_EVENT_START_DATE_XPATH);
		return element;
	}
	public WebElement EventEndDateFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_EVENT_END_DATE_XPATH);
		return element;
	}
	public WebElement SlateStartTimeFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SLATE_START_TIME_XPATH);
		return element;
	}
	public WebElement SlateEndTimeFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SLATE_END_TIME_XPATH);
		return element;
	}
	public WebElement SlateStartDateFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SLATE_START_DATE_XPATH);
		return element;
	}
	public WebElement SlateEndDateFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SLATE_END_DATE_XPATH);
		return element;
	}
	public WebElement EventLengthFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_EVENT_LENGTH_XPATH);
		return element;
	}
	public WebElement AFLRadioButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_AFL_ENCODING_SERVICE_RADIO_BUTTON_XPATH);
		return element;
	}
	public WebElement IMGRadioButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_IMG_ENCODING_SERVICE_RADIO_BUTTON_XPATH);
		return element;
	}
	public WebElement SaveAndCreateAnotherEventButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SAVE_AND_CREATE_ANOTHER_EVENT_BUTTON_XPATH);
		return element;
	}
	public WebElement SaveAndAddDealButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH);
		return element;
	}
	
	
	public WebElement RestrictionsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CE_RESTRICTIONS_TAB_XPATH);
		return element;
	}
	
	public WebElement AllowedCountryLocator()
	{
		WebElement element = base.FindElementByXpath(CE_ALLOWED_COUNTRY_1_XPATH);
		return element;
	}
	
	public WebElement DeniedCountryLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DENIED_COUNTRY_1_XPATH);
		return element;
	}
	
	public WebElement AllowIPFromFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_ALLOW_IP_FROM_XPATH);
		return element;
	}
	
	public WebElement AllowIPToFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_ALLOW_IP_TO_XPATH);
		return element;
	}
	
	public WebElement DenyIPFromFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DENY_IP_FROM_XPATH);
		return element;
	}
	
	public WebElement DenyIPToFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DENY_IP_TO_XPATH);
		return element;
	}
	
	public WebElement AllowIPAddAnotherLocator()
	{
		WebElement element = base.FindElementByXpath(CE_ALLOW_IP_ADD_ANOTHER_XPATH);
		return element;
	}
	
	public WebElement DenyIPAddAnotherLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DENY_IP_ADD_ANOTHER_XPATH);
		return element;
	}
	
	public WebElement RestrictionsTabContinueButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_RESTRICTIONS_TAB_CONTINUE_BUTTON_XPATH);
		return element;
	}
	
	public WebElement MoveCountryLeftLocator()
	{
		WebElement element = base.FindElementByXpath(CE_MOVE_COUNTRY_LEFT_XPATH);
		return element;
	}
	
	public WebElement MoveCountryRightLocator()
	{
		WebElement element = base.FindElementByXpath(CE_MOVE_COUNTRY_RIGHT_XPATH);
		return element;
	}
	
	
	public WebElement ContactsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	
	public WebElement AccountManagerNameFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	
	public WebElement CompanyNameFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	
	public WebElement CompanyEmailLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	
	public WebElement CompanyTelephoneLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	

	public WebElement DealsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEALS_TAB_XPATH);
		return element;
	}
	
	public WebElement MakeOfferButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_MAKE_OFFER_BUTTON_XPATH);
		return element;
	}
	
	public WebElement DealLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEAL_1_XPATH);
		return element;
	}
	
	public WebElement DealsTabDeniedCountryLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DENIED_COUNTRIES_XPATH);
		return element;
	}
	
	public WebElement DealstabAllowedCountryLocator()
	{
		WebElement element = base.FindElementByXpath(CE_ALLOWED_COUNTRIES_XPATH);
		return element;
	}

	
	public WebElement DealsTabMoveRightLocator()
	{
		WebElement element = base.FindElementByXpath(CE_MOVE_COUNTRY_RIGHT_XPATH);
		return element;
	}
	
	public WebElement DealsTabMoveLeftLocator()
	{
		WebElement element = base.FindElementByXpath(CE_MOVE_LEFT_BUTTON_XPATH);
		return element;
	}
	
	
	public WebElement FlashProfileHQLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILE_FLASH_HQ_XPATH);
		return element;
	}
	
	public WebElement FlashProfileMQLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILE_FLASH_MQ_XPATH);
		return element;
	}
	
	
	public WebElement FlashProfileLQLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILE_FLASH_MQ_XPATH);
		return element;
	}
	
	public WebElement HLSProfile800KLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILE_HLS_800K_XPATH);
		return element;
	}
	
	public WebElement HLSProfile600KLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILE_HLS_600K_XPATH);
		return element;
	}
	
	public WebElement HLSProfile264KLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILES_HLS_264K_XPATH);
		return element;
	}
	
	public WebElement HLSProfileAudioOnlyLocator()
	{
		WebElement element = base.FindElementByXpath(CE_PROFILES_HLS_AUDIO_XPATH);
		return element;
	}
	
	
	public WebElement DealsTabAllowIPFromFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEALS_TAB_ALLOW_FROM_IP_XPATH);
		return element;
	}
	
	public WebElement DealsTabAllowIPToFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEALS_TAB_ALLOW_TO_IP_XPATH);
		return element;
	}
	
	public WebElement DealsTabDenyIPFromFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEALS_TAB_DENY_FROM_IP_XPATH);
		return element;
	}
	
	public WebElement DealsTabDenyIPToFieldLocator()
	{
		WebElement element = base.FindElementByXpath(CE_TITLE_XPATH);
		return element;
	}
	
	
	public WebElement DealsTabAllowIPAddAnotherLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEALS_TAB_ALLOW_IP_ADD_ANOTHER_XPATH);
		return element;
	}
	
	public WebElement DealsTabDenyIPAddAnotherLocator()
	{
		WebElement element = base.FindElementByXpath(CE_DEALS_TAB_DENY_IP_ADD_ANOTHER_XPATH);
		return element;
	}
	
	public WebElement UpdateButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_UPDATE_BUTTON_XPATH);
		return element;
	}
	
	public WebElement EventsAndPropertiesButtonLocator()
	{
		WebElement element = base.FindElementByXpath(CE_EVENTS_AND_PROPERTIES_XPATH);
		return element;
	}
	
	
	
	public String ReachCreateEvent() throws InterruptedException
	{
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		String Title;
		Title = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		base.assertPageTitleSame(ExpectedTitle, Title);
		base.WaitforElementPresentByXpath(EVENTS_TAB_XPATH);
		base.click(EventsTabLocator());
		base.WaitforElementPresentByXpath(CREATE_EVENT_XPATH);
		base.click(CreateEventSubTabLocator());
		String CreateEventPageTitle = base.getTitle();
		return CreateEventPageTitle;
		
	}
	
	//This method will retain the details entered at  property level while creating an event
	public void EnterValuesScheduleTabPassPropertyDetailsRetained(String EventName, String PropertyName, String BookingStatus, String Location, String AudioFeedType, String Description, String EventStartTime, String EventStartDate, String NumberOfMatches, String Channel) throws InterruptedException
	{
		String ReturnedTitle = ReachCreateEvent();
		String ExpectedTitle = PAGE_TITLE_CREATE_EVENT;
		base.assertPageTitleSame(ExpectedTitle, ReturnedTitle);
		base.WaitforElementPresentByXpath(CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH);
		base.EnterValueInTextField(TitleFieldLocator(), EventName);
		base.SelectOptionFromADropdown(PropertyName);
		base.SelectOptionFromADropdown(BookingStatus);
		base.SelectOptionFromADropdown(Location);
		base.SelectOptionFromADropdown(AudioFeedType);
		base.EnterValueInTextField(DescriptionFieldLocator(), Description);
		base.EnterValueInTextField(EventStartTimeFieldLocator(), EventStartTime);
		base.EnterValueInTextField(EventStartDateFieldLocator(), EventStartDate);
		base.SelectOptionFromADropdown(NumberOfMatches);
		base.SelectOptionFromADropdown(Channel);
		base.click(SaveAndAddDealButtonLocator());
		
		
	}
	//This method will override details entered at property level and will put fresh values in all the fields of schedule tab
	public void EnterValuesScheduleTabPassPropertyDetailsOverriden(String Title, String PropertyAssigned, String Category, String BookingStatus, String Location, String AudioFeedType, String Description, String EventStartTime, String EventStartDate, String NumberOfMatches, String EventEndTime, String EventEndDate, String SlateStartTime, String SlateStartDate, String SlateEndDate, String SlateEndTime, String Channel) throws InterruptedException
	{
		String ReturnedTitle = ReachCreateEvent();
		String ExpectedTitle = PAGE_TITLE_CREATE_EVENT;
		base.assertPageTitleSame(ExpectedTitle, ReturnedTitle);
		base.WaitforElementPresentByXpath(CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH);
		base.EnterValueInTextField(TitleFieldLocator(), Title);
		base.SelectOptionFromADropdown(PropertyAssigned);
		base.SelectOptionFromADropdown(Category);
		base.SelectOptionFromADropdown(BookingStatus);
		base.SelectOptionFromADropdown(Location);
		base.SelectOptionFromADropdown(AudioFeedType);
		base.EnterValueInTextField(DescriptionFieldLocator(), Description);
		base.EnterValueInTextField(EventStartTimeFieldLocator(), EventStartTime);
		base.EnterValueInTextField(EventStartDateFieldLocator(), EventStartDate);
		base.EnterValueInTextField(EventEndTimeFieldLocator(), EventEndTime);
		base.EnterValueInTextField(EventEndDateFieldLocator(), EventEndDate);
		base.EnterValueInTextField(SlateStartTimeFieldLocator(), SlateStartTime);
		base.EnterValueInTextField(SlateStartDateFieldLocator(), SlateStartDate);
		base.EnterValueInTextField(SlateEndTimeFieldLocator(), SlateEndTime);
		base.EnterValueInTextField(SlateEndDateFieldLocator(), SlateEndDate);
		base.SelectOptionFromADropdown(NumberOfMatches);
		base.SelectOptionFromADropdown(Channel);
		base.click(SaveAndAddDealButtonLocator());
		
		
	}
	
	public void EnterValuesScheduleTabPassAddDealLater(String Title, String PropertyAssigned, String BookingStatus, String Location, String AudioFeedType, String Description, String EventStartTime, String EventStartDate, String NumberOfMatches, String Channel) throws InterruptedException
	{
		String ReturnedTitle = ReachCreateEvent();
		String ExpectedTitle = PAGE_TITLE_CREATE_EVENT;
		base.assertPageTitleSame(ExpectedTitle, ReturnedTitle);
		base.WaitforElementPresentByXpath(CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH);
		base.EnterValueInTextField(TitleFieldLocator(), Title);
		base.SelectOptionFromADropdown(PropertyAssigned);
		base.SelectOptionFromADropdown(BookingStatus);
		base.SelectOptionFromADropdown(Location);
		base.SelectOptionFromADropdown(AudioFeedType);
		base.EnterValueInTextField(DescriptionFieldLocator(), Description);
		base.EnterValueInTextField(EventStartTimeFieldLocator(), EventStartTime);
		base.EnterValueInTextField(EventStartDateFieldLocator(), EventStartDate);
		base.SelectOptionFromADropdown(NumberOfMatches);
		base.SelectOptionFromADropdown(Channel);
		base.click(SaveAndCreateAnotherEventButtonLocator());
	}
	
	public void OpenExistingEvent(String EventName) throws InterruptedException
	{
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		String Title;
		Title = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		base.assertPageTitleSame(ExpectedTitle, Title);
		base.WaitforElementPresentByXpath(EVENTS_TAB_XPATH);
		base.click(EventsTabLocator());
		base.WaitforElementPresentByXpath(CREATE_EVENT_XPATH);
		base.click(EventsAndPropertiesButtonLocator());
		base.WaitforElementPresentByXpath(CE_EVENTS_SUB_TAB_XPATH);
		base.assertTextPresentOnPageByTagname("a", EventName);
		base.click(base.FindElementByTextPresentOnPageUsingTagname("a", EventName));
	}
	
	
	
	public void UpdateEventScheduleTime(String FieldToEdit, String NewTime)
	{
		
		String ch = FieldToEdit;
		String Time = NewTime;
		
		if(ch.equalsIgnoreCase("EST"))
		{
			base.EnterValueInTextField(EventStartTimeFieldLocator(), Time);
		}
		
		else if(ch.equalsIgnoreCase("EET"))
		{
			base.EnterValueInTextField(EventEndTimeFieldLocator(), Time);
		}
		
		else if(ch.equalsIgnoreCase("SST"))
		{
			base.EnterValueInTextField(SlateStartTimeFieldLocator(), Time);
		}
		
		else if(ch.equalsIgnoreCase("SET"))
		{
			base.EnterValueInTextField(SlateEndTimeFieldLocator(), Time);
		}
		
		else
		{
		logger.info("Wrong input given - FieldToEdit");
		}
	}
	
	public void UpdateEventScheduleTime(String FirstFieldToEdit, String SecondFieldToEdit, String NewTime1, String NewTime2)
	{
		String ch = FirstFieldToEdit+SecondFieldToEdit;
		String Time1 = NewTime1;
		String Time2 = NewTime2;
		
		if(ch.equalsIgnoreCase("ESTEET"))
		{
			base.EnterValueInTextField(EventStartTimeFieldLocator(), Time1);
			base.EnterValueInTextField(EventEndTimeFieldLocator(), Time2);
		}
		
		else if(ch.equalsIgnoreCase("EETSST"))
		{
			base.EnterValueInTextField(EventEndTimeFieldLocator(), Time1);
			base.EnterValueInTextField(SlateStartTimeFieldLocator(), Time2);
		}
		
		else if(ch.equalsIgnoreCase("SSTSET"))
		{
			base.EnterValueInTextField(SlateStartTimeFieldLocator(), Time1);
			base.EnterValueInTextField(SlateEndTimeFieldLocator(), Time2);
		}
		
		else if(ch.equalsIgnoreCase("SETEST"))
		{
			base.EnterValueInTextField(SlateEndTimeFieldLocator(), Time1);
			base.EnterValueInTextField(EventStartTimeFieldLocator(), Time2);
			
		}
		
		else
		{
		logger.info("Wrong input given - FieldToEdit");
		}
		
		base.click(SaveAndAddDealButtonLocator());
	
	}
	
	public void UpdateEventScheduleTime(String FirstFieldToEdit, String SecondFieldToEdit, String ThirdFieldToEdit, String NewTime1, String NewTime2, String NewTime3)
	{
		String ch = FirstFieldToEdit+SecondFieldToEdit+ThirdFieldToEdit;
		String Time1 = NewTime1;
		String Time2 = NewTime2;
		String Time3 = NewTime3;
		
		if(ch.equalsIgnoreCase("ESTEETSST"))
		{
			base.EnterValueInTextField(EventStartTimeFieldLocator(), Time1);
			base.EnterValueInTextField(EventEndTimeFieldLocator(), Time2);
			base.EnterValueInTextField(SlateStartTimeFieldLocator(), Time3);
		}
		
		else if(ch.equalsIgnoreCase("EETSSTSET"))
		{
			base.EnterValueInTextField(EventEndTimeFieldLocator(), Time1);
			base.EnterValueInTextField(SlateStartTimeFieldLocator(), Time2);
			base.EnterValueInTextField(SlateEndTimeFieldLocator(), Time3);
		}
		
		else if(ch.equalsIgnoreCase("SSTSETEST"))
		{
			base.EnterValueInTextField(SlateStartTimeFieldLocator(), Time1);
			base.EnterValueInTextField(SlateEndTimeFieldLocator(), Time2);
			base.EnterValueInTextField(EventStartTimeFieldLocator(), Time3);
		}
		
		else if(ch.equalsIgnoreCase("SETESTEET"))
		{
			base.EnterValueInTextField(SlateEndTimeFieldLocator(), Time1);
			base.EnterValueInTextField(EventStartTimeFieldLocator(), Time2);
			base.EnterValueInTextField(EventEndTimeFieldLocator(), Time3);
			
		}
		
		else
		{
		logger.info("Wrong input given - FieldToEdit");
		}
		
		base.click(SaveAndAddDealButtonLocator());
	
	}
	
	public void UpdateEventScheduleTimeAllFields(String NewTime1, String NewTime2, String NewTime3, String NewTime4)
	{
		base.EnterValueInTextField(EventStartTimeFieldLocator(), NewTime1);
		base.EnterValueInTextField(EventEndTimeFieldLocator(), NewTime2);
		base.EnterValueInTextField(SlateStartTimeFieldLocator(), NewTime3);
		base.EnterValueInTextField(SlateEndTimeFieldLocator(), NewTime4);
		base.click(SaveAndAddDealButtonLocator());
	
	}
	
	public void UpdateSlateStartDate(String NewDate)
	{
		base.EnterValueInTextField(base.FindElementByXpath(CE_SLATE_START_DATE_XPATH), NewDate);
	}
	
	public void UpdateSlateEndtDate(String NewDate)
	{
		base.EnterValueInTextField(base.FindElementByXpath(CE_SLATE_END_DATE_XPATH), NewDate);
	}
	
	public void UpdateEventStartDate(String NewDate)
	{
		base.EnterValueInTextField(base.FindElementByXpath(CE_EVENT_START_DATE_XPATH), NewDate);
	}
	
	public void UpdateEventEndDate(String NewDate)
	{
		base.EnterValueInTextField(base.FindElementByXpath(CE_EVENT_END_DATE_XPATH), NewDate);
	}
	
	public void ChangeChannel(String ChannelNumber)
	{
		base.SelectOptionFromADropdown(ChannelNumber);
	}
	
	public void ChangeEventTitle(String EventName)
	{
		base.EnterValueInTextField(base.FindElementByXpath(CE_TITLE_XPATH), EventName);
	}
	
}
