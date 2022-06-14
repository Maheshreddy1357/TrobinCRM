package com.trobin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;
import com.tobin.GenericLib.WebDriverCommLib;

public class CreateAccountpage {
	
	
	
	
	
	
@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accNameTb;
@FindBy(xpath="//input[@name='property(Account Site)']") private WebElement accSiteTb;
@FindBy(xpath="//input[@name='property(Account Number)']") private WebElement accNumberTb;
@FindBy(xpath="//select[@name='property(Account Type)']") private WebElement acctTypeDropdown;
@FindBy(xpath="(//input[@value='Save'])[1]") public WebElement saveButton;


public CreateAccountpage()
{
PageFactory.initElements(BaseClass.driver, this);	
}

public WebElement getAccNameTb() {
	return accNameTb;
}

public WebElement getAccSiteTb() {
	return accSiteTb;
}

public WebElement getAccNumberTb() {
	return accNumberTb;
}

public WebElement getAcctTypeDropdown() {
	return acctTypeDropdown;
}




public void newAccount(String accname,String accsite, String accnumber,String acctype) {
	accNameTb.sendKeys(accname);
	accSiteTb.sendKeys(accsite);
	accNumberTb.sendKeys(accnumber);
	
	WebDriverCommLib wlib=new WebDriverCommLib();
	wlib.selectOption(acctype, acctTypeDropdown);
	saveButton.click();
	
}
}


