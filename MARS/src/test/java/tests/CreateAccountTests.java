package tests;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import Objects.CreateAccountObject;
import Reusables.*;


//import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class CreateAccountTests {
	
	//private static Logger logger = Logger.getLogger(Base.class);
	
	Base base;
	CreateAccountObject CreateAccount;
	Constants constant;
	FileInputStream fi;
	Workbook w;
	Sheet s;
	
	
	@BeforeTest
	public void assessor() throws BiffException, IOException
	{
		CreateAccount = new CreateAccountObject();
		base = new Base();
		constant = new Constants();
		fi= new FileInputStream("C:\\Users\\rightster\\Documents\\MARSTestInput.xls");
		w = Workbook.getWorkbook(fi);
		s = w.getSheet(0);
	}
	
//Verify account creation
	@Test
	public void BasicAccountCreationTest() throws InterruptedException
	{
		
		String AccountName = s.getCell(1,1).getContents();
		String UserName = (s.getCell(1,2).getContents());
		String UserEmail = (s.getCell(1,3).getContents());
		
		//Enter details
		CreateAccount.EnterValuesDetailsTabPass(AccountName);
		base.WaitforElementPresentByXpath(CreateAccountObject.USER_EMAIL_XPATH);
		base.assertElementPresentByXpath(CreateAccountObject.USER_NAME_XPATH);
		CreateAccount.EnterValuesUsersTabPass(UserName, UserEmail);
		base.WaitforElementPresentByXpath(CreateAccountObject.CONTINUE_BUTTON_CONTRACTS_TAB_XPATH);
		
		base.assertElementPresentByXpath(CreateAccountObject.UPLOAD_CONTRACTS_XPATH);
		
		base.click(CreateAccount.ContinueButtonContractsTabLocator());
		
		//Check Directory for account created
		 base.click(CreateAccount.AccountsTabLocator());
		 base.WaitforElementPresentByXpath(CreateAccountObject.DIRECTORY_BUTTON_XPATH);
		 base.click(CreateAccount.DirectoryButtonLocator());
		 base.assertTextPresentOnPageByTagname("h1", AccountName+"      Edit");
		 
		
	}
	
	//verify add another button works 
	
	@Test
	public void AddAnotherUserTest() throws Exception
	{
		String AccountName = s.getCell(1,6).getContents();
		CreateAccount.EnterValuesDetailsTabPass(AccountName);
		base.WaitforElementPresentByXpath(CreateAccountObject.USER_EMAIL_XPATH);
		base.click(CreateAccount.AddAnotherUsersTabLocator());
		base.assertElementPresentByXpath(CreateAccountObject.USER_EMAIL_2_XPATH);
		
	}
	
	//Verify 25 users can be added to an account
	
	@Test
	public void Add25UsersTest() throws Exception
	{
		String AccountName = s.getCell(1,9).getContents();
		CreateAccount.OpenExistingAccountPass(AccountName);
		base.click(CreateAccount.UsersTabLocator());
		base.WaitforElementPresentByXpath(CreateAccountObject.USER_EMAIL_XPATH);
		int UserCount = 1;
		do
		{
		UserCount++;
		base.click(CreateAccount.AddAnotherLinkLocator());
		Thread.sleep(1000);
		String UserNameXpath="html/body/div[1]/div/div[2]/form/div/div[1]/div["+UserCount+"]/div[1]/input[1]";
		String UserEmailXpath="html/body/div[1]/div/div[2]/form/div/div[1]/div["+UserCount+"]/div[2]/input";
		String UserName="User"+UserCount+"Of 25";
		String UserEmail="User"+UserCount+"of 25@auto.com";
		base.EnterValueInTextField(base.FindElementByXpath(UserNameXpath), UserName);
		base.EnterValueInTextField(base.FindElementByXpath(UserEmailXpath), UserEmail);
		}
		
		while(UserCount<25);
		base.click(CreateAccount.ContinueButtonUsersTabLocator());
	}
	
	
}
