package com.trobin.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;


public class SignInPage {
	@FindBy(id="userName") private WebElement username;
	@FindBy(id="passWord") private WebElement password;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signInButon;
	public SignInPage() {
		
		PageFactory.initElements(BaseClass.driver,this);
		
	}
	public WebElement getusername()
	{
		return username;
	}
	public WebElement getpassword()
	{
		return password;
	}
	public WebElement getsignInButon()
	{
		return signInButon;
	}
	
	public void signIn(String un,String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		signInButon.click(); 
		
		
		
	}
}
