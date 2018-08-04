package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindLeadPage extends Annotattion {
	public static String sFirstLeadId;
	public FindLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleEditFirstName;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLead;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleLeadID;
	
	@FindBy(xpath="//span[text()='Phone']")
	WebElement eleDeletePhoneTab;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement eleDeletePhoneNumber;
	
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleGetFirstLeadId;
	
	@FindBy(xpath="(//input[@name='id'])[1]")
	WebElement eleTypeLeadId;
	
	@FindBy(xpath="//div[@class='x-paging-info']")
	WebElement eleVerifyrecord;
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement eleEmailTab;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	WebElement eleEmailId;
	
	@FindBy(xpath="(//a[@class='linktext'])[6]")
	WebElement eleGetFirstName;
	
	
	public FindLeadPage typeEditFname(String EditfName)
	{
		type(eleEditFirstName, EditfName);
		return this;
	}
	
	
	public FindLeadPage clickFindLeads() throws InterruptedException
	{
		click(eleFindLead);
		Thread.sleep(1000);
		return this;
	}
	
	public ViewLeadPage clickLeadId() throws InterruptedException {
		click(eleLeadID);
		Thread.sleep(1000);
		return new ViewLeadPage();
	}
	
	public FindLeadPage clickDeletePhoneTab() throws InterruptedException {
		click(eleDeletePhoneTab);
		Thread.sleep(1000);
		return this;
	}
	
	public FindLeadPage typeDeletePhoneNumber(String phoneNumber) {
		type(eleDeletePhoneNumber, phoneNumber);
		return this;
	}
	
	public FindLeadPage getLeadID() {
		sFirstLeadId=getText(eleGetFirstLeadId);
		//System.out.println("First LeadID"+sFirstLeadId);
		return this;
	}
	
	public FindLeadPage typeLeadId() {
		//System.out.println("First LeadID"+sFirstLeadId);
		type(eleTypeLeadId,sFirstLeadId);
		return this;
	}
	
	public FindLeadPage typeFirstLeadId(String sLeadId) {
		//System.out.println("First LeadID"+sFirstLeadId);
		type(eleTypeLeadId,sLeadId);
		return this;
	}
	
	public FindLeadPage verifyNoRecordDisplay() {
		verifyExactText(eleVerifyrecord,"No records to display");
		return this;
	}
	
	public FindLeadPage clickEmailTab() throws InterruptedException {
		click(eleEmailTab);
		Thread.sleep(1000);
		return this;
	}
	
	public FindLeadPage typeEmailId(String emailId) {
		type(eleEmailId, emailId);
		return this;
	}
	
	/*public FindLeadPage getFirstName() {
		sGetFirstName=getText(eleGetFirstName);
		System.out.println("First Name"+sGetFirstName);
		return this;
	}  */
	
	public String getFirstName() {
		return getText(eleGetFirstName);
				
	}


}
