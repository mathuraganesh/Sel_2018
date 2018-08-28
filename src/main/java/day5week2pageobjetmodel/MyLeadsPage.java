package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLeadsPage extends Annotattion {
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Create Lead")
	WebElement eleCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	public FindLeadPage clickFindLeadLink() {
		click(eleFindLeads);
		return new FindLeadPage();
	}
	
	@FindBy(linkText="Merge Leads")
	WebElement eleMergeLeads;
	public MergeLeadPage clickMergeLeadLink() throws InterruptedException {
		click(eleMergeLeads);
		Thread.sleep(1000);
		return new MergeLeadPage();
	}

}
