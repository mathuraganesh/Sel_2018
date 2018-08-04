package day2week1sel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("test@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		String sGetFirstName=driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(1000);
		String sGetTitle=driver.getTitle();
		if(sGetTitle.contains("Duplicate Lead")) {
			System.out.println("Verified The Title of the Page: "+sGetTitle);
			}
			else 
			{
				System.out.println("Verification Failed The Title of the Page not Exist"+sGetTitle);
			}
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		
		String sFirstName=driver.findElementById("viewLead_firstName_sp").getText();
		//System.out.println(sGetFirstName);
		//System.out.println(sFirstName);
		if(sGetFirstName.equals(sFirstName)) {
			System.out.println("Confirmed the duplicated lead name is same as captured name- "+sGetFirstName);
		}
		else {
			System.out.println("Confirmation Failed the duplicated lead name is not same as captured name- "+sGetFirstName+ "is not Exist");
		}
		
		driver.close();
	}

}
