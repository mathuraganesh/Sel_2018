package testcaseparameter;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotattion2;
import wdMethods.SeMethods;

public class DuplicateLead extends Annotattion2{

	//@Test(groups= {"regression"})
	@Test(dataProvider="fetchduplicatedata")
	public void duplicatelead(String emailID) throws InterruptedException {
		
		
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
		
		
	}
	
	@DataProvider(name="fetchduplicatedata")
	public String[][] deletefetchdata() {
		String[][] data=new String[2][1];
		data[0][0]="test@gmail.com";
		
		data[1][0]="divya@gmail.com";
		return data;
		
	}
}






