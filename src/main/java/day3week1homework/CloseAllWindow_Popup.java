package day3week1homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindow_Popup {
	
	/*Go to popuptest.com and click on Multi-PopUp Test #2
	 *  and close all the windows opened except the parent and then print the title of the parent window.
	 */

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://popuptest.com/");
	driver.findElementByLinkText("Multi-PopUp Test #2").click();
	Set<String> sWindowHandle=driver.getWindowHandles();
	List<String> sWindowListHandle=new ArrayList(sWindowHandle);
	sWindowListHandle.addAll(sWindowHandle);
	driver.switchTo().window(sWindowListHandle.get(1));
	driver.close();
	driver.switchTo().window(sWindowListHandle.get(2));
	driver.close();
	driver.switchTo().window(sWindowListHandle.get(3));
	driver.close();
	driver.switchTo().window(sWindowListHandle.get(0));
	System.out.println("The Title of the parent Window: "+driver.getTitle());
	}
		
	}


