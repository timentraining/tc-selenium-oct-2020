package net.techcenture.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageHeader{
	
//	private WebDriver driver;
	

	

	
	public HomePage(WebDriver driver) {
//		this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	

	
	//
	
	
	//
	
	
	
	//
	

}
