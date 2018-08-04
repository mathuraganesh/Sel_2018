package testnghomework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotattion;
import wdMethods.SeMethods;

public class MergeLead extends Annotattion{
	
	/*i) The Merge lead is not ready, hence do not run it. */
	//@Test(groups= {"regression"},enabled=false)
	
	@Test(groups= {"regression"})
	
	//MeargeLead should completed within 20 sec
	//@Test(timeOut=20000)
	public void mergelead() throws InterruptedException {
		
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
		type(eleleadid, "10833");
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
		type(eletoleadid, "10867");
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






