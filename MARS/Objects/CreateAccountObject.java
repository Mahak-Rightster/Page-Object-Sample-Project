package Objects;

import org.openqa.selenium.WebElement;

import Reusables.Base;

public class CreateAccountObject {
	
	Base base = new Base();
	SignInObject signin = new SignInObject();
	
	public static final String PAGE_TITLE_CREATE_ACCOUNT = "Create Account - Live Sports - Rightster";
	
	public static final String ACCOUNT_TAB_XPATH = "html/body/div[1]/div/header/div/nav/ul/li[3]/a";
	public static final String CREATE_ACCOUNT_XPATH = "html/body/div[1]/div/div[2]/ul/li[2]/a";
	public static final String USERS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[2]/a";
	public static final String CONTRACTS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[3]/a";
	public static final String DEALS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[4]/a";
	public static final String DIRECTORY_BUTTON_XPATH= "html/body/div[1]/div/div[2]/ul/li[1]/a";
	public static final String SEARCH_BOX_ACCOUNT_DIRECTORY_XPATH="html/body/div[1]/div/div[2]/div[1]/div[1]/form/div[3]/section/input[1]";
	public static final String FIRST_SEARCH_RESULT_XPATH="html/body/div[1]/div/div[2]/div[1]/div[2]/article[1]/header/h1/a";
	public static final String SEARCH_SYMBOL_ID = "search_term_go";
														
	
	//Details tab xpath
	
	public static final String DETAILS_TAB_XPATH = "html/body/div[1]/div/div[2]/header/nav/div/ul/li[1]/a";
	public static final String ACCOUNT_NAME_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/input";
	public static final String PRIMARY_CONTACT_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/input";
	public static final String EMAIL_XPATH = "html/body/div[1]/div/div[2]/form/div/div[3]/input";
	public static final String TELEPHONE_XPATH = "html/body/div[1]/div/div[2]/form/div/div[4]/input";
	public static final String WEBSITE_XPATH = "html/body/div[1]/div/div[2]/form/div/div[5]/input";		
	public static final String CONTINUE_BUTTON_DETAILS_TAB_XPATH = "html/body/div[1]/div/div[2]/form/div/div[6]/input";
	
	//Users tab xpath
	
	public static final String USER_NAME_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div/div[1]/input[1]";
	public static final String USER_NAME_2_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/input[1]";
	
	public static final String USER_EMAIL_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div/div[2]/input";
	
	
	public static final String USER_EMAIL_2_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/div[2]/div[2]/input";
	public static final String CONTINUE_BUTTON_USERS_TAB_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/input";
	public static final String ADD_ANOTHER_BUTTON_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/a";
	
	//Contracts tab xpath
	
	public static final String UPLOAD_CONTRACTS_XPATH = "html/body/div[1]/div/div[2]/form/div/div[1]/input[2]";
	public static final String CONTINUE_BUTTON_CONTRACTS_TAB_XPATH = "html/body/div[1]/div/div[2]/form/div/div[2]/input";
	
	// Details tab constants
	
	public static final String PRIMARY_CONTACT = "Mahak Swami";
	public static final String EMAIL = "mahak@rightster.com";
	public static final String TELEPHONE = "987654321";
	public static final String WEBSITE = "http://www.whatever.com";
	
	// Users tab constants
	
	public static final String ADD_ANOTHER_LINK_TEXT = "+ Add another";
	

	
	
	public WebElement DirectoryButtonLocator()
	{
		WebElement element = base.FindElementByXpath(DIRECTORY_BUTTON_XPATH);
		return element;
	}
	
	public WebElement SearchBoxLocator()
	{
		WebElement element = base.FindElementByXpath(SEARCH_BOX_ACCOUNT_DIRECTORY_XPATH);
		return element;
	}
	public WebElement SearchButtonLocator()
	{
		WebElement element = base.FindElementById(SEARCH_SYMBOL_ID);
		return element;
	}
	
	
	
