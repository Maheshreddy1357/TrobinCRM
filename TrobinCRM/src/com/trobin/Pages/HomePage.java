package com.trobin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;

public class HomePage {
@FindBy(xpath= "//a[text()='Accounts']") private WebElement accountTab;
@FindBy(xpath="//a[text()='Contacts']") private WebElement contactTab;

public HomePage() {
	
	PageFactory.initElements(BaseClass.driver,this);
}

public WebElement getAccountTab() {
	return accountTab;
}

public WebElement getContactTab()
{
	
	return contactTab;
	}

public  void clickaccountTab()
{
	accountTab.click();
	}

public void clickContactTab() {
	
	contactTab.click();
}
}



