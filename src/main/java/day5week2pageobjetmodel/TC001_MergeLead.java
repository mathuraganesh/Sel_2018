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
		.clickMergeLeadLink();
		MergeLeadPage parentwindow=new MergeLeadPage();
		String MergeMainWindow=parentwindow.ParentWindow();
		System.out.println(MergeMainWindow);
		new MergeLeadPage()
		.FirstLeadIDGrid()
		.switchwindow(1)
		.typeLeadId(sLeadId1)
		.clickFindLeads();
		System.out.println("test");
		MergePage fLeadId=new MergePage();
		String FirstLeadId=fLeadId.getLeadId();
		System.out.println("test1");
		new MergePage()
		.clickLeadLink();
		System.out.println("test2");
		MergeLeadPage parentwindow2=new MergeLeadPage();
		String MergeMainWindow2=parentwindow2.ParentWindow();
		System.out.println(MergeMainWindow2);
		
		new MergeLeadPage()
		.switchParentWindow(MergeMainWindow)
		.SecondLeadIDGrid()
		.switchwindow(1)
		.typeLeadId(sLeadId2)
		.clickFindLeads()
		.clickLeadLink();
		new MergePage();
		new MergeLeadPage()
		.switchParentWindow(MergeMainWindow)
		.MergeButton()
		.AcceptAlert()
		.clickFindLeads()
		.typeFirstLeadId(FirstLeadId)
		.clickFindLeads()
		.verifyNoRecordDisplay();
		
		
		takeSnap("MergeLead"+i);
		reportStep("Merged the  Leads Merge1-"+sLeadId1+" And Merge2-"+sLeadId2+"Sucessfully","Pass","MergeLead"+i);
		
		i++;
		
	}
	
	
	
}






