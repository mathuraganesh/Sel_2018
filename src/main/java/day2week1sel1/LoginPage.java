package day2week1sel1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {

	public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver","C:\\Ganesh\\TestLeaf\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); */
	
	ChromeOptions op=new ChromeOptions();
	op.setHeadless(true);
	ChromeDriver driver=new ChromeDriver(op);
	driver.get("http://leaftaps.com/opentaps/");
	//driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("IBM India Pvt Ltd");
	driver.findElementById("createLeadForm_firstName").sendKeys("Ganesh");
	driver.findElementById("createLeadForm_lastName").sendKeys("MeenakshiSundaram");
	WebElement ind=driver.findElementById("createLeadForm_industryEnumId");
	Select industry=new Select(ind);
	industry.selectByVisibleText("Insurance");
	
	List<WebElement> allOptions=industry.getOptions();
	int count=allOptions.size();
	for(WebElement opt:allOptions) {
		System.out.println(opt.getText());
		
	}
	
	//driver.findElementByClassName("smallSubmit").click();
	
	
	

	}

}
