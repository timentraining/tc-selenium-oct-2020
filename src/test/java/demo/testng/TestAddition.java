package demo.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAddition {

	
	public static void launching_website() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span/strong"));
		String phoneNumber = e.getText();
		if(phoneNumber.equals("0123-456-789")) {
			System.out.println("Launching website passed");
		}else {
			System.out.println("Launching website failed");
		}
		
		
	}
	
	@Test
	public static void subtraction() {
		int x=5;
		int y=3;
		int z=0;
		
		z=x-y;
		
		Assert.assertEquals(z, 0,"Verify 5 -3 is equal to 2");
		
	}
	
	
	public static void division() {
		int x=50;
		int y=5;
		int z=0;
		
		z=x-y;
		
		if(z==10) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}

}
