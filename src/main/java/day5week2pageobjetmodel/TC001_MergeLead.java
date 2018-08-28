package day5week2pageobjetmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;

public class TC001_MergeLead extends Annotattion{
	
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
	public void mergelead(String sLeadId1,String sLeadId2) throws InterruptedException, IOException {
		
		new MyHomePage()
		.clickLeads()
		.clickMergeLeadLink()
		.FirstLeadIDGrid()
		.typeLeadId(sLeadId1)
		.clickFindLeads()
		.clickLeadLink()
		.SecondLeadIDGrid()
		.typeLeadId(sLeadId2)
		.clickFindLeads()
		.clickLeadLink();
		
		
		
	/*	MergeLeadPage parentwindow=new MergeLeadPage();
		String MergeMainWindow=parentwindow.ParentWindow();*/
	/*		
		new MergeLeadPage()
		.FirstLeadIDGrid()
		.typeLeadId(sLeadId1)
		.clickFindLeads();
	
		MergePage fLeadId=new MergePage();
		String FirstLeadId=fLeadId.getLeadId();
		
		new MergePage()
		.clickLeadLink()
		.SecondLeadIDGrid()
		.typeLeadId(sLeadId2)
		.clickFindLeads()
		.clickLeadLink();
		*/
		new MergeLeadPage()
		.MergeButton()
		.AcceptAlert()
		.clickFindLeads()
		.typeFirstLeadId(sLeadId1)
		.clickFindLeadButton()
		.verifyNoRecordDisplay();
		
		
		takeSnap("MergeLead"+i);
		reportStep("Merged the  Leads Merge1-"+sLeadId1+" And Merge2-"+sLeadId2+"Sucessfully","Pass","MergeLead"+i);
		
		i++;
		
	}
	
	
	
}






