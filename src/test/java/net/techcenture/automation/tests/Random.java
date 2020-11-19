package net.techcenture.automation.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Random {
	
	
	@Test
	public void get_all_links_from_a_webpage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
		
//		WebElement hundred_fiftyth_link = driver.findElement(By.xpath("(//a)[140]"));
//		System.out.println(hundred_fiftyth_link.getText());
		
		List<WebElement>  all_links = driver.findElements(By.xpath("//a"));
		
		for(int i=0; i<all_links.size(); i++) {
			WebElement link = all_links.get(i);
			System.out.println(link.getAttribute("href"));
		}
		
		
	}
	

}
