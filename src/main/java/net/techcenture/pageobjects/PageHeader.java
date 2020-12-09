package net.techcenture.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHeader {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Contact Us']")
	private WebElement button_contact_us;
	
	@FindBy(className = "login")
	private WebElement signin_button;
	
	@FindBy(id = "search_query_top")
	private WebElement search_text_box;
	
	@FindBy(name = "submit_search")
	private WebElement button_search;
	
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement button_women;
	
	@FindBy(xpath = "(//a[text()='T-shirts'])[2]")
	private WebElement button_tshirt;
	
	
	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	private WebElement button_dresses;
	
	
	
	public PageHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public TshirtListingPage click_tshirt_button() {
		button_tshirt.click();
		return new TshirtListingPage(driver);
	}
	
	public void click_women_button() {
		button_women.click();
	}
	
	public void click_dresses_button() {
		button_dresses.click();
	}
	
	
	public SearchResultPage click_search_button() {
		button_search.click();
		return new SearchResultPage(driver);
	}
	public SigninPage click_signin_button() {
		signin_button.click();
		return new SigninPage(driver);
	}
	public void click_contactus_button() {
		button_contact_us.click();
	}
	
	public void enter_search_text(String text) {
		search_text_box.sendKeys(text);
	}
	
	
}
