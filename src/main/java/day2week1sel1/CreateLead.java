package day2week1sel1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/");
		RemoteWebDriver driver ;
		//System.setProperty("webdriver.ie.driver", "C:/Ganesh/TestLeaf/Driver/IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver", "C://Ganesh/TestLeaf/Driver/geckodriver.exe");
		 driver = new FirefoxDriver();
	driver.manage().window().maximize();
	//driver.get(url);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("IBM India Pvt Ltd");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mathura");
		
		String sGetFirstName=driver.findElementById("createLeadForm_firstName").getAttribute("value");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("MeenakshiSundaram");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ganesh");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Sundaram");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select sourceList=new Select(source);
		sourceList.selectByVisibleText("Direct Mail");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Profile Title");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
		
		WebElement ind=driver.findElementById("createLeadForm_industryEnumId");
		Select industry=new Select(ind);
		industry.selectByVisibleText("Insurance");
		
		WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipList=new Select(ownership);
		ownershipList.selectByVisibleText("Corporation");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("234");
		driver.findElementById("createLeadForm_description").sendKeys("Description About Create Lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important Note About Create Lead");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("45678");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Dep_Testing");
		
		WebElement preferredcurrency=driver.findElementById("createLeadForm_currencyUomId");
		Select preferredcurrencyList=new Select(preferredcurrency);
		preferredcurrencyList.selectByVisibleText("BOB - Bolivian Boliviano");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("9");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TickerSymbol_1");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Suresh");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps/");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Mahesh_To");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Addres1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address_Line2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		
		WebElement state=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stateList=new Select(state);
		stateList.selectByVisibleText("Indiana");
		
		WebElement country=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryList=new Select(country);
		countryList.selectByVisibleText("United States");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600056");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("8987");
		
		WebElement marketcampaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketcampaignList=new Select(marketcampaign);
		marketcampaignList.selectByVisibleText("Car and Driver");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("987654899");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test@gmail.com");
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		
		String sFirstName=driver.findElementById("viewLead_firstName_sp").getText();
		//System.out.println(sGetFirstName);
		//System.out.println(sFirstName);
		if(sGetFirstName.equals(sFirstName)) {
			System.out.println("Verified the First Name is- "+sGetFirstName);
		}
		else {
			System.out.println("Verification Failed the First Name is- "+sGetFirstName+ "is not Exist");
		}
		driver.close();
		
		

		}

	}

