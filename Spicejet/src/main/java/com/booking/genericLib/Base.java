package com.booking.genericLib;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;

import com.booking.pagerepository.Home;

@Listeners(com.booking.genericLib.ListenerImp.class)

public class Base 
{
	public WebDriver driver;
	public static WebDriver staticdriver;
	FileLib lib = new FileLib();
	
	Home home;
	
//	@Parameters("browser")
	
//  	if(browservar.equals("chrome")) //for cross browser action
//		else if(browservar.equals("firefox")) //for cross browser action
	
	@BeforeClass()
	public void configBC()
	{
//		if (lib.getDataFromPrpoertyFile("browser").equals("chrome")) 
//		{
			System.setProperty("webdriver.chrome.driver",".\\browsers\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
			staticdriver = driver;
//		}

//		else if (lib.getDataFromPrpoertyFile("browser").equals("firefox")) 
//		{
//			System.setProperty("webdriver.gecko.driver","E:\\selenium\\Myntra\\browsers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			staticdriver = driver;
//		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(lib.getDataFromPrpoertyFile("url"));
		
	}
	

//	@BeforeMethod
//	public void configBM()
//	{	
//		login = PageFactory.initElements(driver, Login.class);
//		login.Loginpage(lib.getDataFromPrpoertyFile("username"),lib.getDataFromPrpoertyFile("password"));
//		
//		Reporter.log("Login successfully" , true);
//	}
	
//	@AfterMethod
//	public void configAM()
//	{
//
//		home = PageFactory.initElements(driver, Home.class);
//		home.signout(driver);
//		
//		Reporter.log("Loggedout successfully" , true);
//	}
	
	
	@AfterClass
	public void cnfigAC()
	{
		driver.quit();
//		Reporter.log("Browser closed" , true);
	}
}
