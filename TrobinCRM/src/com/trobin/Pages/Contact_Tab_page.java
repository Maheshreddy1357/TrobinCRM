package com.trobin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;

public class Contact_Tab_page {
@FindBy(xpath="//input[@value='New Contact']") private WebElement new_contact_button;


public Contact_Tab_page()

{
PageFactory.initElements(BaseClass.driver,this);	
}

public WebElement getnew_contact_button()
{
return new_contact_button;

}
public void clicknew_contact_button()
{
	new_contact_button.click();
	}

}
