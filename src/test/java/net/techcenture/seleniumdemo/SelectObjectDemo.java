package net.techcenture.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class SelectObjectDemo extends InitDriver{

	
	
	@Test
	public void actions__keys() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		WebElement textbox = driver.findElement(By.id("search_query_top"));
		
		Actions actions = new Actions(driver);
		actions
		.moveToElement(textbox)
		.click(textbox)
		.sendKeys(Keys.BACK_SPACE)
		.build().perform();
		Thread.sleep(15000);
		
	}
	
	
	@Test
	public void actions_sendkeys() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php");
		WebElement textbox = driver.findElement(By.id("search_query_top"));
		
		
		Actions actions = new Actions(driver);
		actions.sendKeys(textbox, "hello");
		Thread.sleep(5000);
		
	}
	@Test
	public void actions_right_click() throws InterruptedException {
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		actions.contextClick(source).build().perform();
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void actions_drag_drop() throws InterruptedException {
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		
	}
	@Test
	public void actions_mouse_over() throws InterruptedException {
		driver.get("http://automationpractice.com/");
		
		Thread.sleep(3000);
		WebElement thumbnail = driver.findElement(By.xpath("(//img[@title='Blouse'])[1]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(thumbnail).build().perform();
		Thread.sleep(5000);
	}
	
	
	@Test
	public void regeistration() throws InterruptedException {
		driver.get("http://automationpractice.com/");
		
		driver.findElement(By.className("login")).click();
		
//		Actions actions = new Actions(driver);
//		actions.click(driver.findElement(By.className("login"))).build().perform();
//		
		
		driver.findElement(By.id("email_create")).sendKeys("sometestemail@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebElement dob_day_element = driver.findElement(By.id("days"));
		Select dob_day = new Select(dob_day_element);
//		dob_day.selectByVisibleText("15  ");
		dob_day.selectByValue("15");
		
		WebElement dob_month_element = driver.findElement(By.id("months"));
		Select dob_month = new Select(dob_month_element);
		dob_month.selectByValue("8");
		
		
		WebElement dob_year_element = driver.findElement(By.id("years"));
		Select dob_year = new Select(dob_year_element);
		dob_year.selectByIndex(2);
		
		Thread.sleep(5000);
		
	}
	
}
