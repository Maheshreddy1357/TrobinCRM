package com.trobin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;



public class Accounts_page {
	@FindBy(xpath="//input[@value='New Account']") private WebElement createAccountbutton;
	
	public Accounts_page() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
 public WebElement getcreateAccountbutton() {
	 return createAccountbutton;
	 
 }
 public void clickCreateAccountbutton()
 {
	 createAccountbutton.click();
}
}