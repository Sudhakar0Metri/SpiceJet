package com.booking.pagerepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.booking.genericLib.Utility;

public class Home 
{
	// elements
		@FindBy(xpath="//a[@data-group=\"men\"]")
		private WebElement Men;
	
		@FindBy(xpath="//a[@data-group=\"women\"]")
		private WebElement Women;
		
		@FindBy(xpath="//a[@data-group=\"kids\"]")
		private WebElement Kids;
		
		@FindBy(xpath="//a[@data-group='home-&-living']")
		private WebElement HomeLiving;
		
		@FindBy(xpath="//a[@data-group='offers']")
		private WebElement Offer;
		
	
	// getter methods
		
		
		public WebElement getMen() {
			return Men;
		}

		public WebElement getWomen() {
			return Women;
		}

		public WebElement getKids() {
			return Kids;
		}

		public WebElement getHomeLiving() {
			return HomeLiving;
		}

		public WebElement getOffer() {
			return Offer;
		}

	
	//business logic
		
		public void men(WebDriver driver) throws InterruptedException
		{
			String s = Men.getText();
			String curl = Men.getAttribute("href");
			String nstr = s.concat(" ---------> ").concat(curl);
			Reporter.log(nstr, true);
			Reporter.log("--------------------------------------------------", true);
			Thread.sleep(5000);
			
			Utility.mouseAction(driver, Men);
		}

		
		public void women(WebDriver driver) throws InterruptedException
		{
			String s = Women.getText();
			String curl = Men.getAttribute("href");
			String nstr = s.concat(" ---------> ").concat(curl);
			Reporter.log(nstr, true);
			Reporter.log("--------------------------------------------------", true);
			Thread.sleep(5000);
			
			Utility.mouseAction(driver, Women);
		}
		
		public void kids(WebDriver driver) throws InterruptedException
		{
			String s = Kids.getText();
			String curl = Men.getAttribute("href");
			String nstr = s.concat(" ---------> ").concat(curl);
			Reporter.log(nstr, true);
			Reporter.log("--------------------------------------------------", true);
			Thread.sleep(5000);
			
			Utility.mouseAction(driver, Kids);
		}
		
		public void homeLiving(WebDriver driver) throws InterruptedException
		{
			String s = HomeLiving.getText();
			String curl = Men.getAttribute("href");
			String nstr = s.concat(" ---------> ").concat(curl);
			Reporter.log(nstr, true);
			Reporter.log("--------------------------------------------------", true);
			Thread.sleep(5000);
			
			Utility.mouseAction(driver, HomeLiving);
		}
		public void offers(WebDriver driver) throws InterruptedException
		{
			String s = Offer.getText();
			String curl = Men.getAttribute("href");
			String nstr = s.concat(" ---------> ").concat(curl);
			Reporter.log(nstr, true);
			Reporter.log("--------------------------------------------------", true);
			Thread.sleep(5000);
			
			Utility.mouseAction(driver, Offer);
		}
	
	
}
