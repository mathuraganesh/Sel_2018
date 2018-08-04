package day5week2pageobjetmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;


public class TC001_CreateLeadNegative extends Annotattion{
	int i=1;
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLeadNegative";
		testName="CreateLead - Negative";
		testDesc="Create a Lead";
		category="Sanity";
		author="Divya";
		moduleName="Leads";
	}
	@Test(dataProvider="fetchdata")
	public void createlead(String companyName,String firstName,String lastName,String emailID,String phone,String expectedText) throws InterruptedException, IOException {
				
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.typeEmailid(emailID)
		.typephoneNumber(phone)
		.clickSubmitForFailure()
		.veifyErrMsg(expectedText);
		
		
		
		takeSnap("CreateLead"+i);
		reportStep("Create Lead ErrorMessage "+expectedText+" Verified Sucessfully", "Pass","CreateLead"+i);
		i++;
	}
	
}






