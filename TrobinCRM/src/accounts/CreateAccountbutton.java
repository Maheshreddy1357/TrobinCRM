package accounts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.tobin.GenericLib.BaseClass;
import com.tobin.GenericLib.FileLib;
import com.tobin.GenericLib.WebDriverCommLib;
import com.trobin.Pages.Account_Details_Page;
import com.trobin.Pages.Accounts_page;
import com.trobin.Pages.CreateAccountpage;
import com.trobin.Pages.HomePage;

import Login.ValidLogin;

public class CreateAccountbutton extends BaseClass {

	@Test
	public void  verifyNewAccount() throws Throwable
	{
		ValidLogin  vl=new ValidLogin();
		vl.signIn();
		
		HomePage hp=new HomePage();
		hp.clickaccountTab();
		
		Accounts_page ap=new Accounts_page();
		ap.clickCreateAccountbutton();
		
		FileLib flib=new FileLib();
	String accname=	flib.readExcelData(excel_path, "accountpage", 0, 1);
	String accsite=	flib.readExcelData(excel_path, "accountpage", 1, 1);
	String accnum=	flib.readExcelData(excel_path, "accountpage", 2, 1);
	String acctype=	flib.readExcelData(excel_path, "accountpage", 3, 1);

	
		CreateAccountpage cap=new CreateAccountpage();
		cap.newAccount(accname, accsite, accnum, acctype);
	
		Account_Details_Page adp=new Account_Details_Page();
    	WebDriverCommLib wlib=new WebDriverCommLib();
	    WebElement accnameWe= adp.getaccname();
	    String elementAccname=adp.getaccNameText();
		
		
		wlib.elementDisplayed(accnameWe,elementAccname );
		
		 WebElement accsiteWe= adp.getaccType();
		 String elementAccsite=adp.getaccTypeText();		
				 wlib.elementDisplayed(accsiteWe,elementAccsite);
			
			 WebElement accnumWe= adp.getaccnum();
			 String elementAccnum=adp.getaccNumText();
			wlib.elementDisplayed(accnumWe,elementAccnum );
				
				 WebElement acctypeWe= adp.getaccType();
				 String elementAcctype=adp.getaccTypeText();
					wlib.elementDisplayed(acctypeWe,elementAcctype);
					
	}	
		
}	
		
		
		
	
	

