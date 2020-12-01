package net.techcenture.seleniumdemo;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class DriverSwitch extends InitDriver{
	
	@Test
	public void switch_to_default() throws InterruptedException {
		
//		driver.switchTo().alert();
		driver.switchTo().frame(0);
		//
		//
		//
//		driver.switchTo().window("");
		
		
		driver.switchTo().defaultContent();
	
	}
	
	@Test
	public void switch_to_window_multiple() throws InterruptedException {
		
		driver.get("http://www.leafground.com/pages/Window.html");
//		String main_window_handle = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		
		
		Set<String> all_window_handles = driver.getWindowHandles();
		
		for(String handle : all_window_handles) {
			driver.switchTo().window(handle);
			
			String title = driver.getTitle();
			System.err.println(title);
			
			if(title.equals("TestLeaf - Interact with HyperLinks")) {
				break;
			}
			
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'clicking me?')]")).click();
		Thread.sleep(3000);
	
	}
	

	@Test
	public void switch_to_window() throws InterruptedException {
		
		driver.get("http://www.leafground.com/pages/Window.html");
		String main_window_handle = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		
		
		Set<String> all_window_handles = driver.getWindowHandles();
		
		for(String handle : all_window_handles) {
			if(handle.equals(main_window_handle)) {
				//
			}else {
				driver.switchTo().window(handle);
			}
		}
		
		
		
		
		
		
		driver.findElement(By.xpath("//a[child::h5[text()='Table']]")).click();
		Thread.sleep(3000);
	
	}

	@Test
	public void switch_to_frame_2() throws InterruptedException {
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		
		driver.findElement(By.id("Click1")).click();
		Thread.sleep(3000);
	}
	
	
	@Test
	public void switch_to_frame_1() {
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
	}
	
	
	@Test
	public void switch_alert() throws InterruptedException {
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
	}
	
	

	@Test
	public void switch_alert_and_type() throws InterruptedException {
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		
		Thread.sleep(3000);
		
//		driver.switchTo().alert().sendKeys("Hello");
//		driver.switchTo().alert().accept();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Seleniummmmmmmm");
		
		
		Thread.sleep(3000);
		
		alert.accept();
		
		Thread.sleep(3000);
		
	}

}
