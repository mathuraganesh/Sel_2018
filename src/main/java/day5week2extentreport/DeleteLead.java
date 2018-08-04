package day5week2extentreport;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class DeleteLead extends Annotattion{
	int i=1;
	@BeforeTest
	public void setValues() {
		excelFileName="DeleteLead";
		testName="Delete Lead";
		testDesc="delete a Lead";
		category="Sanity";
		author="Ganesh";
		moduleName="Delete leads";
	}
	//@Test(timeOut=10000)
	//@Test(groups= {"sanity"})
	
	@Test(dataProvider="fetchdata")
	public void deletelead(String phone) throws InterruptedException, IOException {
		
		
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
		type(elefindfirtsname,phone);
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
		takeSnap("DeleteLead"+i);
		reportStep("DeleteLead By Phone Number- "+phone+" Sucessfully","Pass","DeleteLead"+i);
		
		i++;
		
		
	}
	
		
}






