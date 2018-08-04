package testnghomework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotattion;
import wdMethods.SeMethods;

public class EditLead extends Annotattion{
	
	//EditLead and DeleteLead should be dependons on createLead
	//@Test(dependsOnMethods= {"testnghomework.CreateLead.createlead"})
	
	@Test(groups= {"sanity"},dependsOnGroups= {"smoke"})
	
	//Run testcase CreateLead, EditLead sequentially
	//@Test(priority=2)
	public void editlead() throws InterruptedException {
				
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