	public WebElement FirstSearchResultLocator()
	{
		WebElement element = base.FindElementByXpath(FIRST_SEARCH_RESULT_XPATH);
		return element;
	}

	
	public WebElement AccountsTabLocator()
	{
		WebElement element = base.FindElementByXpath(ACCOUNT_TAB_XPATH);
		return element;
	}
	
	public WebElement CreateAccountLocator()
	{
		WebElement element = base.FindElementByXpath(CREATE_ACCOUNT_XPATH);
		return element;
	}
	
	public WebElement UsersTabLocator()
	{
		WebElement element = base.FindElementByXpath(USERS_TAB_XPATH);
		return element;
	}
	
	public WebElement ContractsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CONTRACTS_TAB_XPATH);
		return element;
	}
	
	public WebElement DealsTabLocator()
	{
		WebElement element = base.FindElementByXpath(DEALS_TAB_XPATH);
		return element;
	}
	
	//Details Tab locators
	
	public WebElement DetailsTabLocator()
	{
		WebElement element = base.FindElementByXpath(DETAILS_TAB_XPATH);
		return element;
	}
	
	public WebElement AccountNameTextBoxLocator()
	{
		WebElement element = base.FindElementByXpath(ACCOUNT_NAME_XPATH);
		return element;
	}
	
	public WebElement PrimaryContactBoxLocator()
	{
		WebElement element = base.FindElementByXpath(PRIMARY_CONTACT_XPATH);
		return element;
	}
	
	
	public WebElement EmailBoxLocator()
	{
		WebElement element = base.FindElementByXpath(EMAIL_XPATH);
		return element;
	}
	
	public WebElement TelephoneBoxLocator()
	{
		WebElement element = base.FindElementByXpath(TELEPHONE_XPATH);
		return element;
	}
	
	public WebElement WebsiteBoxLocator()
	{
		WebElement element = base.FindElementByXpath(WEBSITE_XPATH);
		return element;
	}
	
	public WebElement ContinueButtonDetailsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CONTINUE_BUTTON_DETAILS_TAB_XPATH);
		return element;
	}
	
	//Users tab locators
	
	public WebElement UserNameBoxLocator()
	{
		WebElement element = base.FindElementByXpath(USER_NAME_XPATH);
		return element;
	}
	
	/*public WebElement UserNameBox2Locator()
	{
		WebElement element = base.FindElementByXpath(USER_NAME_2_XPATH);
		return element;
	}*/
	
	public WebElement UserEmailBoxLocator()
	{
		WebElement element = base.FindElementByXpath(USER_EMAIL_XPATH);
		return element;
	}
	
	/*public WebElement UserEmailBox2Locator()
	{
		WebElement element = base.FindElementByXpath(USER_EMAIL_2_XPATH);
		return element;
	}*/
	
	public WebElement AddAnotherUsersTabLocator()
	{
		WebElement element = base.FindElementByXpath(ADD_ANOTHER_BUTTON_XPATH);
		return element;
	}
	
	public WebElement ContinueButtonUsersTabLocator()
	{
		WebElement element = base.FindElementByXpath(CONTINUE_BUTTON_USERS_TAB_XPATH);
		return element;
	}
	
	public WebElement AddAnotherLinkLocator()
	{
		WebElement element = base.FindElementByLink(ADD_ANOTHER_LINK_TEXT);
		return element;
	}
	
	//Contracts tab locators
	
	public WebElement ContinueButtonContractsTabLocator()
	{
		WebElement element = base.FindElementByXpath(CONTINUE_BUTTON_CONTRACTS_TAB_XPATH);
		return element;
	}


	public String ReachCreateAccount() throws InterruptedException
	{
		
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		String Title;
		Title = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		base.assertPageTitleSame(ExpectedTitle, Title);
		base.WaitforElementPresentByXpath(ACCOUNT_TAB_XPATH);
		base.click(AccountsTabLocator());
		base.WaitforElementPresentByXpath(CREATE_ACCOUNT_XPATH);
		base.click(CreateAccountLocator());
		String CreateAccountPageTitle = base.getTitle();
		return CreateAccountPageTitle;
		
		
	}
	
	public void EnterValuesDetailsTabPass(String AccountName) throws InterruptedException
	{
		String TitleMatch = ReachCreateAccount();
		String ExpectedTitle = PAGE_TITLE_CREATE_ACCOUNT;
		base.assertPageTitleSame(ExpectedTitle, TitleMatch);
		base.EnterValueInTextField(AccountNameTextBoxLocator(), AccountName);
		base.EnterValueInTextField(PrimaryContactBoxLocator(), PRIMARY_CONTACT);
		base.EnterValueInTextField(EmailBoxLocator(), EMAIL);
		base.EnterValueInTextField(TelephoneBoxLocator(), TELEPHONE);
		base.EnterValueInTextField(WebsiteBoxLocator(), WEBSITE);
		base.click(ContinueButtonDetailsTabLocator());
		base.WaitforElementPresentByXpath(CreateAccountObject.USER_NAME_XPATH);
		base.assertElementPresentByXpath(USER_NAME_XPATH);
		
		
	}
	
	public void EnterValuesDetailsTabFail(String AccountName) throws InterruptedException
	{
		String TitleMatch = ReachCreateAccount();
		String ExpectedTitle = PAGE_TITLE_CREATE_ACCOUNT;
		base.assertPageTitleSame(ExpectedTitle, TitleMatch);
		base.EnterValueInTextField(AccountNameTextBoxLocator(), AccountName);
		base.EnterValueInTextField(PrimaryContactBoxLocator(), PRIMARY_CONTACT);
		base.EnterValueInTextField(EmailBoxLocator(), EMAIL);
		base.EnterValueInTextField(TelephoneBoxLocator(), TELEPHONE);
		base.EnterValueInTextField(WebsiteBoxLocator(), WEBSITE);
		
		
	}
	
	public void EnterValuesUsersTabPass(String UserName, String UserEmail)
	{
		base.EnterValueInTextField(UserNameBoxLocator(), UserName);
		base.EnterValueInTextField(UserEmailBoxLocator(), UserEmail);
		base.click(ContinueButtonUsersTabLocator());
	}
	
	public void EnterValuesUsersTabFail(String UserName, String UserEmail)
	{
		base.EnterValueInTextField(UserNameBoxLocator(), UserName);
		base.EnterValueInTextField(UserEmailBoxLocator(), UserEmail);
		base.click(ContinueButtonUsersTabLocator());
	}
	
	public void OpenExistingAccountPass(String AccountName) throws InterruptedException
	{
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		String Title;
		Title = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		base.assertPageTitleSame(ExpectedTitle, Title);
		base.WaitforElementPresentByXpath(CreateAccountObject.ACCOUNT_TAB_XPATH);
		base.click(AccountsTabLocator());
		base.WaitforElementPresentByXpath(SEARCH_BOX_ACCOUNT_DIRECTORY_XPATH);
		base.EnterValueInTextField(SearchBoxLocator(), AccountName);
		base.Submit(SearchBoxLocator());
		Thread.sleep(5000);
		base.WaitforElementPresentByXpath(FIRST_SEARCH_RESULT_XPATH);
		base.click(FirstSearchResultLocator());
		base.WaitforElementPresentByXpath(ACCOUNT_NAME_XPATH);
		
		
	}
	
	public void OpenExistingAccountFail(String AccountName) throws InterruptedException
	{
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		String Title;
		Title = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		base.assertPageTitleSame(ExpectedTitle, Title);
		base.WaitforElementPresentByXpath(CreateAccountObject.ACCOUNT_TAB_XPATH);
		base.click(AccountsTabLocator());
		base.WaitforElementPresentByXpath(SEARCH_BOX_ACCOUNT_DIRECTORY_XPATH);
		base.click(SearchBoxLocator());
		base.EnterValueInTextField(SearchBoxLocator(), AccountName);
		base.Submit(SearchBoxLocator());
		Thread.sleep(5000);
		base.click(FirstSearchResultLocator());
		base.WaitforElementPresentByXpath(ACCOUNT_NAME_XPATH);		
		
	}
	
	


	
}
