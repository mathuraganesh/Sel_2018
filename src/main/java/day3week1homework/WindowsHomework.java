package day3week1homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHomework {
	
	/*https://www.irctc.co.in/eticketing/userSignUp.jsf
		2. Click "Contact Us"
		   GetTitle and URL
		3. Click "Compatible Browser"
		   GetTitle and URL
		4. Close the ParentWindow, Contact US
		5. Print the list of browsers*/

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	driver.findElementByLinkText("Contact Us").click();
	Thread.sleep(1000);
	Set<String> sContact=driver.getWindowHandles();
	List<String> sListContact=new ArrayList(sContact);
	sListContact.addAll(sListContact);
	driver.switchTo().window(sListContact.get(1));
	System.out.println("The Title of the Contact Us Page: "+driver.getTitle());
	System.out.println("The Url of the Contact Us Page: "+driver.getCurrentUrl());
	driver.switchTo().window(sListContact.get(0));
	driver.findElementByLinkText("Compatible Browser").click();
	Thread.sleep(1000);
	Set<String> sUpdateWindow=driver.getWindowHandles();
	List<String> sListsUpdateWindow=new ArrayList(sUpdateWindow);
	sListsUpdateWindow.addAll(sUpdateWindow);
	driver.switchTo().window(sListsUpdateWindow.get(2));
	System.out.println("The Title of the Contact Us Page: "+driver.getTitle());
	System.out.println("The Url of the Contact Us Page: "+driver.getCurrentUrl());
	driver.switchTo().window(sListsUpdateWindow.get(0));
	driver.close();
	driver.switchTo().window(sListsUpdateWindow.get(1));
	driver.close();
	driver.switchTo().window(sListsUpdateWindow.get(2));
	List<WebElement> sBrowser=driver.findElementsByXPath("//div[@class='content_12']//li");
	System.out.println(sBrowser.size());
	
	for(WebElement allBrowser:sBrowser) {
		System.out.println(allBrowser.getText());
	}
	}

}
