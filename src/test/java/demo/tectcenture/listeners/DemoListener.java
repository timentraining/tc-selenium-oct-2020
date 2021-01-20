package demo.tectcenture.listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(MyTestngListener.class)
public class DemoListener {
	EventFiringWebDriver driver;
	@BeforeClass
	public void initD() {
		WebDriverManager.chromedriver().setup();
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new MyWebDriverListener());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void loginTest_1() {
	
		
		driver.get("http://automationpractice.com/");
		
		driver.findElement(By.className("login")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		
		
		driver.quit();
		
		
	}
	
	@Test
	public void loginTest_2() {

		driver.get("http://automationpractice.com/");
		
		driver.findElement(By.className("login")).click();
		
		Assert.assertEquals(true, false);
		
		driver.get("http://www.google.com");
		
		
		driver.findElement(By.id("email")).sendKeys("abc123@mailinator.com");
		
		
		driver.quit();
		
		
	}
	
	
	@Test
	public void loginTest_3() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://automationpractice.com/");
		
		driver.findElement(By.className("login")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		
		
		driver.quit();
		
		
	}

}
