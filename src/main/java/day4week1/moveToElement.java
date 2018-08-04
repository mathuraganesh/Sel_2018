package day4week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		Thread.sleep(1000);
		WebElement eleElectronics=driver.findElementByXPath("//span[text()='Electronics']");
		WebElement eleHome=driver.findElementByXPath("//span[text()='Home Entertainment']");
		
		//WebElement eleElectronics = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		//WebElement eleHome = driver.findElementByXPath("(//span[text()='Samsung'])[1]");
		
		Actions sElectronics=new Actions(driver);
		sElectronics.moveToElement(eleElectronics).pause(300).click(eleHome).perform();

	}

}
