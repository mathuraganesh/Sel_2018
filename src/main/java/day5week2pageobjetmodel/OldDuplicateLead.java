package day5week2pageobjetmodel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class  OldDuplicateLead extends SeMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest suite = extent.createTest("TC001","Duplicate Lead");
		ExtentTest test = suite.createNode("Leads");
		
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
			//System.out.println("Verified The Title of the Page: "+sGetTitle);
			test.pass("Verified The Title of the Page:"+sGetTitle);
			}
			else 
			{
				System.out.println("Verification Failed The Title of the Page not Exist"+sGetTitle);
				test.fail("Verification Failed The Title of the Page not Exist"+sGetTitle);
			}
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		
		String sFirstName=driver.findElementById("viewLead_firstName_sp").getText();
		//System.out.println(sGetFirstName);
		//System.out.println(sFirstName);
		if(sGetFirstName.equals(sFirstName)) {
			//System.out.println("Confirmed the duplicated lead name is same as captured name- "+sGetFirstName);
			File src = driver.getScreenshotAs(OutputType.FILE);
			File desc = new File("./snaps/duplicatelead.png");
			FileUtils.copyFile(src, desc);
			test.pass("Confirmed the duplicated lead name is same as captured name- "+sGetFirstName,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/duplicatelead.png").build());
		}
		else {
			//System.out.println("Confirmation Failed the duplicated lead name is not same as captured name- "+sGetFirstName+ "is not Exist");
			test.fail("Confirmation Failed the duplicated lead name is not same as captured name- "+sGetFirstName+ "is not Exist",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/createlead.png").build());
		}
		
		driver.close();
		extent.flush();
	}

}
