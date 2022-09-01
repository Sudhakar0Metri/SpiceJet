package com.booking.genericLib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Utility 
{

	public static void takeScreenshot(WebDriver driver,ITestResult result)
	{
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname);
		Date d = new Date();
		String[] dary = d.toString().split(" ");
		String date= dary[2];
		String Mon = dary[1];
		String year = dary[5];
		String time = dary[3];
		String t = time.replace(":", "-");
		
		TakesScreenshot img = (TakesScreenshot)Base.staticdriver;
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sudhakar Metri\\eclipse-workspace\\Screenshots\\"+methodname+"_"+date+"_"+Mon+"_"+year+"_"+t+".PNG");
		System.out.println("Screenshot taken");
		try 
		{
			FileUtils.copyFile(src, dest);
			/* earlier this code is working fine. bur now it's not becoz, 
			FileUtils. copyFile throws error as 'FileUtils cannot be resolved' error with selenium webdriver 
			because selenium was using a dependency to commons-io, but latest versions of Selenium is not 
			using. */
			
			//FileHandler.copy(src, dest);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void trial()
	{
		
	}
	
	public static void mouseAction(WebDriver driver, WebElement ele) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
	}

	public static void dropDown(WebElement ele, String value)
	{
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
		//js.executeScript("argument[0].scrollIntoView()",element);
	}
	/**
	 * This method perform random scroll
	 * @param driver
	 */
	public void JSscrollAction(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	
	public void UPscrollAction(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)", "");
	}

	FileLib lib = new FileLib();
	public void departuredate(WebDriver driver)
	{
		Date d = new Date();
		String[] Date = d.toString().split(" ");
		String Currentdate= Date[2];
		String Mon = Date[1];
//		String year =Date[5];
//		String time = Date[3];
//		String Mont;
		int date1 = Integer. parseInt(Currentdate);
		int newdate=date1+25;
		String newMon = Mon+"Mon";
		int monValue = Integer.parseInt(lib.getDataFromPrpoertyFile(newMon));
		
		 if(newdate>monValue)
		 {
			 newdate = newdate - monValue;
			 String monvalue = lib.getDataFromPrpoertyFile(Mon);
			 int valuemon = Integer.parseInt(monvalue);
			 valuemon+=1;
			 String newmonValue = String.valueOf(valuemon);
			 Mon = lib.getDataFromPrpoertyFile(newmonValue);
		 }
		 
		 driver.findElement(By.xpath("//div[contains(@data-testid,'" + Mon + "')]//div[contains(@data-testid,'"+newdate+"')]")).click();
	}
	
	String newmon; 
	int newmonValue;
	public void Returndate(WebDriver driver) throws InterruptedException
	{
		Date d = new Date();
		String[] Date = d.toString().split(" ");
		String Currentdate= Date[2];
		String Mon = Date[1];
		int date1 = Integer. parseInt(Currentdate);
		int Futuredate=date1+35;
		String newMon = Mon+"Mon";
		int monValue = Integer.parseInt(lib.getDataFromPrpoertyFile(newMon));
		
		 if(Futuredate>monValue)
		 {
			 Futuredate = Futuredate - monValue;
			 String monvalue = lib.getDataFromPrpoertyFile(Mon);
			 int valuemon = Integer.parseInt(monvalue);
			 valuemon+=1;
			 String newmonValue = String.valueOf(valuemon);
			 System.out.println(newmonValue);
			 Mon = lib.getDataFromPrpoertyFile(newmonValue);
			 System.out.println(Mon);
		 }
		 else
		 {
			 Mon=lib.getDataFromPrpoertyFile(Mon);
			 newmon=lib.getDataFromPrpoertyFile(Mon);
			 newmonValue=Integer.parseInt(newmon);
		 }
		Thread.sleep(3000);
		Reporter.log("Entered the departure date ", true);
		
		driver.findElement(By.xpath("//div[.='Return Date']")).click();
		driver.findElement(By.xpath("//div[contains(@data-testid,'" + Mon + "')]//div[contains(@data-testid,'"+Futuredate+"')]")).click();

	}
			
}
