package testcaseparameter;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;


public class CreateLead extends Annotattion2{
	
	
	@Test(dataProvider="fetchdata")
	public void createlead(String companyName,String firstName,String lastName,String dataSource,long phone,String emailID) throws InterruptedException {
		
			
		WebElement elecreate = locateElement("linktext","Create Lead");
		click(elecreate);
		
		WebElement elecompanyname = locateElement("id","createLeadForm_companyName");
		type(elecompanyname,companyName);
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname,firstName);
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname,lastName);
		WebElement elesource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(elesource,dataSource);
		WebElement elephoneno = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elephoneno,""+phone);
		WebElement eleemailid = locateElement("id","createLeadForm_primaryEmail");
		type(eleemailid, emailID);
		String sGetFirstName=getAttribute(elefirstname,"value");
		WebElement elesubmit = locateElement("class","smallSubmit");
		click(elesubmit);
		Thread.sleep(1000);
		WebElement eleverifyfirstname = locateElement("id","viewLead_firstName_sp");
		verifyExactText(eleverifyfirstname,sGetFirstName);
		
	}
	
	@DataProvider(name="fetchdata")
	public Object[][] getData() {
		Object[][] data=new Object[2][6];
		data[0][0]="IBM";
		data[0][1]="Mathura";
		data[0][2]="Ganesh";
		data[0][3]="Direct Mail";
		data[0][4]=9962066736l;
		data[0][5]="test@gmail.com";
		
		data[1][0]="CGI";
		data[1][1]="Divya";
		data[1][2]="Lakshmi";
		data[1][3]="Direct Mail";
		data[1][4]=9962066737l;
		data[1][5]="divya@gmail.com";
		
		return data;
		
	} 
	
	
}






