package day5week2pageobjetmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeValue {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Veera");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		System.out.println("Merge Value1:"+driver.findElementByXPath("(//a[@class='linktext'])[4]").getText());
		System.out.println("Merge Value2:"+driver.findElementByXPath("(//a[@class='linktext'])[10]").getText());
		
		driver.close();
	}

}
