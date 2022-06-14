package com.trobin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;

public class Account_Details_Page {
	@FindBy(xpath="//span[text()='Myaccount']") private WebElement accnameText;
	@FindBy(xpath="//span[text()='mysite']") private WebElement accSiteText;
	@FindBy(xpath="//span[text()='123456']") private WebElement accNumText;
	@FindBy(xpath="//span[text()='Customer']") private WebElement accTypeText ;
	
	public Account_Details_Page()
	{
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	public WebElement getaccname()

	{
		return accnameText;
		
		}

	public String getaccNameText()
	{
		return accnameText.getText();
	}
	public WebElement getaccsite()

	{
		return accSiteText;
		
		}

	public String getaccSiteText()
	{
		return accSiteText.getText();
	}

public WebElement getaccnum()

{
	return accNumText;
	
	}

public String getaccNumText()
{
	return accNumText.getText();
}
public WebElement getaccType()

{
	return accTypeText;
	
	}

public String getaccTypeText()
{
	return accTypeText.getText();
}
}

