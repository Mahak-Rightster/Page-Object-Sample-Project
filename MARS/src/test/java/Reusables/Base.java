package Reusables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static org.testng.AssertJUnit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

import Reusables.Constants;

import java.awt.AWTException;
import java.awt.Robot;



public class Base extends DriverLoad{
	
	
	private static Logger logger = Logger.getLogger(Base.class);
	public void Launch_FuncTest()
	
	{
		getFirefox().navigate().to("https://176.34.240.152/user/login");
	}
	
	
	public WebElement FindElementById(String ID)
	{
		WebElement element = config.get("Firefox").findElement(By.id(ID));
		return element;
	}
	
	public WebElement FindElementByName(String Name)
	{
		WebElement element = config.get("Firefox").findElement(By.name(Name));
		return element;
	}
	
	public WebElement FindElementByXpath(String Xpath)
	{
		
		WebElement element = config.get("Firefox").findElement(By.xpath(Xpath));
		return element;
	}
	
	public WebElement FindElementByClass(String classname)
	{
		
		WebElement element = config.get("Firefox").findElement(By.className(classname));
		return element;
	}
	
	public WebElement FindElementByLink(String LinkText)
	{
		
		WebElement element = config.get("Firefox").findElement(By.linkText(LinkText));
		return element;
	}
	
	public WebElement FindElementByPartialLinkText(String LinkText)
	{
		
		WebElement element = config.get("Firefox").findElement(By.partialLinkText(LinkText));
		return element;
	}
	
	public WebElement FindElementByTextPresentOnPageUsingTagname(String TagName, String Text)
	{
		List<WebElement> elements = config.get("Firefox").findElements(By.tagName(TagName));
		HashMap<String, WebElement> TagText = new HashMap<String, WebElement>();
		Iterator<WebElement> iterator = elements.iterator();
		for (int i = 0; i < elements.size(); i++) 
			{
				WebElement element = iterator.next();
				String LabelText = element.getText();
				TagText.put(LabelText, element);
			}
		WebElement ElementFound = TagText.get(Text);
		return ElementFound;
	}
	
	public WebElement FindElementsByClassName(String ClassName)
	{
		List<WebElement> elements = config.get("Firefox").findElements(By.className(ClassName));
		Iterator<WebElement> iterator = elements.iterator();
		WebElement element = iterator.next();
		return element;
			
	}
	
	public WebElement FindElementByChainedClassNames(String FirstIdentifier, String SecondIdentifier)
	{
		List<WebElement> elements = config.get("Firefox").findElements(new ByChained(By.className(FirstIdentifier),By.className(SecondIdentifier)));
		Iterator<WebElement> iterator = elements.iterator();
		WebElement element = iterator.next();
		return element;
	}
	
	public static List<WebElement> FindElementsByTextFromAList(List<WebElement> AllElements, String LabelText)
	{
		ArrayList<WebElement> OriginalList = new ArrayList<WebElement>(AllElements);
		ArrayList<WebElement> NewList = new ArrayList<WebElement>();
		Iterator<WebElement> iterator = OriginalList.iterator();
		String ExpectedText = LabelText;
		while(iterator.hasNext())
		{
			WebElement element = iterator.next();
			String ElementLabel = element.getText();
			if(ElementLabel.equalsIgnoreCase(ExpectedText))
			{
			NewList.add(element);
			}
		}
		return NewList;
		
	}
	
	
	
	public void WaitforElementPresentByXpath(String Xpath) throws InterruptedException
	{
		int numattempts = 0;
		int maxattempts = 5;
		//int WaitTime = 0;
		boolean success = false;
		
		
		 	 do
			 {
				 numattempts++;
				 //WaitTime = WaitTime+(1000*numattempts);
				 try
				 {
					 
				Thread.sleep(3000);
				 WebElement element = null;
				 element= FindElementByXpath(Xpath);
				 //System.out.println("Attempt 1"+WaitTime);
				 if(element != null)
				 {
				 success=true;
				 logger.info("Wait is over, element found!");
				 //System.out.println("Wait is over, element found!");
				 break;
				 }
				 else
				 {
					 logger.info("Could not find element");
					 //System.out.println("Cannot find the element");
				 }
				 }
				 
				 catch (NoSuchElementException e)
				 {
				 }
				 
			 }
		 	 
				 
			 
			 while(!success || numattempts<maxattempts);
		 	 
			 }
		
			
	public void EnterValueInTextField(WebElement element, String Value)
	{
		element.sendKeys(Value);
	}

	public void click(WebElement element)
	{
		element.click();
	}
	
	public void Submit(WebElement element)
	{
		element.submit();
	}
	
