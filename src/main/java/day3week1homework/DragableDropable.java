package day3week1homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DragableDropable {
	
	/*Goto jqueryui.com 
	  click on draggable and print the content of the element inside draggable and then click on droppable
	 */

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.findElementByLinkText("Draggable").click();
	Thread.sleep(1000);
	driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	System.out.println(driver.findElementById("draggable").getText());
	driver.switchTo().defaultContent();
	driver.findElementByLinkText("Droppable").click();

	}

}
