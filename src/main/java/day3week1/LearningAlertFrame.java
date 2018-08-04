package day3week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlertFrame {

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
	Thread.sleep(1000);
	driver.findElementById("tryhome").click();

	}

}
