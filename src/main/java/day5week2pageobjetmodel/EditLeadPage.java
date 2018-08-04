package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditLeadPage extends Annotattion {
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleClearField;
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleEditField;
	
	@FindBy(xpath="//input[@class='smallSubmit']")
	WebElement eleSubmitButton;
	
	public EditLeadPage clearCompanyName() {
		clear(eleClearField);
		return this;
	}
	
	
	public EditLeadPage typeCompanyName(String Cname) {
		type(eleEditField, Cname);
		return this;
	}
	
	public ViewLeadPage clickEditButton() throws InterruptedException {
		click(eleSubmitButton);
		Thread.sleep(1000);
		return new ViewLeadPage();
	}
}
