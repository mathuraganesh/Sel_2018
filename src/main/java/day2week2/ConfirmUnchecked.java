package day2week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmUnchecked {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	WebElement sUncheck=driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input");
	boolean bCheck=sUncheck.isSelected();
	if(bCheck==true) {
		System.out.println("The Given CheckBox is Checked");
	}
	else {
		System.out.println("The Given CheckBox is UnChecked");
	}

	}

}
