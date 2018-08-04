package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;


import wdMethods.SeMethods;

public class CreateLead extends SeMethods{

	@Test
	public void login() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(1000);
		WebElement elecrm = locateElement("linktext","CRM/SFA");
		click(elecrm);
		WebElement elecreate = locateElement("linktext","Create Lead");
		click(elecreate);
		WebElement elecompanyname = locateElement("id","createLeadForm_companyName");
		type(elecompanyname, "IBM India Pvt Ltd");
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname, "mathura");
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname, "ganesh");
		WebElement elesource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(elesource,"Direct Mail");
		WebElement elephoneno = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elephoneno, "9962066736");
		String sGetFirstName=getAttribute(elefirstname,"value");
		WebElement elesubmit = locateElement("class","smallSubmit");
		click(elesubmit);
		Thread.sleep(1000);
		WebElement eleverifyfirstname = locateElement("id","viewLead_firstName_sp");
		verifyExactText(eleverifyfirstname,sGetFirstName);
		
	}
	
}






