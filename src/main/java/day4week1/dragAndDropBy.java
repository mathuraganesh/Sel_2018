package day4week1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement eleitem1=driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement eleitem4=driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		Point iItem4=eleitem4.getLocation();
		int location=iItem4.getY();
		System.out.println(location);
		
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(eleitem1,0,location).perform();
		Thread.sleep(1000);
		System.out.println("sorted");
	}

	}
