package day2challenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectSecondWebList {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	WebElement iList=driver.findElementById("userRegistrationForm:countries");
	Select sCountryList=new Select(iList);
	List<WebElement> sList=sCountryList.getOptions();
	int count=0;
	int increament=0;
	for(WebElement iGetList:sList) {
		String sInput=iGetList.getText();
		String sGivenInput=sInput.substring(0,1);
		increament=increament+1;
		
		if(sGivenInput.equals("E")) {
			count=count+1;
			if(count==2) {
				
				sCountryList.selectByIndex(increament-1);
			}
			
			
		}
	}
	

	}

}
