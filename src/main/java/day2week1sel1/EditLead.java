package day2week1sel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(100);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Mathura");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(1000);
		String sGetTitle=driver.getTitle();
		if(sGetTitle.contains("View Lead")) {
		System.out.println("Verified The Title of the Page: "+sGetTitle);
		}
		else 
		{
			System.out.println("Verification Failed The Title of the Page not Exist"+sGetTitle);
		}
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CGI");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		Thread.sleep(1000);
		String sGetCompanyName=driver.findElementById("viewLead_companyName_sp").getText();
		if(sGetCompanyName.contains("CGI")) {
			System.out.println("Confirm the changed name appears: "+sGetCompanyName);
		}
		else 
		{
			System.out.println("Confirmation Failed the changed name appears not Exist"+sGetCompanyName);
		}	
		driver.close();
	}

}
