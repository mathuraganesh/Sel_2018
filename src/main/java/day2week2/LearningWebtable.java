package day2week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class LearningWebtable {

	public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver","C:\\Ganesh\\TestLeaf\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); */
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/table.html");
	WebElement iTable=driver.findElementByXPath("//section[@class='innerblock']//table");
	List<WebElement> iRow=iTable.findElements(By.tagName("tr"));
	System.out.println("The Number of Rows"+iRow.size());
	
	List<WebElement> columns = iTable.findElements(By.tagName("td"));
	//List<WebElement> iColumn=iTables.findElements(By.tagName("td"));
	System.out.println("The Number of Column"+columns.size());
	
	String progress=driver.findElementByXPath("//section[@class='innerblock']//table//tr[3]/td[1]/following::td").getText();
	System.out.println(progress);
	
	}

}
