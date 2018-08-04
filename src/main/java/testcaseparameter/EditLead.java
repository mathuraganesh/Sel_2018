package testcaseparameter;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class EditLead extends Annotattion2{

	//@Test(dependsOnMethods= {"testcase1.CreateLead.createlead"})
	//@Test(groups= {"sanity"})
	
	@Test(dataProvider="fetchEditData")
	public void editlead(String firstName,String editName) throws InterruptedException {
				
		WebElement elecreate = locateElement("linktext","Leads");
		click(elecreate);
		
		WebElement elefindleadlink = locateElement("linktext","Find Leads");
		click(elefindleadlink);
		Thread.sleep(1000);
		
		WebElement elefindfirtsname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(elefindfirtsname,firstName);
		WebElement elefindleadbutton = locateElement("xpath","//button[text()='Find Leads']");
		click(elefindleadbutton);
		Thread.sleep(1000);
		WebElement eleclicktoleadid = locateElement("xpath","(//a[@class='linktext'])[4]");
		click(eleclicktoleadid);
		
		WebElement eleeditlead = locateElement("linktext","Edit");
		click(eleeditlead);
		WebElement eleupdatecompanyname = locateElement("updateLeadForm_companyName");
		clear(eleupdatecompanyname);
		type(eleupdatecompanyname,editName);
		String sGetCompanyName=getAttribute(eleupdatecompanyname,"value");
		WebElement eleeditsubmit = locateElement("xpath","//input[@class='smallSubmit']");
		click(eleeditsubmit);
		Thread.sleep(1000);
		
		WebElement eleverifycompanyname = locateElement("id","viewLead_companyName_sp");
		verifyPartialText(eleverifycompanyname,sGetCompanyName);
		
		
	}
	@DataProvider(name="fetchEditData")
	public String[][] fetchEditData(){
		String[][] data=new String[2][2];
		data[0][0]="Mathura";
		data[0][1]="CGI";
		
		data[1][0]="Divya";
		data[1][1]="IBM";
		return data;
		
	}
	
}






