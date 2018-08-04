package day5week2extentreport;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;

public class MergeLead extends Annotattion{
	int i=1;
	@BeforeTest
	public void setValues() {
		excelFileName="MergeLead";
		testName="Merge Lead";
		testDesc="Merge a Lead";
		category="Regression";
		author="Ganesh";
		moduleName="Merge leads";
	}
	//@Test(enabled=false)
	//@Test(groups= {"regression"})
	@Test(dataProvider="fetchdata")
	public void mergelead(String firstLeadID,String secondLeadID) throws InterruptedException, IOException {
		
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
		type(eleleadid,firstLeadID);
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
		type(eletoleadid,secondLeadID);
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
		takeSnap("MergeLead"+i);
		reportStep("Merged the  Leads Merge1-"+firstLeadID+" And Merge2-"+secondLeadID+"Sucessfully","Pass","MergeLead"+i);
		
		i++;
		
	}
	
	
	
}






