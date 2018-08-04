package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MergeLeadPage extends Annotattion {
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//form[@name='MergePartyForm'])//a")
	WebElement eleFirstLeadIdGrid;
		
	@FindBy(xpath="//a[@class='linktext']")
	WebElement eleLeadLink;
	
	@FindBy(xpath="//table[@id='widget_ComboBox_partyIdTo']//following::a")
	WebElement eleSecondLeadIdGrid;
	
	@FindBy(linkText="Merge")
	WebElement eleMergeButton;
	
	public String ParentWindow() {
		return getParentWindow();
	}
	
	public MergeLeadPage switchParentWindow(String window) {
		switchToWindow(window);
		return this;
	}
	
	public MergePage FirstLeadIDGrid() {
		click(eleFirstLeadIdGrid);
		return new MergePage();
	}
	
	public MergePage SecondLeadIDGrid() {
		click(eleSecondLeadIdGrid);
		return new MergePage();
	}
	
	public MergeLeadPage MergeButton() throws InterruptedException {
		click(eleMergeButton);
		Thread.sleep(1000);
		return new MergeLeadPage();
	}
	
	public FindLeadPage AcceptAlert() throws InterruptedException {
		acceptAlert();
		Thread.sleep(1000);
		return new FindLeadPage();
	}
	
}

