package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuplicateLeadPage extends Annotattion {
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	
		
	@FindBy(className="smallSubmit")
	WebElement eleDuplicateButton;
	
	public boolean getTitle(String titleName) {
		return verifyTitle(titleName);
	}  
	
	public ViewLeadPage clickDuplicateButton() throws InterruptedException {
		click(eleDuplicateButton);
		Thread.sleep(1000);
		return new ViewLeadPage();
	}
}
