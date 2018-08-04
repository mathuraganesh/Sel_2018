package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends Annotattion {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleVerifyFname;
	
	@FindBy(linkText="Edit")
	WebElement eleEditButton;
	
	@FindBy(xpath="//a[text()='Duplicate Lead']")
	WebElement eleDuplicateButton;

	@FindBy(id="viewLead_companyName_sp")
	WebElement eleverifycompanyname;
	
	@FindBy(xpath="//a[@class='subMenuButtonDangerous']")
	WebElement eleDeleteButton;
	
	
	public ViewLeadPage verifyFirstName(String expectedText) {
		verifyExactText(eleVerifyFname, expectedText);
		//System.out.println("First Name"+expectedText);
		return this;
	}
	
	public EditLeadPage clickEditButton() {
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	public EditLeadPage verifyCompanyName(String expectedText) {
		verifyPartialText(eleverifycompanyname, expectedText);
		return new EditLeadPage();
	}
	
	public MyLeadsPage clickDeleteButton() throws InterruptedException {
		click(eleDeleteButton);
		Thread.sleep(1000);
		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickDuplicateLink() {
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
	
	
	
}
