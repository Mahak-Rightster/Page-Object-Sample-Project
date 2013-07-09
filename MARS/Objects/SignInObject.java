package Objects;

import org.openqa.selenium.WebElement;

import  Reusables.Base;


public class SignInObject{
	
	
	
	public static final String PAGE_TITLE_EPG_SCREEN = "Programme Guide - Live Sports - Rightster";
	public static final String ERR_MSG_NO_EMAIL = "Email cannot be blank.";
	public static final String RIGHTSTER_ACCOUNT_NAME = "Rightster (switch)";
	public static final String TEST_ACCOUNT_NAME = "Account mahak";
	public static final String PAGE_TITLE_FORGOT_PASSWORD = "Forgotten Password - Live Sports - Rightster";
	public static final String ERR_MSG_NO_PASS = "Password cannot be blank.";
	
	public static final String USER_NAME_XPATH = "//*[@id='User_email']";
	public static final String PASS_XPATH = "//*[@id='User_password']";
	private static final String SUBMIT_BUTTON_XPATH = "html/body/div[1]/div/div[2]/div[1]/div/div[1]/form/div[4]/input";
	public static final String FORGOT_PASS_XPATH = "html/body/div[1]/div/div[2]/div[1]/div/div[1]/form/div[3]/div[1]/a";
	public static final String ERR_MSG_NO_EMAIL_XPATH = "html/body/div[1]/div/div[2]/div[1]/div/div[1]/form/div[1]/div[1]";
	public static final String ERR_MSG_NO_PASS_XPATH = "html/body/div[1]/div/div[2]/div[1]/div/div[1]/form/div[1]/div[1]";
	public static final String ACCOUNT_NAME_TOP_XPATH = "html/body/div[1]/div/header/div/div/div[1]/div[2]/div/span";
	public static final String ACCOUNT_SWITCH_TOP_XPATH = "html/body/div[1]/div/header/div/div/div[1]/div[2]/div/span/a";
	public static final String RESET_BUTTON_XPATH= "html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input";
	
	
	Base base = new Base();
	
	public WebElement AccountNameTopLocator()
	{
		
		WebElement element = base.FindElementByXpath(ACCOUNT_NAME_TOP_XPATH);
		return element;
	}
	

	
	public WebElement PasswordTextboxLocator()
	{
		WebElement element = base.FindElementByXpath(PASS_XPATH);
		return element;
	}
	
	public WebElement SubmitButtonLocator()
	{
		WebElement element = base.FindElementByXpath(SUBMIT_BUTTON_XPATH);
		return element;
	}
	
	public WebElement ForgotPasswordLinkLocator()
	{
		WebElement element = base.FindElementByXpath(FORGOT_PASS_XPATH);
		return element;
	}
	
	public WebElement ErrMsgNoEmailLocator()
	{
		WebElement element = base.FindElementByXpath(ERR_MSG_NO_EMAIL_XPATH);
		return element;
	}
	
	public WebElement ErrMsgNoPasswordLocator()
	{
		WebElement element = base.FindElementByXpath(ERR_MSG_NO_PASS_XPATH);
		return element;
	}
	
	public WebElement UsernameTextboxLocator()
	{
		
		WebElement element = base.FindElementByXpath(USER_NAME_XPATH);
		return element;
	}
	
	
	
	public String SignInPass(String Username,String password) throws InterruptedException
	{
		
		base.Launch_FuncTest();
		base.WaitforElementPresentByXpath(SUBMIT_BUTTON_XPATH);
		base.EnterValueInTextField(UsernameTextboxLocator(), Username);
		base.EnterValueInTextField(PasswordTextboxLocator(), password);
		base.click(SubmitButtonLocator());
		String title = base.getTitle();
		return title;
		
		
		
	}
	
	public String SignInFail(String Username,String password) throws Exception
	{
		
		base.Launch_FuncTest();
		base.WaitforElementPresentByXpath(SUBMIT_BUTTON_XPATH);
		base.EnterValueInTextField(UsernameTextboxLocator(), Username);
		base.EnterValueInTextField(PasswordTextboxLocator(), password);
		base.click(SubmitButtonLocator());
		String title = base.getTitle();
		return title;
		
	}
	
	public String ClickForgotpassword() throws Exception
	{
		
		base.Launch_FuncTest();
		base.WaitforElementPresentByXpath(SUBMIT_BUTTON_XPATH);
		base.click(ForgotPasswordLinkLocator());
		base.WaitforElementPresentByXpath(RESET_BUTTON_XPATH);
		String title = base.getTitle();
		return title;
	}
	

	
	
	
}
