package day5week2extentreport;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;


public class CreateLead extends Annotattion{
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
				
		WebElement elecreate = locateElement("linktext","Create Lead");
		click(elecreate);
		
		WebElement elecompanyname = locateElement("id","createLeadForm_companyName");
		type(elecompanyname,companyName);
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname,firstName);
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname,lastName);
		WebElement eleemailid = locateElement("id","createLeadForm_primaryEmail");
		type(eleemailid, emailID);
		WebElement elephoneno = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elephoneno,phone);
		String sGetFirstName=getAttribute(elefirstname,"value");
		WebElement elesubmit = locateElement("class","smallSubmit");
		click(elesubmit);
		Thread.sleep(1000);
		WebElement eleverifyfirstname = locateElement("id","viewLead_firstName_sp");
		verifyExactText(eleverifyfirstname,sGetFirstName);
		takeSnap("CreateLead"+i);
		reportStep("Create Lead "+sGetFirstName+" Created Sucessfully", "Pass","CreateLead"+i);
		i++;
	}
	
}






