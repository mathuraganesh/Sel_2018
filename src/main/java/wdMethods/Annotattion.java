package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Annotattion extends SeMethods {
@BeforeMethod(groups= {"smoke","sanity","regression"})

	
	public  void login() throws InterruptedException {
	
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(1000);
		WebElement elecrm = locateElement("linktext","CRM/SFA");
		click(elecrm);

	}

@AfterMethod(groups= {"smoke","sanity","regression"})
	public void close() {
	closeAllBrowsers();
}
	

}
