package net.techcenture.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;
import net.techcenture.framework.UI;
import net.techcenture.pageobjects.HomePage;
import net.techcenture.pageobjects.SearchResultPage;
import net.techcenture.pageobjects.SigninPage;
import net.techcenture.pageobjects.TshirtListingPage;

public class PageObjectModeling extends InitDriver{
	
	@Test
	public void Login_with_valid_userid_but_invalid_password_pom() throws InterruptedException {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.enter_search_text("Black Jacket");
		homePage.click_search_button();
		
		TshirtListingPage tshirtListingPage = homePage.click_tshirt_button();
		tshirtListingPage.sort_by_lowestfirst();
		
		Thread.sleep(2000);
		SigninPage signinPage = homePage.click_signin_button();
		
		
		signinPage.enter_search_text("summer dress");
		SearchResultPage searchResultPage = signinPage.click_search_button();
		System.err.println(searchResultPage.get_result_count());
		signinPage = searchResultPage.click_signin_button();
		
		signinPage.enter_signin_emailaddress("xyz987@gmail.com");
		signinPage.enter_password("324356765");
		signinPage.click_signin_button();
		String errorMsgs = signinPage.get_error_messages();
		System.out.println(errorMsgs);
		
		
		Thread.sleep(3000);
	}
	
	
	@Test
	public void Login_with_valid_userid_but_invalid_password_pom1() throws InterruptedException {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.enter_search_text("Black Jacket");
		Thread.sleep(3000);
	}
	
	
	@Test
	public void Login_with_valid_userid_but_invalid_password_pom2() throws InterruptedException {
		driver.get("http://www.automationpractice.com");
		HomePage homePage = new HomePage(driver);
		homePage.enter_search_text("Black Jacket");
		Thread.sleep(3000);
	}
	
	@Test
	public void Login_with_valid_userid_but_invalid_password() {
		driver.get("http://www.automationpractice.com");
		
		WebElement signInBUtton = driver.findElement(By.xpath("//a[@class='login']"));
		signInBUtton.click();
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("abc213@mailinator.com");
		driver.findElement(By.xpath("//input[@id='passwd' and @name='passwd' and @data-validate='isPasswd']")).sendKeys("myinvalidpwd");
//		Verify error message displayed 'There is 1 error'
//		Verify error message displayed 'Authentication failed.'
	}
	
	
	@Test
	public void Login_with_valid_userid_but_invalid_password_using_our_framework() {
		
		UI ui = new UI(driver);
		ui.open_url("http://www.automationpractice.com");
		ui.click_element_by_xpath("//a[@class='login']");
		ui.sendkeys_by_xpath("//input[@name='email' and @id='email']", "abc213@mailinator.com");
		ui.sendkeys_by_xpath("//input[@id='passwd' and @name='passwd' and @data-validate='isPasswd']", "myinvalidpwd");
	}
	
	@Test(enabled = false)
	public void Login_with_invalid_userid() {

		driver.get("http://www.automationpractice.com");
		WebElement sign_in_button = driver.findElement(By.className("login"));
		sign_in_button.click();
		WebElement email_address_textfield = driver.findElement(By.id("email"));
		email_address_textfield.sendKeys("myunknowxaad@mailinator.com");
		sign_in_button = driver.findElement(By.id("SubmitLogin"));
		sign_in_button.click();
		WebElement err_msg1_holder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		String errMsg1 = err_msg1_holder.getText();
		Assert.assertEquals(errMsg1, "There is 1 error-ddd","Verify a text displayed for error as [There is 1 error]");
		WebElement err_msg2_holder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
		String errMsg2 = err_msg2_holder.getText();
		Assert.assertEquals(errMsg2, "Password is required.","Verify a text displayed for error as [Password is required.]");

	}

	//
	//
	//
	//

}
