package net.techcenture.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends PageHeader{
	
	private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement textbox_signin_emailaddress;
	
	@FindBy(id = "passwd")
	private WebElement textbox_password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement button_signin;
	
	@FindBy(className = "alert-danger")
	private WebElement error_msg_holder;
	
	public SigninPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enter_signin_emailaddress(String email) {
		textbox_signin_emailaddress.sendKeys(email);
	}
	
	public void enter_password(String password) {
		textbox_password.sendKeys(password);
	}
	
	public void click_signin_button_to_login() {
		button_signin.click();
	}
	
	public String get_error_messages() {
		return error_msg_holder.getText();
	}

}
