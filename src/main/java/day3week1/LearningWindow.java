package day3week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert sAlert=driver.switchTo().alert();
		System.out.println(sAlert.getText());
		sAlert.sendKeys("Ganesh");
		sAlert.accept();
		String sGetText=driver.findElementByXPath("//p[@id='demo']").getText();
		driver.switchTo().defaultContent();
		if(sGetText.contains("Ganesh")) {
			System.out.println("Verfied the  Given Text Exist: "+sGetText);
		}
		else {
			System.out.println("Verfication Failed the  Given Text is not Exist: "+sGetText);
		}
		driver.findElementById("tryhome").click();
		Thread.sleep(1000);
		Set<String> allWindowHandle=driver.getWindowHandles();
		List<String> allWindowHandleList=new ArrayList(allWindowHandle);
		allWindowHandleList.addAll(allWindowHandle);
		driver.switchTo().window(allWindowHandleList.get(1));
		System.out.println("The Second Window Title: "+driver.getTitle());
		System.out.println("The Second Window Url: "+driver.getCurrentUrl());
		driver.switchTo().window(allWindowHandleList.get(0));
		System.out.println("The First Window Title: "+driver.getTitle());
		System.out.println("The First Window Url: "+driver.getCurrentUrl());
		driver.quit();
		}
}
