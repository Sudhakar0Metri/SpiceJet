package com.spice_jet;

import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.booking.genericLib.Base;
import com.booking.genericLib.FileLib;
import com.booking.genericLib.Utility;
import com.booking.pagerepository.ContactDetailsPage;
import com.booking.pagerepository.FlightPage;
import com.booking.pagerepository.PassengerInfoPage;
import com.booking.pagerepository.SpicejetHomePage;

@Listeners(com.booking.genericLib.ListenerImp.class)
public class EndtoEnd extends Base
{
	FileLib lib = new FileLib();
	Utility u = new Utility();
	SpicejetHomePage shome;
	ContactDetailsPage cd;
	FlightPage fp;
	PassengerInfoPage pip;
	LocalDate nextmonth = null;
	String newmon;
	int newmonvalue;
	@Test
	
	public void bookingTicket() throws Throwable
	{
		
		shome = PageFactory.initElements(driver, SpicejetHomePage.class);
		cd = PageFactory.initElements(driver, ContactDetailsPage.class);
		fp = PageFactory.initElements(driver, FlightPage.class);
		pip = PageFactory.initElements(driver, PassengerInfoPage.class);
		
		
		shome.From();
		Reporter.log("Entered the Source address", true);
		

		
		shome.To_Destination();
		Reporter.log("Entered the destination address", true);
		
//		shome.Select_City();
//		Reporter.log("Entered the city in destination textfield", true);
//		
//		u.departuredate(driver);
//		
//		u.Returndate(driver);
//		Reporter.log("Entered the Return date", true);
//		
//		Thread.sleep(10000);
//		shome.Search_Flight();
//		Reporter.log("click on search flight button ", true);

		Thread.sleep(10000);
		fp.Continue_Button();
		Reporter.log("click on continue button", true);

		Thread.sleep(2000);
		//cd.Title_Mr_Dropdown();
		cd.First_and_middle_name_TextField();
		Reporter.log("Entered the first name", true);

		cd.Last_Name_TextField();
		Reporter.log("Entered the Last name", true);

		cd.Contact_Number_TextField();
		Reporter.log("Entered the contact number", true);

		cd.Email_Address_TextField();
		Reporter.log("Entered the email address", true);

		cd.Town_Or_City();
		Reporter.log("Entered the city", true);

		Thread.sleep(3000);
		cd.CheckBox1();
		Reporter.log("check the checkbox", true);

		Utility util = new Utility();
		Reporter.log("calling utilities", true);

		util.JSscrollAction(driver);
		Reporter.log("scrolling ", true);

		Thread.sleep(3000);
		pip.P1_Check_Box();
		Reporter.log("checkbox ", true);

		Thread.sleep(6000);
		pip.Continue_Button();
		Reporter.log("click on continue button", true);

		Thread.sleep(15000);
		util.JSscrollAction(driver);
		util.JSscrollAction(driver);
		util.JSscrollAction(driver);
		Thread.sleep(15000);

		pip.Payments_Continue_Button();
		Reporter.log("click on continue button on payment page", true);

		Thread.sleep(5000);
		pip.skipPOPUP();
		Reporter.log("skipping the popup", true);

		Thread.sleep(60000);
		util.UPscrollAction(driver);
		util.UPscrollAction(driver);
	}

}