	public void SelectOptionFromADropdown(String option)
	{
		Select select = new Select(config.get("Firefox").findElement(By.tagName("select")));
		//select.deselectAll();
		select.selectByVisibleText(option);
	}
	public void SelectOptionsFromMultipleDropdowns(ArrayList<String> SelectOptions)
	{
		List<WebElement> DropDowns = config.get("Firefox").findElements(By.tagName("select"));
		Iterator<WebElement> iterator1 = DropDowns.iterator();
		Iterator<String> iterator2 = SelectOptions.iterator();
		for (int i = 0; i < DropDowns.size(); i++) 
		{
						WebElement element = iterator1.next();
						Select select = new Select(element);
						String option = iterator2.next();
						select.selectByVisibleText(option);
		}				
		
		
		//select.deselectAll();
		
	}
	
	
	public void PressEscape() throws AWTException, InterruptedException
	{
		
		Robot r= new Robot();
		r.keyPress(java.awt.event.KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		r.keyRelease(java.awt.event.KeyEvent.VK_ESCAPE);
	
		
	}
	
	
	
	public void AlertPopUpAccept()
	{
		Alert alert = config.get("Firefox").switchTo().alert();
		alert.accept();
	}
	
	public void AlertPopUpDeny()
	{
		Alert alert = config.get("Firefox").switchTo().alert();
		alert.dismiss();
	}
	
	public String getTitle()
	{
		
		String title = config.get("Firefox").getTitle();
		return title;
		
	}
	
	
	
	public void SetCountryRestrictions(ArrayList<String> AllowedCountriesList) throws InterruptedException
	{
		String ContinentXPath;
		String CountryName;
		String CountryNameInputID;
		ArrayList<String> AllowedCountries = new ArrayList<String>(AllowedCountriesList);
		Iterator<String> iterator = AllowedCountries.iterator();
		for (int i = 0; i < AllowedCountries.size(); i++) 
		{
			CountryName = iterator.next();
			Constants.PutContinentXpath();
			ContinentXPath = Constants.GetContinentXpath(CountryName);
			click(FindElementByXpath(ContinentXPath));
			Thread.sleep(4000);
			Constants.PutCountryInputID();
			CountryNameInputID=Constants.GetCountryInputID(CountryName);
			click(FindElementById(CountryNameInputID));
			
		}	
			
	}
	
	public void assertPageTitleSame(String ExpectedTitle, String ReturnedTitle)
	{
		String Title1 = ExpectedTitle;
		String Title2 = ReturnedTitle;
		assertTrue(Title1.equalsIgnoreCase(Title2));
	}
	
	public void assertPageTitleDifferent(String ExpectedTitle, String ReturnedTitle)
	{
		String Title1 = ExpectedTitle;
		String Title2 = ReturnedTitle;
		assertFalse(Title1.equalsIgnoreCase(Title2));
	}
	
	public void assertErrorMessageShown(WebElement element, String ErrorMessage)
	{
		String Expected_Error_Message = ErrorMessage;
		String Error_Message_Recieved = element.getText();
		System.out.println(Error_Message_Recieved);
		Error_Message_Recieved.equalsIgnoreCase(Expected_Error_Message);
		
	}
	
	public void assertTopAccountNameBookie(WebElement element, String AccountName)
	{
		String Bookie_Account_Name = AccountName;
		String Account_Name_Present = element.getText();
		System.out.println(Account_Name_Present);
		assertTrue(Bookie_Account_Name.equalsIgnoreCase(Account_Name_Present));
		
	}
	
	public void assertTopAccountNameRightster(WebElement element, String AccountName)
	{
		String Rightster_Account_Name = AccountName;
		String Account_Name_Present = element.getText();
		logger.info("Account Name"+Account_Name_Present);
	
		System.out.println(Account_Name_Present);
		assertTrue(Rightster_Account_Name.equalsIgnoreCase(Account_Name_Present));
		
	}
	
	public void assertElementPresentByXpath(String XPathExpectedElement)
	{
		String ExpectedElement = XPathExpectedElement;
		assertNotNull(FindElementByXpath(ExpectedElement));
	}
	
	public void assertElementNotPresentByXpath(String XPathExpectedElement)
	{
		String ExpectedElement = XPathExpectedElement;
		assertNull(FindElementByXpath(ExpectedElement));
	}
	
	
	
	public void assertTextPresentOnPageByTagname(String TagName, String Text)
	{
		List<WebElement> elements = config.get("Firefox").findElements(By.tagName(TagName));
		ArrayList<String> TagText = new ArrayList<String>();
		Iterator<WebElement> iterator = elements.iterator();
		for (int i = 0; i < elements.size(); i++) {
						WebElement element = iterator.next();
						String LabelText = element.getText();
						System.out.println(LabelText);
						TagText.add(i, LabelText);
				
											}
		assertTrue(TagText.contains(Text));
		
	}
	
	public void assertTextFieldValueSame(String XpathTextField, String Text)
	{
		String ExpectedText = Text;
		String ActualText = FindElementByXpath(XpathTextField).getText();
		assertTrue(ActualText.equalsIgnoreCase(ExpectedText));
	}
	
	public void assertTextFieldEmpty(String XpathTextField)
	{
		String value = FindElementByXpath(XpathTextField).getText();
		assertNull(value);
	}
	

	
	public String SignOut() throws Exception
	{
		Constants c = new Constants();
		Launch_FuncTest();
		WaitforElementPresentByXpath(Constants.getSignOutXpath());
		click(c.SignOutLocator());
		String title = getTitle();
		return title;
	}
}

	
	

