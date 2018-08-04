package day5week2pageobjetmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage extends Annotattion {
	public MyHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	
	public MyLeadsPage clickLeads() {
		click(eleLeads);
		return new MyLeadsPage();
	}

	
}
