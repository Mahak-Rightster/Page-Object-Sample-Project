package tests;


import Objects.SignInObject;
import Reusables.*;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class SignInTests 
{

	Base base;
	SignInObject signin;
	Constants constant;
	
	@BeforeTest
	public void assessor()
	{
		signin = new SignInObject();
		base = new Base();
		constant = new Constants();
		
	}
	
	/*Verify sign-in fails when user-name field is left blank. 
	 * Verify error message and screen-title*/
	
	@Test
	public void SignInNoUserName() throws Exception
	{
		String PageTitleReturned;
		PageTitleReturned = signin.SignInFail("", "password");
		
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		//base.WaitTwoSeconds();;
		
		base.WaitforElementPresentByXpath(SignInObject.USER_NAME_XPATH);
		base.assertPageTitleDifferent(ExpectedTitle, PageTitleReturned);
		
		String ErrorMessage;
		ErrorMessage = SignInObject.ERR_MSG_NO_EMAIL;
		
		WebElement element = signin.ErrMsgNoEmailLocator();
		base.assertErrorMessageShown(element, ErrorMessage);
		
	}
	
	/*Verify sign-in fails when password field is left blank. 
	 * Verify error message and screen-title*/
	@Test
	public void SignInNoPassword() throws Exception
	{
		String PageTitleReturned;
		PageTitleReturned = signin.SignInFail("mahak@rightster.com", "");
		
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		
		//base.WaitTwoSeconds();
		base.WaitforElementPresentByXpath(SignInObject.USER_NAME_XPATH);
		base.assertPageTitleDifferent(ExpectedTitle, PageTitleReturned);
		
		String ErrorMessage;
		ErrorMessage = SignInObject.ERR_MSG_NO_PASS;
		
		WebElement element = signin.ErrMsgNoPasswordLocator();
		base.assertErrorMessageShown(element, ErrorMessage);
		
	}
	
	/*Verify sign-in works for a bookie user*/
	@Test
	public void SignInBookieUserTest() throws Exception
	{
		String PageTitleReturned;
		PageTitleReturned = signin.SignInPass("dryandsunny3@gmail.com", "mahak1234");
		//base.WaitTwoSeconds();
		base.WaitforElementPresentByXpath(SignInObject.ACCOUNT_NAME_TOP_XPATH);
		
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		
		base.assertPageTitleSame(ExpectedTitle, PageTitleReturned);
		
		String BookieAccountName;
		BookieAccountName = SignInObject.TEST_ACCOUNT_NAME;
		
		WebElement element = signin.AccountNameTopLocator();
		base.assertTopAccountNameBookie(element, BookieAccountName);
		
		base.click(constant.SignOutLocator());
	
		
	}
	
	/*Verify sign-in works for a Rightster Admin user*/
	@Test
	public void SignInRightsterUserTest() throws Exception
	{
		String PageTitleReturned;
		PageTitleReturned = signin.SignInPass("mahak@rightster.com", "istherelifeonmars");
		//base.WaitTwoSeconds();
		base.WaitforElementPresentByXpath(SignInObject.ACCOUNT_NAME_TOP_XPATH);
		
		String ExpectedTitle = SignInObject.PAGE_TITLE_EPG_SCREEN;
		
		base.assertPageTitleSame(ExpectedTitle, PageTitleReturned);
		
		String RightserAccountName;
		RightserAccountName = SignInObject.RIGHTSTER_ACCOUNT_NAME;
		
		WebElement element = signin.AccountNameTopLocator();
		base.assertTopAccountNameBookie(element, RightserAccountName);
		
		base.click(constant.SignOutLocator());
	
		
	}
	
/*Verify forgot password works*/
	
	@Test
	public void TestForgotPassword() throws Exception
	{
		String PageTitleReturned;
		PageTitleReturned = signin.ClickForgotpassword();

		
		String ExpectedTitle = SignInObject.PAGE_TITLE_FORGOT_PASSWORD;
		
		base.assertPageTitleSame(ExpectedTitle, PageTitleReturned);
		
		
	}
	
	

}
