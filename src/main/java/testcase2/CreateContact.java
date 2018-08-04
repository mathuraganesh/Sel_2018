package testcase2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateContact extends SeMethods{

	@Test
	public void login() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(1000);

		WebElement elecrm = locateElement("linktext","CRM/SFA");
		click(elecrm);
		
		WebElement eleContacts = locateElement("linktext","Contacts");
		click(eleContacts);
		Thread.sleep(1000);
		
		
		WebElement eleCreateContacts = locateElement("linktext","Create Contact");
		click(eleCreateContacts);
		Thread.sleep(1000);
		
		WebElement elefirstname = locateElement("id","firstNameField");
		type(elefirstname, "Mathura");
		
			
		WebElement elelastname = locateElement("id","lastNameField");
		type(elelastname, "Ganesh");
		WebElement elefirstnamelocal = locateElement("id","createContactForm_firstNameLocal");
		type(elefirstnamelocal, "mathura");
		WebElement elelastnamelocal = locateElement("id","createContactForm_lastNameLocal");
		type(elelastnamelocal, "ganesh");
		WebElement eletitle = locateElement("id","createContactForm_personalTitle");
		type(eletitle, "Mr");
		WebElement eleProfTitle = locateElement("id","createContactForm_generalProfTitle");
		type(eleProfTitle, "Title");
		WebElement eledepartment = locateElement("id","createContactForm_departmentName");
		type(eledepartment, "Dept_UPS");
		WebElement elecurrency = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(elecurrency,"INR - Indian Rupee");
		
		WebElement eledescription = locateElement("id","createContactForm_description");
		type(eledescription, "Description_UPS");
		WebElement eleImportantNote1 = locateElement("id","createContactForm_importantNote");
		type(eleImportantNote1,"ImpotantNote");
		WebElement eleAreaCode = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(eleAreaCode,"044");
		WebElement eleExtension1 = locateElement("id","createContactForm_primaryPhoneExtension");
		type(eleExtension1,"45569");
		WebElement eleEmail = locateElement("id","createContactForm_primaryEmail");
		type(eleEmail,"mmvganesh@gmail.com");
		WebElement elePhone = locateElement("id","createContactForm_primaryPhoneNumber");
		type(elePhone,"9962066735");
		WebElement eleAsk = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(eleAsk,"Divya");
		
		
		WebElement eleAddress1 = locateElement("id","createContactForm_generalAddress1");
		type(eleAddress1, "90 KP KOIL STREET");
		WebElement eleCity = locateElement("id","createContactForm_generalCity");
		type(eleCity, "Chennai");
		WebElement elepostcode = locateElement("id","createContactForm_generalPostalCode");
		type(elepostcode, "600015");
		WebElement eleExtension = locateElement("id","createContactForm_generalPostalCodeExt");
		type(eleExtension, "09876");
		WebElement eleAttName = locateElement("id","createContactForm_generalAttnName");
		type(eleAttName, "Lakshmi");
		WebElement eleAddress2 = locateElement("id","createContactForm_generalAddress2");
		type(eleAddress2, "Saidapet");
		WebElement eleCountry = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(eleCountry,"India");
		Thread.sleep(1000);
		
		WebElement eleCountry1 = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(eleCountry1,"TAMILNADU");
		
		WebElement eleToName = locateElement("id","generalToNameField");
		//String sGetToName=getAttribute(eleToName,"value");
		String sGetFirstName=getAttribute(elefirstname,"value");
		
		verifyPartialAttribute(eleToName,"value",sGetFirstName);
		
		WebElement eleCreateContact = locateElement("class","smallSubmit");
		click(eleCreateContact);
		Thread.sleep(1000);
		
		WebElement eleEditContact = locateElement("linktext","Edit");
		click(eleEditContact);
		Thread.sleep(1000);
		
		WebElement eleCampaign = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(eleCampaign,"Car and Driver");
		
		WebElement eleAddContact = locateElement("xpath","//form[@id='addMarketingCampaignForm']//div[2]/table//tr[2]/td[2]/input");
		click(eleAddContact);
		Thread.sleep(1000);
		
		WebElement eleUpdateContact = locateElement("xpath","//form[@id='updateContactForm']//div[2]/table//tr[8]/td[2]/input");
		click(eleUpdateContact);
		Thread.sleep(1000);
		
		WebElement eleverifyCampaign = locateElement("id","viewContact_marketingCampaigns_sp");
		verifyExactText(eleverifyCampaign, "Car and Driver");
		

	}

}
