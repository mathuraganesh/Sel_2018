package testcase1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotattion;
import wdMethods.SeMethods;

public class DeleteLead extends Annotattion{

	//@Test(timeOut=10000)
	@Test(groups= {"sanity"})
	public void deletelead() throws InterruptedException {
		
		
		WebElement elecreate = locateElement("linktext","Leads");
		click(elecreate);
		Thread.sleep(1000);
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






