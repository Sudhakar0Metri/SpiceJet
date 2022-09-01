package com.booking.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPage 
{
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79'][normalize-space()='20:00']")
	private WebElement select_departing_time;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-14lw9ot r-cqee49 r-ubezar r-1e081e0 r-7xmw5f r-136ojw6'][normalize-space()='2h 30m']")
	private WebElement select_duration_time ;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79'][normalize-space()='08:55']")
	private WebElement select_Arrives_time;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='DEL']")
	private WebElement select_departing_city ;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='BLR']")
	private WebElement select_Arrives_city;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='svg-img'])[12]")
	private WebElement price_Choosing;
	
	@FindBy(xpath = "(//*[.='Continue'])[1]")
	private WebElement Continue_Button;
	
	public WebElement getSelect_departing_time() {
		return select_departing_time;
	}
	public WebElement getSelect_duration_time() {
		return select_duration_time;
	}
	public WebElement getSelect_Arrives_time() {
		return select_Arrives_time;
	}
	public WebElement getSelect_departing_city() {
		return select_departing_city;
	}
	public WebElement getSelect_Arrives_city() {
		return select_Arrives_city;
	}
	public WebElement getPrice_Choosing() {
		return price_Choosing;
	}
	public WebElement getContinue_Button() {
		return Continue_Button;
	}
	
	public void select_departing_time()
	{
		select_departing_time.click();
	}
	
	public void select_duration_time()
	{
		select_duration_time.click();
	}
	
	public void select_Arrives_time()
	{
		select_Arrives_time.click();
	}
	
	public void select_departing_city()
	{
		select_departing_city.click();
	}
	
	public void select_Arrives_city()
	{
		select_Arrives_city.click();
	}
	
	public WebElement price_Choosing()
	{
		price_Choosing.click();
		return price_Choosing();
	}
	
	public void Continue_Button()
	{
		Continue_Button.click();
	}
}
