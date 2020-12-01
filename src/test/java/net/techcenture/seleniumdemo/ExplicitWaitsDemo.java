package net.techcenture.seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class ExplicitWaitsDemo extends InitDriver{
	
	
	@Test
	public void text_tobe_present() {
		
	
		driver.get("http://www.leafground.com/pages/TextChange.html");
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean buttonHasTextIsClickMe = webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("btn"), "Click ME!"));
		System.out.println(buttonHasTextIsClickMe);
		
		
		
	}
	@Test
	public void element_tobe_present() {
		
		driver.get("http://www.leafground.com/pages/appear.html");
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
		System.out.println("Btn text: "+ btn.getText());
		//btn
		
	}

}
