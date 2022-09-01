package com.booking.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetailsPage 
{
	@FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'][@style]")
	private WebElement Title_Mr_Dropdown;
	
	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	private WebElement First_and_middle_name_TextField;
	
	@FindBy(xpath = "//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy' and @data-testid='last-inputbox-contact-details']")
	private WebElement Last_Name_TextField;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar'][normalize-space()=' +91'])[1]")
	private WebElement Contact_Number_Country_code;
	
	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	private WebElement Contact_Number_TextField;
	
	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	private WebElement Email_Address_TextField;
	
	@FindBy(xpath = "//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy' and @data-testid='city-inputbox-contact-details']")
	private WebElement Town_Or_City;
	
	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'][text()='Retain my details for the next visit.']")
	private WebElement CheckBox1;

	@FindBy(xpath = "///div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'][text()='I prefer not to receive future communication and newsletter from SpiceJet over text, WhatsApp or e-mail.']")
	private WebElement CheckBox2;

	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'][text()='I have a GST number (optional)']")
	private WebElement CheckBox3;

	public WebElement getTitle_Mr_Dropdown() {
		return Title_Mr_Dropdown;
	}

	public WebElement getFirst_and_middle_name_TextField() {
		return First_and_middle_name_TextField;
	}

	public WebElement getLast_Name_TextField() {
		return Last_Name_TextField;
	}

	public WebElement getContact_Number_Country_code() {
		return Contact_Number_Country_code;
	}

	public WebElement getContact_Number_TextField() {
		return Contact_Number_Country_code;
	}

	public WebElement getEmail_Address_TextField() {
		return Email_Address_TextField;
	}

	public WebElement getTown_Or_City() {
		return Town_Or_City;
	}

	public WebElement getCheckBox1() {
		return CheckBox1;
	}

	public WebElement getCheckBox2() {
		return CheckBox2;
	}

	public WebElement getCheckBox3() {
		return CheckBox3;
	}
	
	
	public void Title_Mr_Dropdown()
	{
		Title_Mr_Dropdown.click();
	}
	
	public void First_and_middle_name_TextField()
	
	{
		First_and_middle_name_TextField.sendKeys("sudhakar");
	}
	
	

	public void Last_Name_TextField()
	
	{
		Last_Name_TextField.sendKeys("Metri");
	}
	
	

	public void Contact_Number_TextField()
	
	{
		Contact_Number_TextField.sendKeys("9932673453");
	}
	
	

	public void Contact_Number_Country_code()
	
	{
		Contact_Number_Country_code.click();
	}
	
	

	public void Email_Address_TextField()
	
	{
		Email_Address_TextField.sendKeys("smetri194@gmail.com");
	}
	
	

	public void Town_Or_City()
	
	{
		Town_Or_City.sendKeys("Kalburgi");;
	}
	
	

	public void CheckBox1()
	
	{
		CheckBox1.click();
	}
	
	

	public void CheckBox2()
	
	{
		CheckBox2.click();
	}
	
	
	

	public void CheckBox3()
	
	{
		CheckBox3.click();
	}
	
}
