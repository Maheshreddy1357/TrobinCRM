package com.tobin.GenericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass implements IAutoConstants{
 public static  WebDriver driver;
       @BeforeClass
	   public void openBrowser() throws Throwable
	   {
		 FileLib flib=new FileLib();
	     String browser=	flib.readPropertyData(properties_path, "browser"); 
		 if(browser.equalsIgnoreCase("chrome"))
			
		{
		 System.setProperty(chrome_key, chrome_value);
		 driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		 System.setProperty(firefox_key, firefox_value);
		 driver=new FirefoxDriver();
		}
		else { 
		 Reporter.log("enter valid browser name",true);
		}
		 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String appurl=flib.readPropertyData(properties_path, "url");
			
		driver.get(appurl);
		
		 WebDriverCommLib wLib=new WebDriverCommLib();
		 wLib.verifyPage(wLib.getPageTitle(),
				flib.readPropertyData(properties_path, "loginTitle"),"Login page ");
		
		}	
	
	     @AfterClass (enabled=false) 
	     public void closeBrowser()
	    {
		
		driver.quit();
		
	   }
	
}
