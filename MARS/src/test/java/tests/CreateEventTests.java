package tests;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.*;

import Objects.CreateEventObject;
import Reusables.Base;
import Reusables.Constants;

public class CreateEventTests 

{
	
	
	Base base;
	CreateEventObject createEvent;
	Constants constant;
	FileInputStream fi;
	Workbook w;
	Sheet s;
	
	@BeforeTest
	public void assessor() throws BiffException, IOException
	{
		createEvent = new CreateEventObject();
		base = new Base();
		constant = new Constants();
		fi= new FileInputStream(Constants.TestDataFileLocation);
		w = Workbook.getWorkbook(fi);
		s = w.getSheet(2);
	}
	
	/*Verify Event Creation*/
	@Test
	public void BasicEventCreationTest() throws InterruptedException 
	{
		String EventName = s.getCell(1,1).getContents();
		String PropertyName = s.getCell(1,2).getContents();
		String Category = s.getCell(1,3).getContents();
		String Status = s.getCell(1,4).getContents();
		String Location = s.getCell(1, 5).getContents();
		String AudioFeedType = s.getCell(1, 6).getContents();
		String Description = s.getCell(1,7).getContents();
		String EventStartTime  = s.getCell(1,8).getContents();
		String EventStartDate = s.getCell(1,9).getContents();
		String NumberOfMatches  = s.getCell(1,10).getContents();
		String EventEndTime = s.getCell(1,11).getContents();
		String EventEndDate = s.getCell(1,12).getContents();
		String SlateStartTime = s.getCell(1,13).getContents();
		String SlateStartDate = s.getCell(1,14).getContents();
		String SlateEndTime = s.getCell(1,15).getContents();
		String SlateEndDate = s.getCell(1,16).getContents();
		String Channel = s.getCell(1,17).getContents();
		
		
		
		createEvent.ReachCreateEvent();
		base.assertElementPresentByXpath(CreateEventObject.CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH);
		createEvent.EnterValuesScheduleTabPassPropertyDetailsOverriden(EventName, PropertyName, Category, Status, Location, AudioFeedType, Description, EventStartTime, EventStartDate, NumberOfMatches, EventEndTime, EventEndDate, SlateStartTime, SlateStartDate, SlateEndDate, SlateEndTime, Channel);
		base.WaitforElementPresentByXpath(CreateEventObject.CE_DEALS_TAB_ALLOW_FROM_IP_XPATH);
		base.assertElementPresentByXpath(CreateEventObject.CE_DEALS_TAB_ALLOW_FROM_IP_XPATH);
		base.click(base.FindElementByXpath(CreateEventObject.EVENTS_TAB_XPATH));
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENTS_SUB_TAB_XPATH);
		base.EnterValueInTextField(createEvent.SearchBoxLocator(), EventName);
		base.click(createEvent.SearchSubmitButtonLocator());
		base.WaitforElementPresentByXpath(CreateEventObject.CE_EVENTS_SUB_TAB_XPATH);
		base.assertTextPresentOnPageByTagname("a", EventName);
		
	}
	
	@Test
	public void EventCreationPropertyDetailsRetainedTest() throws InterruptedException
		{
			String EventName = s.getCell(1,20).getContents();
			String PropertyName = s.getCell(1,21).getContents();
			String Status = s.getCell(1,22).getContents();
			String Location = s.getCell(1,23).getContents();
			String AudioFeedType = s.getCell(1, 24).getContents();
			String Description = s.getCell(1,25).getContents();
			String EventStartTime  = s.getCell(1,26).getContents();
			String EventStartDate = s.getCell(1,27).getContents();
			String NumberOfMatches  = s.getCell(1,28).getContents();
			String Channel = s.getCell(1,29).getContents();
			
			createEvent.ReachCreateEvent();
			base.assertElementPresentByXpath(CreateEventObject.CE_SAVE_AND_ADD_DEALS_BUTTON_XPATH);
			createEvent.EnterValuesScheduleTabPassPropertyDetailsRetained(EventName, PropertyName, Status, Location, AudioFeedType, Description, EventStartTime, EventStartDate, NumberOfMatches, Channel);
			base.WaitforElementPresentByXpath(CreateEventObject.CE_DEALS_TAB_ALLOW_FROM_IP_XPATH);
			base.assertElementPresentByXpath(CreateEventObject.CE_DEALS_TAB_ALLOW_FROM_IP_XPATH);
			base.click(base.FindElementByXpath(CreateEventObject.EVENTS_TAB_XPATH));
			base.assertElementPresentByXpath(CreateEventObject.CE_EVENTS_SUB_TAB_XPATH);
			base.EnterValueInTextField(createEvent.SearchBoxLocator(), EventName);
			base.click(createEvent.SearchSubmitButtonLocator());
			base.WaitforElementPresentByXpath(CreateEventObject.CE_EVENTS_SUB_TAB_XPATH);
			base.assertTextPresentOnPageByTagname("a", EventName);
			
		}
	
	@Test
	public void SaveAndCreateAnotherEventTest() throws InterruptedException
	{
		String EventName = s.getCell(1,32).getContents();
		String PropertyName = s.getCell(1,33).getContents();
		String BookingStatus = s.getCell(1,34).getContents();
		String Location = s.getCell(1,36).getContents();
		String AudioFeedType = s.getCell(1, 35).getContents();
		String Description = s.getCell(1,37).getContents();
		String EventStartTime  = s.getCell(1,38).getContents();
		String EventStartDate = s.getCell(1,39).getContents();
		String NumberOfMatches  = s.getCell(1,40).getContents();
		String Channel = s.getCell(1,41).getContents();
		
		createEvent.ReachCreateEvent();
		base.assertElementPresentByXpath(CreateEventObject.CE_SAVE_AND_CREATE_ANOTHER_EVENT_BUTTON_XPATH);
		createEvent.EnterValuesScheduleTabPassAddDealLater(EventName, PropertyName, BookingStatus, Location, AudioFeedType, Description, EventStartTime, EventStartDate, NumberOfMatches, Channel);
		base.WaitforElementPresentByXpath(CreateEventObject.CE_TITLE_XPATH);
		base.assertTextFieldEmpty(CreateEventObject.CE_TITLE_XPATH);
		base.click(base.FindElementByXpath(CreateEventObject.EVENTS_TAB_XPATH));
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENTS_SUB_TAB_XPATH);
		base.EnterValueInTextField(createEvent.SearchBoxLocator(), EventName);
		base.click(createEvent.SearchSubmitButtonLocator());
		base.WaitforElementPresentByXpath(CreateEventObject.CE_EVENTS_SUB_TAB_XPATH);
		base.assertTextPresentOnPageByTagname("a", EventName);
	}
	
	public void OpenEventToEdit() throws InterruptedException
	{
		String EventToEdit = "UpdateSchedule";
		createEvent.OpenExistingEvent(EventToEdit);
	}
	
	
	//Ensure an event with the name UpdateSchedule exists in the system before you run the following tests
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditEventStartTimeTest()
	{
		String NewTime = s.getCell(1,44).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENT_START_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("EST", NewTime);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_EVENT_START_TIME_XPATH, NewTime);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditEventEndTimeTest()
	{
		String NewTime = s.getCell(1,44).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENT_END_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("EET", NewTime);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_EVENT_END_TIME_XPATH, NewTime);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditSlateStartTimeTest()
	{
		String NewTime = s.getCell(1,44).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_SLATE_START_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("SST", NewTime);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_SLATE_START_TIME_XPATH, NewTime);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditSlateEndTimeTest()
	{
		String NewTime = s.getCell(1,44).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_SLATE_END_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("SET", NewTime);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_SLATE_END_TIME_XPATH, NewTime);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditESTEET()
	{
		String NewTime1 = s.getCell(1,44).getContents();
		String NewTime2 = s.getCell(1,45).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENT_START_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("EST","EET", NewTime1, NewTime2);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_EVENT_START_TIME_XPATH, NewTime1);
		base.assertTextFieldValueSame(CreateEventObject.CE_EVENT_END_TIME_XPATH, NewTime2);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditEETSST()
	{
		String NewTime1 = s.getCell(1,44).getContents();
		String NewTime2 = s.getCell(1,45).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENT_START_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("EET","SST", NewTime1, NewTime2);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_EVENT_END_TIME_XPATH, NewTime1);
		base.assertTextFieldValueSame(CreateEventObject.CE_SLATE_START_TIME_XPATH, NewTime2);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditSSTSET()
	{
		String NewTime1 = s.getCell(1,44).getContents();
		String NewTime2 = s.getCell(1,45).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENT_START_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("SST","SET", NewTime1, NewTime2);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_SLATE_START_TIME_XPATH, NewTime1);
		base.assertTextFieldValueSame(CreateEventObject.CE_SLATE_END_TIME_XPATH, NewTime2);
	}
	
	@Test(dependsOnMethods = { "OpenEventToEdit" })
	public void EditSETEST()
	{
		String NewTime1 = s.getCell(1,44).getContents();
		String NewTime2 = s.getCell(1,45).getContents();
		base.assertElementPresentByXpath(CreateEventObject.CE_EVENT_START_TIME_XPATH);
		createEvent.UpdateEventScheduleTime("SET","EST", NewTime1, NewTime2);
		base.click(createEvent.SaveAndAddDealButtonLocator());
		base.click(createEvent.ScheduleTabLocator());
		base.assertTextFieldValueSame(CreateEventObject.CE_SLATE_END_TIME_XPATH, NewTime1);
		base.assertTextFieldValueSame(CreateEventObject.CE_EVENT_START_TIME_XPATH, NewTime2);
	}
	
	
	
	
		
}































































































































































































