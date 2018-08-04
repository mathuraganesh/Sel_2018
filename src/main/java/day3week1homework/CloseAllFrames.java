package day3week1homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllFrames {
	
	 /*Close all the frames other than center -
	  * 
	 http://layout.jquery-dev.com/demos/iframe_local.html 
	 Tip: Some of the close button is inside a frame and some are not. 
	 So you should move inside a frame and check if there are any close button. If yes, click of all them*/
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		int count=1;
		List <WebElement> sWest=driver.findElementsByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']//button");
		for(WebElement iWest:sWest)
			if(iWest.getText().equals("Close Me"))
				iWest.click();
		List <WebElement> sEast=driver.findElementsByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']//button");
		for(WebElement iEast:sEast)
			if(iEast.getText().equals("Close Me"))
				iEast.click();
		driver.switchTo().frame("childIframe");
		List <WebElement> sFrameWest=driver.findElementsByXPath("//div[@class='ui-layout-west ui-layout-pane ui-layout-pane-west']//button");
		for(WebElement iFrameWest:sFrameWest)
			if(iFrameWest.getText().equals("Close Me"))
				iFrameWest.click();
		List <WebElement> sFrameEast=driver.findElementsByXPath("//div[@class='ui-layout-east ui-layout-pane ui-layout-pane-east']//button");
		for(WebElement iFrameEast:sFrameEast)
			if(iFrameEast.getText().equals("Close Me"))
				iFrameEast.click();
		List <WebElement> sFrameCenter=driver.findElementsByXPath("//div[@class='ui-layout-center ui-layout-pane ui-layout-pane-center']//button");
		for(WebElement iFrameCenter:sFrameCenter)
			if(iFrameCenter.getText().equals("Close Me"))
				iFrameCenter.click();
			
		
		}
	}

			
