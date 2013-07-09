package tests;

import java.util.ArrayList;

import org.testng.annotations.*;

import Objects.CreatePropertyObject;
import Reusables.Base;
import Reusables.Constants;
import org.apache.log4j.Logger;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.FileInputStream;


public class CreatePropertyTests {

	private static Logger logger = Logger.getLogger(Base.class);
	Base base;
	CreatePropertyObject CreateProperty;
	Constants constant;
	FileInputStream fi;
	Workbook w;
	Sheet s;
	
	
	@BeforeTest
	public void assessor() throws BiffException, IOException
	{
		CreateProperty = new CreatePropertyObject();
		base = new Base();
		constant = new Constants();
		fi= new FileInputStream("C:\\Users\\rightster\\Documents\\MARSTestInput1405.xls");
		w = Workbook.getWorkbook(fi);
		s = w.getSheet(1);
	}
	

	@Test
	public void IMGPropertyCreationTest() throws Exception
	{
		logger.info("Verify Property Creation - IMG");
		
		ArrayList<String> CountriesAllowedAccess = new ArrayList<String>();
		CountriesAllowedAccess.add((s.getCell(1,1).getContents()));
		CountriesAllowedAccess.add((s.getCell(2,1).getContents()));
		CountriesAllowedAccess.add((s.getCell(3,1).getContents()));
		String WhiteListIPFrom = s.getCell(1,2).getContents();
		String WhiteListIPTo = s.getCell(1,3).getContents();
		String BlackListIPFrom = s.getCell(1,4).getContents();
		String BlackListIPTo = s.getCell(1,5).getContents();
		String PropertyName = s.getCell(1, 6).getContents();
		String Category = s.getCell(1,7).getContents();
		String EventDuration = "00:10";
		String SlateDuration = "00:05";
		String EncodingService = s.getCell(1, 8).getContents();
		
		
		CreateProperty.EnterValuesDetailsTabPass(PropertyName, Category, EventDuration, SlateDuration, EncodingService);
		base.assertElementPresentByXpath(CreatePropertyObject.ALLOW_ALL_XPATH);
		CreateProperty.EnterValueRestrictionsTabPassThreeCountriesAllowed(CountriesAllowedAccess, WhiteListIPFrom, WhiteListIPTo, BlackListIPFrom, BlackListIPTo);
		base.assertElementPresentByXpath(CreatePropertyObject.CREATE_EVENT_BUTTON_XPATH);
		
		logger.info("Search property in Property directory");
		
		base.click(base.FindElementByXpath(CreatePropertyObject.EVENTS_AND_PROPERTIES_XPATH));
		base.WaitforElementPresentByXpath(CreatePropertyObject.PROPERTIES_SUBTAB_XPATH);
		base.click(base.FindElementByXpath(CreatePropertyObject.PROPERTIES_SUBTAB_XPATH));
		base.assertTextPresentOnPageByTagname("a", PropertyName);
		
		
	}
	
	@Test
	public void AFLPropertyCreationTest() throws Exception
	{
		logger.info("Verify Property Creation - AFL");
	
		
		ArrayList<String> CountriesAllowedAccess = new ArrayList<String>();
		CountriesAllowedAccess.add((s.getCell(1,11).getContents()));
		CountriesAllowedAccess.add((s.getCell(2,11).getContents()));
		CountriesAllowedAccess.add((s.getCell(3,11).getContents()));
		String WhiteListIPFrom = s.getCell(1,12).getContents();
		String WhiteListIPTo = s.getCell(1,13).getContents();
		String BlackListIPFrom = s.getCell(1,14).getContents();
		String BlackListIPTo = s.getCell(1,15).getContents();
		String PropertyName = s.getCell(1,16).getContents();
		String Category = s.getCell(1,17).getContents();
		String EventDuration = "00:10";
		String SlateDuration = "00:05";;
		String EncodingService = s.getCell(1,18).getContents();
		
		
		
		CreateProperty.EnterValuesDetailsTabPass(PropertyName, Category, EventDuration, SlateDuration, EncodingService);
		base.assertElementPresentByXpath(CreatePropertyObject.ALLOW_ALL_XPATH);
		CreateProperty.EnterValueRestrictionsTabPassThreeCountriesAllowed(CountriesAllowedAccess, WhiteListIPFrom, WhiteListIPTo, BlackListIPFrom, BlackListIPTo);
		base.assertElementPresentByXpath(CreatePropertyObject.CREATE_EVENT_BUTTON_XPATH);
		
		logger.info("Search property in Property directory");
		
		base.click(base.FindElementByXpath(CreatePropertyObject.EVENTS_AND_PROPERTIES_XPATH));
		base.WaitforElementPresentByXpath(CreatePropertyObject.PROPERTIES_SUBTAB_XPATH);
		base.click(base.FindElementByXpath(CreatePropertyObject.PROPERTIES_SUBTAB_XPATH));
		base.assertTextPresentOnPageByTagname("a", PropertyName);
		
		
	}
	
	@Test
	public void VerifyContactsTabCanBeEdited()
	{
		
	}
	
}