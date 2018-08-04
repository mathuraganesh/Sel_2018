package day4week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement eleDrag=driver.findElementById("draggable");
		WebElement eledrop=driver.findElementById("droppable");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(eleDrag, eledrop).perform();
	}

}
