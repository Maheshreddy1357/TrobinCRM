package contact;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.tobin.GenericLib.BaseClass;
import com.tobin.GenericLib.FileLib;
import com.trobin.Pages.Contact_Tab_page;
import com.trobin.Pages.CreateContactPage;
import com.trobin.Pages.HomePage;

import Login.ValidLogin;



public class createNewContact extends BaseClass{
@Test
	public  void verifycreateContact() throws Throwable {
	
	ValidLogin login=new ValidLogin();
	login.signIn();
	Thread.sleep(3000);
	HomePage hp =new HomePage();
	hp.clickContactTab();
	Thread.sleep(3000);
	
	Contact_Tab_page contact=new Contact_Tab_page();
	contact.clicknew_contact_button();
	
FileLib flib=new FileLib();
        String leadSource=flib.readExcelData(excel_path," contactDetails", 0,1 );
        String salutation=flib.readExcelData(excel_path," contactDetails", 1,1 );
        String fname=flib.readExcelData(excel_path," contactDetails", 2,1 );
        String latname=flib.readExcelData(excel_path," contactDetails", 3,1 );
        String email=flib.readExcelData(excel_path," contactDetails", 4,1 );
        String title=flib.readExcelData(excel_path," contactDetails", 5,1 );
        String dept=flib.readExcelData(excel_path," contactDetails", 6,1 );
        String phn=flib.readExcelData(excel_path," contactDetails", 7,1 );
        String hphn=flib.readExcelData(excel_path," contactDetails", 8,1 );
        String ophnum=flib.readExcelData(excel_path," contactDetails", 9,1 );
        String faxnum=flib.readExcelData(excel_path," contactDetails", 10,1 );
        String mobile=flib.readExcelData(excel_path," contactDetails", 11,1 );
        String assname=flib.readExcelData(excel_path," contactDetails", 12,1 );
        String assisnum=flib.readExcelData(excel_path," contactDetails", 13,1 );
        String reportto=flib.readExcelData(excel_path," contactDetails", 14,1 );
        String Street=flib.readExcelData(excel_path," contactDetails", 15,1 );
        String city=flib.readExcelData(excel_path," contactDetails", 16,1 );
        String statename=flib.readExcelData(excel_path," contactDetails", 17,1 );
        String pincode=flib.readExcelData(excel_path," contactDetails", 18,1 );
        String country=flib.readExcelData(excel_path," contactDetails", 19,1 );
        
       
        CreateContactPage create=new CreateContactPage();
        create.clickAccountlogo();
        Thread.sleep(2000);
        Set<String> allwindow=BaseClass.driver.getWindowHandles();
        Iterator<String> it = allwindow.iterator();
        String parentWindow = it.next();
        //String child = it.next();
        for(String onewindow:allwindow)
        {
        	String window_title=BaseClass.driver.switchTo().window(onewindow).getTitle();
        	
        	if(window_title.contains("Zoho CRM - Account Name Lookup"))
        	{
        		create.clickaccdetails();
        	}
        	       	
        }
        driver.switchTo().window(parentWindow);
        
        
        create.enterpersontionaldetails(leadSource, salutation, fname, latname, email, title, dept);
        
     
        create.entercontactDetails(phn, hphn, ophnum, faxnum, mobile, assname, assisnum, reportto);
        create.enteraddresspage(Street, city, statename, pincode, country);
        
        
        

	
	
}
	
}
