package com.tobin.GenericLib;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommLib {

	
	 public String getPageTitle()
	 {
	return BaseClass.driver.getTitle(); 
	 }
	 
	 public void verifyPage(String actual,String expected,String pageName)
	 {
		 Assert.assertEquals(actual,expected);
		 Reporter.log( pageName+" is Displayed",true);
	 }
	 public void selectOption(WebElement element, String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void selectOption(String value, WebElement element)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public void selectOption(WebElement element, int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		public void waitForPageTitle(String title)
		{
			WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.titleContains(title));
		}

		public void elementDisplayed(WebElement element, String elementName)
		{
			if(element.isDisplayed())
			{
				Reporter.log(elementName+" is Displayed, PASS",true);
				Assert.assertTrue(true);
			}
			else
			{
				Reporter.log(elementName+" is not Displayed, FAIL",true);
				Assert.assertTrue(false);
			}


		
		}
}
