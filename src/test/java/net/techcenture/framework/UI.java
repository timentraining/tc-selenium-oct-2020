package net.techcenture.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UI {
	
	private WebDriver driver;
	
	public UI( WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void open_url(String url) {
		driver.get(url);
	}
	
	//CLICK METHODS
	public void click_element_by_id(String id) {
		driver.findElement(By.id(id)).click();
		//
	}
	public void click_element_by_class(String className) {
		driver.findElement(By.className(className)).click();
		//
	}
	public void click_element_by_xpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		//
	}
	
	
	
	
	//SEND KEYS
	public void sendkeys_by_id(String id, String value ) {
		driver.findElement(By.id(id)).sendKeys(value);
	}
	public void sendkeys_by_class(String className, String value ) {
		driver.findElement(By.className(className)).sendKeys(value);
	}
	public void sendkeys_by_xpath(String xpath, String value ) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	
	
	
	
	
	

}
