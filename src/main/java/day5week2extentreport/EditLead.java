package day5week2extentreport;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class EditLead extends Annotattion{
	int i=1;
	@BeforeTest
	public void setValues() {
		excelFileName="EditLead";
		testName="Edit Lead";
		testDesc="edit a Lead";
		category="Sanity";
		author="Ganesh";
		moduleName="Edit leads";
	}
	//@Test(dependsOnMethods= {"testcase1.CreateLead.createlead"})
	//@Test(groups= {"sanity"})
	
	@Test(dataProvider="fetchdata")
	public void editlead(String firstName,String editName) throws InterruptedException, IOException {
				
		WebElement elecreate = locateElement("linktext","Leads");
		click(elecreate);
		
		WebElement elefindleadlink = locateElement("linktext","Find Leads");
		click(elefindleadlink);
		Thread.sleep(1000);
		
		WebElement elefindfirtsname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(elefindfirtsname,firstName);
		WebElement elefindleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadbutton);
		Thread.sleep(1000);
		WebElement eleclicktoleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(eleclicktoleadid);
		
		WebElement eleeditlead = locateElement("linktext","Edit");
		click(eleeditlead);
		WebElement eleupdatecompanyname = locateElement("updateLeadForm_companyName");
		clear(eleupdatecompanyname);
		type(eleupdatecompanyname,editName);
		String sGetCompanyName=getAttribute(eleupdatecompanyname,"value");
		WebElement eleeditsubmit = locateElement("xpath","//input[@class='smallSubmit']");
		click(eleeditsubmit);
		Thread.sleep(1000);
		
		WebElement eleverifycompanyname = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(eleverifycompanyname,sGetCompanyName);
		takeSnap("EditLead"+i);
		reportStep("Company Name "+sGetCompanyName+" Edited Sucessfully","Pass","EditLead"+i);
		
		i++;
		
		
	}
	
}






