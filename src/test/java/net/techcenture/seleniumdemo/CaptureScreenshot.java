package net.techcenture.seleniumdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class CaptureScreenshot extends InitDriver{
	
	@Test
	public void cs() throws InterruptedException, IOException {
		
		
		driver.get("http://automationpractice.com/index.php");
		WebElement signin_btn = driver.findElement(By.className("login"));
		signin_btn.click();
		
		TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
		File screenshot = screenshotTaker.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshot/sc_"+System.currentTimeMillis()+".png"));
		
		
	}
		
}
