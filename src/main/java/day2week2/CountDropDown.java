package day2week2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class CountDropDown {

	public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver","C:\\Ganesh\\TestLeaf\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); */
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	//driver.manage().window().fullscreen();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	List<WebElement> dropDown=driver.findElementsByTagName("select");
	System.out.println("The Total DropDown Count is "+dropDown.size());
	
	}

}
