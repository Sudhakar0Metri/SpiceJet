package com.booking.pagerepository;

import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.booking.genericLib.Base;

public class SpicejetHomePage 
{

	
	@FindBy(xpath = "//div[.='Departure Date']")
	private WebElement Departure_date;
	
	
	
	@FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'][text()= 'Return Date']")
	private WebElement Return_Date;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088' and  @data-testid='undefined-month-September-2022']")
	private WebElement Calender_Month_POPUP;
	

	@FindBy(  xpath =  "//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088' and  @data-testid='undefined-month-August-2022']/*//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][text()='\"+Currentdate+\"']")
	private WebElement Selecting_Date1;
	
	
	
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088' and  @data-testid='undefined-month-August-2022']/*//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][text()='\"+FutureDate+\"']")
	private WebElement Selecting_Date2;
	
	@FindBy(xpath = "(//*[.='Search Flight'])[2]")
	private WebElement Search_Flight;
	
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	private WebElement From;
	
	@FindBy(xpath = "//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu' and @value='Select Destination']")
	private WebElement To_Destination;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'][normalize-space()='Bengaluru']")
	private WebElement From_Select_City;

	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'][normalize-space()='Ahmedabad']")
	private WebElement Select_City;

	public WebElement getDeparture_date() {
		return Departure_date;
	}

	public WebElement getReturn_Date() {
		return Return_Date;
	}

	public WebElement getCalender_Month_POPUP() {
		return Calender_Month_POPUP;
	}

	public WebElement getSelecting_Date1() {
		return Selecting_Date1;
	}

	public WebElement getSearch_Flight() {
		return Search_Flight;
	}

	public WebElement getFrom() {
		return From;
	}

	public WebElement getFrom_Select_City() {
		return From_Select_City;
	}

	public WebElement getSelecting_Date2() {
		return Selecting_Date2;
	}

	public WebElement getTo_Destination() {
		return To_Destination;
	}

	public WebElement getSelect_City() {
		return Select_City;
	}
	//Business Library
	
	public void Departure_date()
	{
		Departure_date.click();
	}
	
	public void Return_Date()
	{
		Return_Date.click();
	}
	public void Calender_Month_POPUP()
	{
		Calender_Month_POPUP.click();
	}
	public void Selecting_Date1()
	{
		Selecting_Date1.click();
	}
	
	public void Selecting_Date2()
	{
		Selecting_Date2.click();
	}
	
	public void Search_Flight()
	{
		Search_Flight.click();
	}
	public void From()
	{
		From.click();
	}
	public void To_Destination()
	{
		To_Destination.click();
	}
	public void Select_City()
	{
		Select_City.click();
	}
	
	public void From_Select_City()
	{
		From_Select_City.click();
	}
	
	
}
