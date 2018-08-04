package day5week2pageobjetmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReporterMethod{
	public static ExtentReports extent;
	public static ExtentTest suite,test;
	
	//@BeforeSuite
	public void beginResult() {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		extent=new ExtentReports();
		extent.attachReporter(html);
		
	}
	
		
	//@BeforeClass
	public ExtentTest createTestCase(String testCaseName,String testCaseDescription) {
		suite = extent.createTest(testCaseName,testCaseDescription);
		return suite;
	}

	//@BeforeMethod
	public ExtentTest testNode(String iteration,String authorName,String category) {
		test = suite.createNode(iteration);
		suite.assignAuthor(authorName);
		suite.assignCategory(category);
		return test;
	}
	
	//@AfterMethod
	// This method create entry for every step
		public void reportStep(String desc,String status,String snapName) throws IOException {
			if (status.equalsIgnoreCase("pass")) {
				test.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/"+snapName+".png").build());
			} else if (status.equalsIgnoreCase("fail")) {
				test.fail(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/"+snapName+".png").build());
			}else if (status.equalsIgnoreCase("warning")) {
				test.warning(desc,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/"+snapName+".png").build());
			}
		}
		
	//@AfterSuite
	public void endResult() {
		extent.flush();
		
	}

		

}
