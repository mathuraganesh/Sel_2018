package day2week2;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastOne {

	

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Dropdown.html");
	System.out.println("Enter the Index:");
	Scanner sCase=new Scanner(System.in);
	String sTestCase=sCase.nextLine();
	
	switch(sTestCase) {
	case "1":
		WebElement iLastOneList1=driver.findElementByXPath("//select[@id='dropdown1']");
		Select sLastOneList1=new Select(iLastOneList1);
		List<WebElement> iLastOne1=sLastOneList1.getOptions();
		int sLastOne1=iLastOne1.size();
		sLastOneList1.selectByIndex(sLastOne1-1);
	break;
	case "2":
		WebElement iLastOneList2=driver.findElementByXPath("//select[@name='dropdown2']");
		Select sLastOneList2=new Select(iLastOneList2);
		List<WebElement> iLastOne2=sLastOneList2.getOptions();
		int sLastOne2=iLastOne2.size();
		sLastOneList2.selectByIndex(sLastOne2-1);
	break;
	case "3":
		WebElement iLastOneList3=driver.findElementByXPath("//select[@id='dropdown3']");
		Select sLastOneList3=new Select(iLastOneList3);
		List<WebElement> iLastOne3=sLastOneList3.getOptions();
		int sLastOne3=iLastOne3.size();
		sLastOneList3.selectByIndex(sLastOne3-1);
	break;
	case "4":
		WebElement iLastOneList4=driver.findElementByXPath("//select[@class='dropdown']");
		Select sLastOneList4=new Select(iLastOneList4);
		List<WebElement> iLastOne4=sLastOneList4.getOptions();
		int sLastOne4=iLastOne4.size();
		sLastOneList4.selectByIndex(sLastOne4-1);
		break;
	case "5":
		WebElement iLastOneList5=driver.findElementByXPath("//select[@class='dropdown']/following::select");
		Select sLastOneList5=new Select(iLastOneList5);
		List<WebElement> iLastOne5=sLastOneList5.getOptions();
		int sLastOne5=iLastOne5.size();
		sLastOneList5.selectByIndex(sLastOne5-1);
		break;
	case "6":
		WebElement iLastOneList6=driver.findElementByXPath("//select[@class='dropdown']/following::select[2]");
		Select sLastOneList6=new Select(iLastOneList6);
		List<WebElement> iLastOne6=sLastOneList6.getOptions();
		int sLastOne6=iLastOne6.size();
		sLastOneList6.selectByIndex(sLastOne6-1);
		break;
	}
	
	
	

	}

}
