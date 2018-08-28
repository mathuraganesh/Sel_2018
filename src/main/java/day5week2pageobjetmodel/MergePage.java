package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MergePage extends Annotattion {
	public MergePage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//input[@name='id'])[1]")
	WebElement eleLeadId;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeadButton;
	
	@FindBy(xpath="//a[@class='linktext']")
	WebElement eleLeadIdLink;
	

	public MergeLeadPage switchParentWindow(String window) {
		switchToWindow(window);
		return new MergeLeadPage();
	}
	
	
	public MergePage typeLeadId(String sLeadId) {
		type(eleLeadId,sLeadId);
		return this;
	}
	
	public String getLeadId() {
		return getText(eleLeadId);
	}
	
	public MergePage clickFindLeads() throws InterruptedException {
		click(eleFindLeadButton);
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadPage clickLeadLink() throws InterruptedException {
		click(eleLeadIdLink);
		Thread.sleep(1000);
		switchToWindow(0);
		
		return new MergeLeadPage();
	}
}
