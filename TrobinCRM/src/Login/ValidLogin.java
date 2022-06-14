package Login;

import org.testng.annotations.Test;

import com.tobin.GenericLib.BaseClass;
import com.tobin.GenericLib.FileLib;
import com.tobin.GenericLib.WebDriverCommLib;
import com.trobin.Pages.SignInPage;

public class ValidLogin extends BaseClass {
	@Test
	public void signIn() throws Throwable
	{
		SignInPage sign=new SignInPage();
		
		FileLib flib=new FileLib();
	String un =flib.readPropertyData(properties_path,"username");
	String pw=flib.readPropertyData(properties_path,"password");
	
		sign.signIn(un,pw);
		
		WebDriverCommLib wlib=new WebDriverCommLib();
		
			wlib.verifyPage(wlib.getPageTitle(),
					flib.readPropertyData(properties_path, "HomeTitle"),
					"CRM HOME PAGE");
				
	}
}
