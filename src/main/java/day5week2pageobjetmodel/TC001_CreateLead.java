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


public class TC001_CreateLead extends Annotattion{
	int i=1;
	@BeforeTest
	public void setValues() {
		excelFileName="CreateLead";
		testName="Create Lead";
		testDesc="Create a Lead";
		category="Smoke";
		author="Ganesh";
		moduleName="Leads";
	}
	@Test(dataProvider="fetchdata")
	public void createlead(String companyName,String firstName,String lastName,String emailID,String phone) throws InterruptedException, IOException {
				
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.typeEmailid(emailID)
		.typephoneNumber(phone)
		.clickCreateLead()
		.verifyFirstName(firstName);
		
		
		takeSnap("CreateLead"+i);
		reportStep("Create Lead "+firstName+" Created Sucessfully", "Pass","CreateLead"+i);
		i++;
	}
	
}






