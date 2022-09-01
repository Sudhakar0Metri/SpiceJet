package com.booking.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengerInfoPage 
{
	@FindBy(xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'][text()='I am flying as the primary passenger']")
	private WebElement P1_Check_Box;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[2]")
	private WebElement Title;
	
	@FindBy(xpath = "//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy' and @data-testid='traveller-0-first-traveller-info-input-box']")
	private WebElement First_and_middle_name ;
	
	@FindBy(xpath = "//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy' and @data-testid='traveller-0-last-traveller-info-input-box']")
	private WebElement Last_name;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar'])[3]")
	private WebElement Country_Code_Dropdown;
	
	@FindBy(xpath = "//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy' and @data-testid='sc-member-mobile-number-input-box']")
	private WebElement Contact_Number_TextField;
	
	@FindBy(xpath = "//*[.='Continue']")
	private WebElement Continue_Button;
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-adyw6z r-1kfrs79'][text()='Continue'])[3]/..")
	private WebElement Payments_Continue_Button;

	@FindBy(xpath = "//span[@id='skipfrompopup']")
	private WebElement skipPOPUP;


	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1dzdj1l r-rs99b7 r-z80fyv r-1777fci r-1qahzrx r-1t01tom r-19wmn03']")
	private WebElement checkbox;
	
	
	
	public WebElement getP1_Check_Box() {
		return P1_Check_Box;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getFirst_and_middle_name() {
		return First_and_middle_name;
	}

	public WebElement getLast_name() {
		return Last_name;
	}

	public WebElement getCountry_Code_Dropdown() {
		return Country_Code_Dropdown;
	}

	public WebElement getContact_Number_TextField() {
		return Contact_Number_TextField;
	}

	public WebElement getContinue_Button() {
		return Continue_Button;
	}

	public WebElement getPayments_Continue_Button() {
		return Payments_Continue_Button;
	}	

	public WebElement getskipPOPUP() {
		return skipPOPUP;
	}

	public WebElement getcheckbox() {
		return checkbox;
	}

	
	
	public void P1_Check_Box()	{
		P1_Check_Box.click();
	}

	public void Title(){
		Title.click();
	}

	public void First_and_middle_name(){
		First_and_middle_name.sendKeys("Sudhakar");
	}
	
	public void Last_name(){
		Last_name.sendKeys("metri");
	}
	
	public void Country_Code_Dropdown(){
		Country_Code_Dropdown.click();
	}

	public void Contact_Number_TextField()	{
		Contact_Number_TextField.sendKeys("9932673453");
	}

	public void Continue_Button(){
		Continue_Button.click();
	}	

	public void Payments_Continue_Button(){
		Payments_Continue_Button.click();
	}
	public void skipPOPUP(){
		skipPOPUP.click();
	}
	public void checkbox(){
		checkbox.click();
		
	}
}
