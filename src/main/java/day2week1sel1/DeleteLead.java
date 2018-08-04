package day2week1sel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("//span[text()='Phone']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("987654899");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String sLeadID=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElementByName("id").sendKeys(sLeadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String sGetErrorMessage=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if(sGetErrorMessage.equals("No records to display")) {
		System.out.println("Verified the Error Meesage: "+sGetErrorMessage);
		}
		else 
		{
			System.out.println("Verification Failed for the Error Message"+sGetErrorMessage);
		}
		
		driver.close();
	}

}
