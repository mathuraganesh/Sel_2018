package day5week2extentreport;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class DuplicateLead extends Annotattion{
	int i=1;
	@BeforeTest
	public void setValues() {
		excelFileName="DuplicateLead";
		testName="Duplicate Lead";
		testDesc="Duplicate a Lead";
		category="Regression";
		author="Ganesh";
		moduleName="Duplicate leads";
	}
	
	//@Test(groups= {"regression"})
	@Test(dataProvider="fetchdata")
	public void duplicatelead(String emailID) throws InterruptedException, IOException {
		
		
		WebElement elecreate = locateElement("linktext","Leads");
		click(elecreate);
		
		WebElement elefindleadlink = locateElement("linktext","Find Leads");
		click(elefindleadlink);
		Thread.sleep(1000);
		
		WebElement elefindemail = locateElement("xpath","//span[text()='Email']");
		click(elefindemail);
		Thread.sleep(1000);
		
		WebElement elefindemailid = locateElement("xpath","//input[@name='emailAddress']");
		type(elefindemailid,emailID);
		WebElement elefindleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadbutton);
		Thread.sleep(1000);
		
		WebElement elegetfirstname= locateElement("xpath","(//a[@class='linktext'])[6]");
		String sGetFirstName=getText(elegetfirstname);
		WebElement eleclicktoleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		
		System.out.println(sGetFirstName);
		click(eleclicktoleadid);
		Thread.sleep(1000);
		WebElement eleclickduplicate = locateElement("xpath","//a[text()='Duplicate Lead']");
		click(eleclickduplicate);
		Thread.sleep(1000);
		verifyTitle("Duplicate Lead");
		
		WebElement elesmallsubmit = locateElement("class","smallSubmit");
		click(elesmallsubmit);
		
		WebElement elefindleaderror = locateElement("id","viewLead_firstName_sp");
		verifyExactText(elefindleaderror,sGetFirstName);
		takeSnap("DuplicateLead"+i);
		reportStep("Duplicated Lead By "+sGetFirstName+" Sucessfully", "Pass","DuplicateLead"+i);
		i++;
		
		
	}
	
	
}






