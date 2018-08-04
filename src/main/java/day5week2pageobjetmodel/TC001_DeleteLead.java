package day5week2pageobjetmodel;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class TC001_DeleteLead extends Annotattion{
	
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
		
		new MyHomePage()
		.clickLeads()
		.clickFindLeadLink()
		.clickDeletePhoneTab()
		.typeDeletePhoneNumber(phone)
		.clickFindLeads()
		.getLeadID()
		.clickLeadId()
		.clickDeleteButton()
		.clickFindLeadLink()
		.typeLeadId()
		.clickFindLeads()
		.verifyNoRecordDisplay();
		
		takeSnap("DeleteLead"+i);
		reportStep("DeleteLead By Phone Number- "+phone+" Sucessfully","Pass","DeleteLead"+i);
		
		i++;
		
		
	}
	
		
}






