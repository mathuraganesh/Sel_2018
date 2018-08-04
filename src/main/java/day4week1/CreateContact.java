package day4week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Contacts").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Create Contact").click();
		Thread.sleep(1000);
		driver.findElementById("firstNameField").sendKeys("Mathura");
		String sGetFirstName=driver.findElementById("firstNameField").getAttribute("value");
		driver.findElementById("lastNameField").sendKeys("Ganesh");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("mathura");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("ganesh");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("TitleInput");
		driver.findElementById("createContactForm_departmentName").sendKeys("Dep_UPS");
		
		WebElement currency=driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select currencyList=new Select(currency);
		currencyList.selectByVisibleText("INR - Indian Rupee");
		
		driver.findElementById("createContactForm_description").sendKeys("Description_UPS");
		driver.findElementById("createContactForm_importantNote").sendKeys("ImportantNote_UPS");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("45678");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("mmvganesh@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("9962066735");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Divya");
		String sGetToName=driver.findElementById("generalToNameField").getAttribute("value");
		//System.out.println(sGetToName);
		
		driver.findElementById("createContactForm_generalAddress1").sendKeys("90 KP Koil Street");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600015");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("09876");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("Lakshmi");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("Saidapet");
		
		WebElement country=driver.findElementById("createContactForm_generalCountryGeoId");
		Select countryList=new Select(country);
		countryList.selectByVisibleText("India");
		Thread.sleep(1000);
		WebElement state=driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select stateList=new Select(state);
		stateList.selectByVisibleText("TAMILNADU");
		
			
		if(sGetToName.contains(sGetFirstName)) {
			System.out.println("Verified the First name "+sGetFirstName+" appears with capture name in To Field"+sGetToName);
		}
		else {
			System.out.println("Verification Failed the First name "+sGetFirstName+" appears with capture name in To Field"+sGetToName);
		}
				
		
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(1000);
		
		WebElement market=driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select marketList=new Select(market);
		marketList.selectByVisibleText("Car and Driver");
		//WebElement sGetListCampaign=marketList.getFirstSelectedOption();
		//System.out.println(sGetListCampaign);
		driver.findElementByXPath("//form[@id='addMarketingCampaignForm']//div[2]/table//tr[2]/td[2]/input").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//form[@id='updateContactForm']//div[2]/table//tr[8]/td[2]/input").click();
		Thread.sleep(1000);
		
		String sGetcampaign=driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		
		if(sGetcampaign.equalsIgnoreCase("Car and Driver")) {
			System.out.println("Verified the Campaign"+sGetcampaign+" Confirmed the choosen Marketing Campaigns appears");
		}
		else {
			System.out.println("Verification Failed the Campaign"+sGetcampaign+" Confirmed the choosen Marketing Campaigns appears");
		}
		
		
		
		
		
		

	}

}
