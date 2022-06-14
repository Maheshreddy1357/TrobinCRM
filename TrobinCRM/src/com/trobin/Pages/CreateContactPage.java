package com.trobin.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tobin.GenericLib.BaseClass;
import com.tobin.GenericLib.WebDriverCommLib;



public class CreateContactPage {
	@FindBy(xpath="//select[@name='property(Lead Source)']") private WebElement  leadSource;
	@FindBy(xpath="//select[@name='property(saltName)']") private WebElement  salutationDropdown;
	@FindBy(xpath="//input[@name='property(First Name)']") private WebElement  firstName; 	
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement  lastname;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accName;
	@FindBy(xpath="//a[text()='accenture']") public WebElement acc;
	
	@FindBy(xpath="//input[@name='property(Email)']") private WebElement  email;
	@FindBy(xpath="//input[@name='property(Title)']") private WebElement  title;
	@FindBy(xpath="//input[@name='property(Department)']") private WebElement  department;
	@FindBy(xpath="//input[@name='property(Phone)']") private WebElement  phone;
	@FindBy(xpath="//input[@name='property(Home Phone)']") private WebElement  homePhone;
	@FindBy(xpath="//input[@name='property(Other Phone)']") private WebElement  other_Phone;
	@FindBy(xpath="//input[@name='property(Fax)']") private WebElement  fax;
	@FindBy(xpath="//input[@name='property(Mobile)']") private WebElement mobile;
	@FindBy(xpath="//input[@name='property(Assistant)']") private WebElement  assitname;
	@FindBy(xpath="//input[@name='property(Asst Phone)']") private WebElement  asst_Phone;
	@FindBy(xpath="//input[@name='property(Reports To)']") private WebElement  reportsTo;
	//@FindBy(xpath="") private WebElement  salutationDropdown;
	//@FindBy(xpath="") private WebElement  salutationDropdown;
	
	
	@FindBy(xpath="//input[@name='property(Mailing Street)']") private WebElement  mailingStreetTb;
	@FindBy(xpath="//input[@name='property(Mailing City)']") private WebElement  mailingcityTb;
	@FindBy(xpath="//input[@name='property(Mailing State)']") private WebElement  mailingStateTb;
	@FindBy(xpath="//input[@name='property(Mailing Zip)']") private WebElement  mailingPincodeTb;
	@FindBy(xpath="//input[@name='property(Mailing Country)']") private WebElement  mailingCountryTb;
	@FindBy(xpath="//input[@name='copyAddress']") private WebElement  copyaddressDropdown;
	
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement  saveButton;
	/*
	@FindBy(xpath="//input[@name='") private WebElement  reportsTo;
	@FindBy(xpath="//input[@name='") private WebElement  reportsTo;
	@FindBy(xpath="//input[@name='") private WebElement  reportsTo;
	
	*/
	
	public CreateContactPage() {
	
	PageFactory.initElements(BaseClass.driver, this);
		}

	public WebElement getLeadSource() {
		return leadSource;
	}

	public WebElement getSalutationDropdown() {
		return salutationDropdown;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}
public WebElement getAccountName()
{
return accName;	
}
	public void clickAccountlogo()
	{
		accName.click();
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDepartment() {
		return department;
	}
	public void enterpersontionaldetails(String leadsource,String salutation, String fname,String lname,String emailId,String titlename,String deptname)
	{
		WebDriverCommLib wlib=new WebDriverCommLib();
		wlib.selectOption(leadsource, leadSource);
		wlib.selectOption(salutation, salutationDropdown);
		firstName.sendKeys(fname);
		lastname.sendKeys(lname);
		
		
		email.sendKeys(emailId);
		title.sendKeys(titlename);
		department.sendKeys(deptname);
		accName.click();
	}
public void clickaccdetails()
{   
	acc.click();
	}
	
	public WebElement getPhone() {
		return phone;
	}

	public WebElement getHomePhone() {
		return homePhone;
	}

	public WebElement getOther_Phone() {
		return other_Phone;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAssitname() {
		return assitname;
	}

	public WebElement getAsst_Phone() {
		return asst_Phone;
	}

	public WebElement getReportsTo() {
		return reportsTo;
	}

	public void entercontactDetails(String phonenum,String homephnum,String othernum,
			String faxnumber,String mobileNum,String assistantname,String assistantphone,String reportto) {
		
		phone.sendKeys(phonenum);
		homePhone.sendKeys(homephnum);
		other_Phone.sendKeys(othernum);
		fax.sendKeys(faxnumber);
		mobile.sendKeys(mobileNum);
		asst_Phone.sendKeys(assistantphone);
		assitname.sendKeys(assistantname);
		reportsTo.sendKeys(reportto);
	}
	

	public WebElement getMailingStreetTb() {
		return mailingStreetTb;
	}

	public WebElement getMailingcityTb() {
		return mailingcityTb;
	}

	public WebElement getMailingStateTb() {
		return mailingStateTb;
	}

	public WebElement getMailingPincodeTb() {
		return mailingPincodeTb;
	}

	public WebElement getMailingCountryTb() {
		return mailingCountryTb;
	}

	public WebElement getCopyaddressDropdown() {
		return copyaddressDropdown;
	}

	public WebElement getSavebutton()
	{
		
		return saveButton;
		
		}
	
		public void enteraddresspage(String streetname,String cityname,
			String statename,String pincode,String countryname)
	{
		
		mailingStreetTb.sendKeys(streetname);
		mailingcityTb.sendKeys(cityname);
		mailingStateTb.sendKeys(statename);
		mailingPincodeTb.sendKeys(pincode);
		mailingCountryTb.sendKeys(countryname);
	/*	WebDriverCommLib wlib=new WebDriverCommLib();
		wlib.selectOption(copyType,copyaddressDropdown);
		saveButton.click();*/
		saveButton.click();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
