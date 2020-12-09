package net.techcenture.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TshirtListingPage extends PageHeader{

	@FindBy(id = "selectProductSort")
	private WebElement sort_dropdown_element;
	private Select sort_dropdown;
	
	
	
	public TshirtListingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		sort_dropdown = new Select(sort_dropdown_element);
		
	}
	
	
	public void sort_by_lowestfirst() {
		sort_dropdown.selectByValue("reference:asc");
	}

}
