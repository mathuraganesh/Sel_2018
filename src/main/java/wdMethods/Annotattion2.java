package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Annotattion2 extends SeMethods {

@BeforeMethod
@Parameters({"url","username","password"})
	public  void login(String url,String username,String password  ) throws InterruptedException {
		
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePassword = locateElement("id","password");
		type(elePassword,password);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(1000);
		WebElement elecrm = locateElement("linktext","CRM/SFA");
		click(elecrm);

	}

@AfterMethod
	public void close() {
		closeAllBrowsers();
	
	}

	

}


