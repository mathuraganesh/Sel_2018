package day6week1Excelparameter;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;


public class CreateLead extends Annotattion2{
	
	
	@Test(dataProvider="fetchdata")
	public void createlead(String companyName,String firstName,String lastName,String emailID,String phone) throws InterruptedException {
		
			
		WebElement elecreate = locateElement("linktext","Create Lead");
		click(elecreate);
		
		WebElement elecompanyname = locateElement("id","createLeadForm_companyName");
		type(elecompanyname,companyName);
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname,firstName);
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname,lastName);
		//WebElement elesource = locateElement("id","createLeadForm_dataSourceId");
		//selectDropDownUsingText(elesource,dataSource);
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
		
	}
	
	@DataProvider(name="fetchdata")
	public Object[][] getData() throws IOException {

		ReadExcel excel = new ReadExcel();
		return excel.readExcel("CreateLead");

		
	} 
	
	
}






