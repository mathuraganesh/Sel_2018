package day5week2pageobjetmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class TC001_EditLead extends Annotattion{
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
	public void editlead(String firstName,String Cname) throws InterruptedException, IOException {
				
		new MyHomePage()
		.clickLeads()
		.clickFindLeadLink()
		.typeEditFname(firstName)
		.clickFindLeads()
		.clickLeadId()
		.clickEditButton()
		.clearCompanyName()
		.typeCompanyName(Cname)
		.clickEditButton()
		.verifyCompanyName(Cname);
		
		
		takeSnap("EditLead"+i);
		reportStep("Company Name "+Cname+" Edited Sucessfully","Pass","EditLead"+i);
		
		i++;
		
		
	}
	
}






