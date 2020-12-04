package net.techcenture.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class JavaScriptExecutorDemo extends InitDriver{
	
	
	@Test
	public void js() throws InterruptedException {
		
		
		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("document.getElementById('search_query_top').value='hello';");
		
		
		//highlighting
		WebElement signin_btn = driver.findElement(By.className("login"));
		jsExec.executeScript("arguments[0].style.border='solid 3px red';", signin_btn);
		
		WebElement tshirt_btn  = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		jsExec.executeScript("arguments[0].style.border='solid 3px red';", tshirt_btn);
		
		
//		WebElement signin_button = driver.findElement(By.className("login"));
		
//		signin_button.click();
		
//		Actions actions = new Actions(driver);
//		actions.click(signin_button).build().perform();
		
		Thread.sleep(5000);
		
	}

}
