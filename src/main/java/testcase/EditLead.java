package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class EditLead extends SeMethods{

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
		
		WebElement elefindfirtsname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(elefindfirtsname,"Mathura");
		WebElement elefindleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadbutton);
		Thread.sleep(1000);
		WebElement eleclicktoleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(eleclicktoleadid);
		
		WebElement eleeditlead = locateElement("linktext","Edit");
		click(eleeditlead);
		WebElement eleupdatecompanyname = locateElement("updateLeadForm_companyName");
		clear(eleupdatecompanyname);
		type(eleupdatecompanyname,"CGI");
		String sGetCompanyName=getAttribute(eleupdatecompanyname,"value");
		WebElement eleeditsubmit = locateElement("xpath","//input[@class='smallSubmit']");
		click(eleeditsubmit);
		Thread.sleep(1000);
		
		WebElement eleverifycompanyname = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(eleverifycompanyname,sGetCompanyName);
		
		
	}
	
}






