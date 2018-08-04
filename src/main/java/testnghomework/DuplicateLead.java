package testnghomework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotattion;
import wdMethods.SeMethods;

public class DuplicateLead extends Annotattion{

	
	@Test(groups= {"regression"})
	
	//Duplicate Lead is not ready yet
	//@Test(enabled=false)
	
	public void duplicatelead() throws InterruptedException {
				
		WebElement elecreate = locateElement("linktext","Leads");
		click(elecreate);
		
		WebElement elefindleadlink = locateElement("linktext","Find Leads");
		click(elefindleadlink);
		Thread.sleep(1000);
		
		WebElement elefindemail = locateElement("xpath","//span[text()='Email']");
		click(elefindemail);
		Thread.sleep(1000);
		
		WebElement elefindemailid = locateElement("xpath","//input[@name='emailAddress']");
		type(elefindemailid,"test@gmail.com");
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
	
}






