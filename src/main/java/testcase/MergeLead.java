package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLead extends SeMethods{

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
		WebElement elecreate = locateElement("linktext","Create Lead");
		click(elecreate);
		WebElement elemerge = locateElement("linktext","Merge Leads");
		click(elemerge);
		Thread.sleep(1000);
		String iParent=getParentWindow();
		WebElement elefromlead = locateElement("xpath","(//form[@name='MergePartyForm'])//a");
		click(elefromlead);
		
		switchToWindow(1);
		WebElement eleleadid = locateElement("xpath","(//input[@name='id'])[1]");
		type(eleleadid, "11661");
		String sLeadID=getAttribute(eleleadid,"value");
		WebElement elefindlead = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindlead);
		Thread.sleep(1000);
		
		WebElement eleclicklead = locateElement("xpath","//a[@class='linktext']");
		click(eleclicklead);
		switchToWindow(iParent);
		WebElement eletolead = locateElement("xpath","//table[@id='widget_ComboBox_partyIdTo']//following::a");
		click(eletolead);
	
		switchToWindow(1);
	
		WebElement eletoleadid = locateElement("xpath","(//input[@name='id'])[1]");
		type(eletoleadid, "11662");
		WebElement elefindtolead = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindtolead);
		Thread.sleep(1000);
		
		WebElement eleclicktolead = locateElement("xpath","//a[@class='linktext']");
		click(eleclicktolead);
		switchToWindow(0);
		WebElement elemerges = locateElement("linktext","Merge");
		click(elemerges);
		acceptAlert();
		WebElement elefindleadlink = locateElement("linktext","Find Leads");
		click(elefindleadlink);
		Thread.sleep(1000);
		
		WebElement elefindleadid = locateElement("xpath","(//input[@name='id'])[1]");
		type(elefindleadid,sLeadID);
		WebElement elefindleadidbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadidbutton);
		Thread.sleep(1000);
		
		WebElement elefindleaderror = locateElement("xpath","//div[@class='x-paging-info']");
		verifyExactText(elefindleaderror,"No records to display");
		
		
	}
	
}






