package day5week2pageobjetmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class TC001_DuplicateLead extends Annotattion{
	
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
		
		new MyHomePage()
		.clickLeads()
		.clickFindLeadLink()
		.clickEmailTab()
		.typeEmailId(emailID)
		.clickFindLeads();
		FindLeadPage fn=new FindLeadPage();
		String sGetFirstName=fn.getFirstName();
		new FindLeadPage()
		.clickLeadId()
		.clickDuplicateLink();
		DuplicateLeadPage title=new DuplicateLeadPage();
		boolean sGetTitle=title.getTitle("Duplicate Lead | opentaps CRM");
		new DuplicateLeadPage()
		.clickDuplicateButton()
		.verifyFirstName(sGetFirstName);
		
					
		takeSnap("DuplicateLead"+i);
		reportStep("Duplicated Lead By "+sGetFirstName+" Sucessfully", "Pass","DuplicateLead"+i);
		i++;
		
		
	}
	
	
}






