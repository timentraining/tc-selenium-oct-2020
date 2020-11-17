package net.techcenture.automation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {
	
	@Test(enabled = false)
	public void Login_with_invalid_userid() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//		Click Sign in button from top right corner of the page
		WebElement sign_in_button = driver.findElement(By.className("login"));
		sign_in_button.click();
		
//		Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		WebElement email_address_textfield = driver.findElement(By.id("email"));
		email_address_textfield.sendKeys("myunknowxaad@mailinator.com");
		
//			Click Sign in button
		sign_in_button = driver.findElement(By.id("SubmitLogin"));
		sign_in_button.click();
		
//			Verify error message displayed 'There is 1 error'
		WebElement err_msg1_holder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		String errMsg1 = err_msg1_holder.getText();
		Assert.assertEquals(errMsg1, "There is 1 error-ddd","Verify a text displayed for error as [There is 1 error]");
		
//			Verify error message displayed 'Password is required.'
		WebElement err_msg2_holder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));
		String errMsg2 = err_msg2_holder.getText();
		Assert.assertEquals(errMsg2, "Password is required.","Verify a text displayed for error as [Password is required.]");

	}
	@Test(enabled = true, priority = 1)
	public void login_2_test() {
		
	}
	@Test
public void login_3_test() {
	}

	@Test(priority = 0)
public void login_4_test() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/");
		WebElement search_text_box = driver.findElement(By.id("search_query_top"));
		boolean is_srch_txt_box_displayed = search_text_box.isDisplayed();
		
		Assert.assertEquals(is_srch_txt_box_displayed, true,"Check search text box dispayed.");
}

}
