package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends Annotattion {
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFisrtName;
	
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleEmailId;
	
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elePhoneNumber;
	
	@FindBy(className="smallSubmit")
	WebElement eleSubmitButton;
	
	@FindBy(className="errorList")
	WebElement eleErrorMessage;
	
	public CreateLeadPage typeCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName) {
		type(eleFisrtName, fName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String cName) {
		type(eleLastName, cName);
		return this;
	}
	
	public CreateLeadPage typeEmailid(String emailId) {
		type(eleEmailId, emailId);
		return this;
	}
	
	public CreateLeadPage typephoneNumber(String phoneNumber) {
		type(elePhoneNumber, phoneNumber);
		return this;
	}
	public ViewLeadPage clickCreateLead() {
		click(eleSubmitButton);
		return new ViewLeadPage();
	}
	public CreateLeadPage veifyErrMsg(String expectedText) {
		verifyPartialText(eleErrorMessage, expectedText);
		return this;
	}
	public CreateLeadPage clickSubmitForFailure() {
		click(eleSubmitButton);
		return this;
	}
}
