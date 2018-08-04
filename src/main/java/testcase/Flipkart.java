package testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Flipkart extends SeMethods{

	@Test
	public void login() throws InterruptedException {
		
		startApp("chrome", "https://www.flipkart.com/");
		WebElement elePopUp = locateElement("xpath","//button[text()='✕']");
		click(elePopUp);
		Thread.sleep(1000);
		WebElement eleTvApplicance = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement eleSamsung = locateElement("xpath","(//span[text()='Samsung'])[2]");
		moveToElement(eleTvApplicance,eleSamsung);
		Thread.sleep(1000);
		WebElement eleMin = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingText(eleMin,"₹25000");
		WebElement eleMax = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(eleMax,"₹60000");
		Thread.sleep(1000);
		
		WebElement eleScreenSize = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div/div[1]/div/section[5]/div");
		click(eleScreenSize);
		WebElement eleScreenSizealue = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div/div[3]/div/div/label/div[1]");
		click(eleScreenSizealue);
		Thread.sleep(5000);
		String iParent=getParentWindow();
		WebElement eleFirstValue = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
		click(eleFirstValue);
		switchToWindow(1);
		Thread.sleep(1000);
		WebElement eleCompare = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/div/span/div/label/div");
		click(eleCompare);
		closeBrowser();
			
		switchToWindow(iParent);
		WebElement eleSecondValue = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div[2]/div/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]");
														
		click(eleSecondValue);
		switchToWindow(1);
		Thread.sleep(1000);
		WebElement eleCompare2 = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/div/span/div/label/div");
		click(eleCompare2);
		closeBrowser();
		
		switchToWindow(iParent);
		
		WebElement eleCompareClick = locateElement("xpath","//*[@id=\"container\"]/div/div[1]/div[2]/div[2]/div/a/span/span");
		click(eleCompareClick);
		Thread.sleep(1000);
		WebElement eleFirstProdutPrice = locateElement("xpath","//*[@id=\"fk-compare-page\"]/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]");
		//System.out.println(eleFirstProdutPrice.getText());
		WebElement eleSecondProdutPrice = locateElement("xpath","//*[@id=\"fk-compare-page\"]/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/div[1]");
		//System.out.println(eleSecondProdutPrice.getText());
		String sGetFirstProdutPrice=(eleFirstProdutPrice.getText()).replaceAll("₹","").replaceAll(",", "");
		int iGetFirstProdutPrice=Integer.parseInt(sGetFirstProdutPrice);
		String sGetSecondProdutPrice=(eleSecondProdutPrice.getText()).replaceAll("₹","").replaceAll(",","");
		int iGetSecondProdutPrice=Integer.parseInt(sGetSecondProdutPrice);
		
		if(iGetFirstProdutPrice<iGetSecondProdutPrice) {
			WebElement eleFirstProductClick = locateElement("xpath","//*[@id=\"fk-compare-page\"]/div/div/div/div[2]/div[1]/div[4]/div[2]/div/form/button");
			click(eleFirstProductClick);
			System.out.println("First Product Price "+iGetFirstProdutPrice+" is Lesser Than Second Product Price "+iGetSecondProdutPrice+" and Click on First Product Buy Button");
		}
		else {
			WebElement eleSecondProductClick = locateElement("xpath","//*[@id=\"fk-compare-page\"]/div/div/div/div[2]/div[1]/div[4]/div[3]/div/form/button");
			click(eleSecondProductClick);
			System.out.println("Second Product Price "+iGetSecondProdutPrice+" is Lesser Than First Product Price "+iGetFirstProdutPrice+" and Click on second Product Buy Button");
		}
			
		
	}
}