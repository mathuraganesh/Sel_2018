package day3week1homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfFrame {
	
	/*Find the number of frames within the application (only in chrome):

	http://layout.jquery-dev.com/demos/iframes_many.html

	Tip: The application has nested frames of only one level. 
	Hence you need to go within each frame and check if that frame has any child frame or not? 
	And then you need to come out and go to next frame.*/
	
	public static void main(String[] args) throws InterruptedException {
	int sGetFrameCount=0;
	int count=0;
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	Thread.sleep(1000);
	List<WebElement> sFrameCount=driver.findElementsByTagName("iframe");
	List<WebElement> sFrameMainCount=driver.findElementsByXPath("//body[@class='ui-layout-container']/iframe");
	int sGetMainFrameCount=sFrameCount.size();
	sGetFrameCount=sGetFrameCount+sGetMainFrameCount;
	for(WebElement sGetFrameId:sFrameCount) {
		count=count+1;
		if(count<=sFrameMainCount.size()) {
			driver.switchTo().frame(driver.findElementByXPath("//body[@class='ui-layout-container']/iframe["+count+"]"));
			if(driver.findElementsByTagName("iframe").size()==0) {
				
			}
			else {
	
				sGetFrameCount=sGetFrameCount+1;
			}
			driver.switchTo().defaultContent();
		}
	}
	System.out.println("Number of Frame in the Current Url- "+sGetFrameCount);

	}
}
