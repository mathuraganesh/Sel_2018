package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DeleteLead extends SeMethods{

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
		
		WebElement elefindphone = locateElement("xpath","//span[text()='Phone']");
		click(elefindphone);
		Thread.sleep(1000);
		
		WebElement elefindfirtsname = locateElement("xpath","//input[@name='phoneNumber']");
		type(elefindfirtsname,"9962066736");
		WebElement elefindleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadbutton);
		Thread.sleep(1000);
		
		WebElement eleclicktoleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		String sGetLeadID=getText(eleclicktoleadid);
		System.out.println(sGetLeadID);
		click(eleclicktoleadid);
		Thread.sleep(1000);
		WebElement eleclickdelete = locateElement("xpath","//a[@class='subMenuButtonDangerous']");
		click(eleclickdelete);
		Thread.sleep(1000);
		WebElement elefindlead1link = locateElement("linktext","Find Leads");
		click(elefindlead1link);
		Thread.sleep(1000);
		
		WebElement eleleadid = locateElement("xpath","(//input[@name='id'])[1]");
		type(eleleadid,sGetLeadID);
		//String sLeadID=getAttribute(eleleadid,"value");
		WebElement elefindlead = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindlead);
		Thread.sleep(1000);
		
		WebElement elefindleaderror = locateElement("xpath","//div[@class='x-paging-info']");
		verifyExactText(elefindleaderror,"No records to display");
		
		
	}
	
}






