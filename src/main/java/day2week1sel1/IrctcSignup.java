package day2week1sel1;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

	//User ID Details
	driver.findElementById("userRegistrationForm:userName").sendKeys("mmvganesh1987");
	driver.findElementByLinkText("Check Availability").click();
	Thread.sleep(5000);
	driver.findElementById("userRegistrationForm:password").sendKeys("mmvganesh");
	driver.findElementById("userRegistrationForm:confpasword").sendKeys("mmvganesh");
	WebElement question=driver.findElementById("userRegistrationForm:securityQ");
	Select security=new Select(question);
	security.selectByVisibleText("What is your pet name?");
	driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("mathura");
	WebElement language=driver.findElementById("userRegistrationForm:prelan");
	Select preferred=new Select(language);
	preferred.selectByIndex(1);
	
	//Personal Details
	driver.findElementById("userRegistrationForm:firstName").sendKeys("Mathura");
	driver.findElementById("userRegistrationForm:middleName").sendKeys("Veera");
	driver.findElementById("userRegistrationForm:lastName").sendKeys("Ganesh");
	List<WebElement> sGender=driver.findElementsByName("userRegistrationForm:gender");
	sGender.get(0).click();
	List<WebElement> sMartialStatus=driver.findElementsByName("userRegistrationForm:maritalStatus");
	sMartialStatus.get(1).click();
	WebElement day=driver.findElementById("userRegistrationForm:dobDay");
	Select birthDay=new Select(day);
	birthDay.selectByVisibleText("29");
	WebElement month=driver.findElementById("userRegistrationForm:dobMonth");
	Select birthMonth=new Select(month);
	birthMonth.selectByVisibleText("MAR");
	WebElement year=driver.findElementById("userRegistrationForm:dateOfBirth");
	Select birthYear=new Select(year);
	birthYear.selectByVisibleText("1987");
	WebElement occupation=driver.findElementById("userRegistrationForm:occupation");
	Select sOccupation=new Select(occupation);
	sOccupation.selectByVisibleText("SelfEmployed");
	driver.findElementById("userRegistrationForm:uidno").sendKeys("2387216821902348");
	driver.findElementById("userRegistrationForm:idno").sendKeys("AZOPM6679G");
	WebElement sCountry=driver.findElementById("userRegistrationForm:countries");
	Select sCountryList=new Select(sCountry);
	sCountryList.selectByVisibleText("India");
	driver.findElementById("userRegistrationForm:email").sendKeys("mmvganesh@gmail.com");
	//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
	driver.findElementById("userRegistrationForm:mobile").sendKeys("9962066735");
	WebElement sNationality=driver.findElementById("userRegistrationForm:nationalityId");
	Select sListNationality=new Select(sNationality);
	sListNationality.selectByValue("94");
	
	//Residential Address
	driver.findElementById("userRegistrationForm:address").sendKeys("5/11,Flat,F3");
	driver.findElementById("userRegistrationForm:street").sendKeys("James 5th Street");
	driver.findElementById("userRegistrationForm:area").sendKeys("Poonamallee");
	driver.findElementById("userRegistrationForm:pincode").sendKeys("600056",Keys.TAB);
	Thread.sleep(1000);
	WebElement sCityList=driver.findElementById("userRegistrationForm:cityName");
	Select sCity=new Select(sCityList);
	sCity.selectByVisibleText("Tiruvallur");
	Thread.sleep(1000);
	WebElement sPostOffice=driver.findElementById("userRegistrationForm:postofficeName");
	Select sPostOfficeList=new Select(sPostOffice);
	sPostOfficeList.selectByVisibleText("Poonamallee S.O");
	driver.findElementById("userRegistrationForm:landline").sendKeys("9962066735");
	List<WebElement> sOfficeAddress=driver.findElementsByName("userRegistrationForm:resAndOff");
	sOfficeAddress.get(1).click();
	
	//Office Address
	driver.findElementById("userRegistrationForm:addresso").sendKeys("28,1stfllor");
	driver.findElementById("userRegistrationForm:streeto").sendKeys("Koil street");
	driver.findElementById("userRegistrationForm:areao").sendKeys("Saidapet");
	WebElement sOfficeCountry=driver.findElementById("userRegistrationForm:countrieso");
	Select sCountriesList=new Select(sOfficeCountry);
	sCountriesList.selectByVisibleText("India");
	driver.findElementById("userRegistrationForm:pincodeo").sendKeys("600015",Keys.TAB);
	Thread.sleep(1000);
	WebElement sOfficeCity=driver.findElementById("userRegistrationForm:cityNameo");
	Select sOfficeCityList=new Select(sOfficeCity);
	sOfficeCityList.selectByVisibleText("Chennai");
	Thread.sleep(1000);
	WebElement sPostOffices=driver.findElementById("userRegistrationForm:postofficeNameo");
	Select sPostOfficesList=new Select(sPostOffices);
	sPostOfficesList.selectByVisibleText("Saidapet S.O (Chennai)");
	driver.findElementById("userRegistrationForm:landlineo").sendKeys("9003187314");
	
	
	
	
	}
}


