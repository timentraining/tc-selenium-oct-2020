package net.techcenture.seleniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class TestLeaf extends InitDriver{
	
	@Test
	public void stale_element_reference_exception() throws InterruptedException {
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		
		WebElement bigBlueButton = driver.findElement(By.id("stale"));
		System.err.println(bigBlueButton.getText());
		bigBlueButton.click();
		Thread.sleep(3000);
		bigBlueButton = driver.findElement(By.id("stale"));
		System.err.println(bigBlueButton.getText());
	}
	
	
	@Test
	public void checkbox() {
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//input[@name='age']"));
		
		for(WebElement e: radio_buttons) {
			
			if(e.isSelected()) {
				System.out.println(e.getAttribute("value")+" th radio is selected");	
			}else {
				System.out.println(e.getAttribute("value")+" th radio is NOT selected");
				e.click();
				
				
				
				e.getSize().getHeight();
				
			}
		}
		
		
	}
	
	
	
	@Test
	public void radio_button() {
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//input[@name='age']"));
		
		for(WebElement e: radio_buttons) {
			
			if(e.isSelected()) {
				System.out.println(e.getAttribute("value")+" th radio is selected");	
			}else {
				System.out.println(e.getAttribute("value")+" th radio is NOT selected");
				e.click();
			}
		}
		
		
	}
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		new TestLeaf().copyPaste("KDJHDK^*^");
	}
	public  void copyPaste(String txt) throws AWTException, InterruptedException {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection stringSelection = new StringSelection( txt );
		clipboard.setContents(stringSelection, null);
		//control+V is for pasting...
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	
	@Test
	public void select_option_by_sendkeys() throws AWTException {
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement e = driver.findElement(By.xpath("(//select)[5]"));
		Select select = new Select(e);
		select.getWrappedElement().sendKeys("Appium");
		
		System.out.println("");
		
		
		
		e = driver.findElement(By.xpath("(//select)[6]"));
		
		select = new Select(e);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		select.selectByVisibleText("Selenium");
		select.selectByVisibleText("Loadrunner");
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
	}

}
