package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods{

	@Test
	public void login() throws InterruptedException {
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
		
		WebElement elecreate = locateElement("linktext","Leads");
		click(elecreate);
		
		WebElement elefindleadlink = locateElement("linktext","Find Leads");
		click(elefindleadlink);
		Thread.sleep(1000);
		
		WebElement elefindemail = locateElement("xpath","//span[text()='Email']");
		click(elefindemail);
		Thread.sleep(1000);
		
		WebElement elefindemailid = locateElement("xpath","//input[@name='emailAddress']");
		type(elefindemailid,"test@gmail.com");
		WebElement elefindleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadbutton);
		Thread.sleep(1000);
		
		WebElement elegetfirstname= locateElement("xpath","(//a[@class='linktext'])[6]");
		String sGetFirstName=getText(elegetfirstname);
		WebElement eleclicktoleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		
		System.out.println(sGetFirstName);
		click(eleclicktoleadid);
		Thread.sleep(1000);
		WebElement eleclickduplicate = locateElement("xpath","//a[text()='Duplicate Lead']");
		click(eleclickduplicate);
		Thread.sleep(1000);
		verifyTitle("Duplicate Lead");
		
		WebElement elesmallsubmit = locateElement("class","smallSubmit");
		click(elesmallsubmit);
		
		WebElement elefindleaderror = locateElement("id","viewLead_firstName_sp");
		verifyExactText(elefindleaderror,sGetFirstName);
		
		
	}
	
}






