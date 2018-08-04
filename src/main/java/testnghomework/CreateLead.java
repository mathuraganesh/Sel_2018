package testnghomework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotattion;
import wdMethods.SeMethods;

public class CreateLead extends Annotattion{

	@Test(groups= {"smoke"})
	
      /*ii) The Create lead should run 2 times but the overall invocation should complete with 2 minutes */  
	//@Test(invocationCount=2,timeOut=20000)
	
	//Run testcase CreateLead, EditLead sequentially
	//@Test(priority=1)
	
	// createLead should 2times
	//@Test(invocationCount=2)
	
	public void createlead() throws InterruptedException {
		
		
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






