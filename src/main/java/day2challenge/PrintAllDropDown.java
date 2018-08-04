package day2challenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDropDown {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	
	List<WebElement> sCountryList=driver.findElementsById("userRegistrationForm:countries");
	for(WebElement sCountry:sCountryList) {
		System.out.println(sCountry.getText());
	}

	}

}
