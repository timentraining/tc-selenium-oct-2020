package net.techcenture.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitDriver {
	
	protected WebDriver driver;
	
//	@Parameters({"browserType"})
	@BeforeMethod(alwaysRun = true)
	public void invoke_browser() {
//		System.err.println(browserType);
//		if(browserType.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}else if(browserType.equalsIgnoreCase("ie")) {
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
//		
//		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		
//		int x = driver.manage().window().getPosition().getX();
//		int y = driver.manage().window().getPosition().getY();
//		System.out.println(x);
//		System.out.println(y);
		Point point = new Point(-1907, 43);
		driver.manage().window().setPosition(point);
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void close_browser() {
		driver.close();
	}
}
