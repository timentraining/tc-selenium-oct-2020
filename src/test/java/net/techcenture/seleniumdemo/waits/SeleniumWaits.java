package net.techcenture.seleniumdemo.waits;

import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	
	@Test
	public void wait_until_element_disappear() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/disapper.html");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.err.println("Element is now disappeared");
		
	}
	
	
	@Test
	public void read_text_from_element() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		//Thread.sleep(65000);
		
		WebElement quoteHolder = driver.findElement(By.id("explicitWaitTextPresentDemo"));
		
		WebDriverWait wait  = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.textToBePresentInElement(quoteHolder, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		System.out.println(quoteHolder.getText());
		
	}
	
	
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Calendar cal = Calendar.getInstance();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("abc213@mailinator.com");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		
	}

}
