package net.techcenture.automation.tests1;

import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Login extends InitDriver{
	
	
	
	@Test(groups = {"smoke","high-priority"})
	public void LoginTest1() {
		driver.get("http://automationpractice.com");
		//
		//
	}
	
	
	
	@Test(groups = {"high-priority"})
	public void LoginTest2() {
		driver.get("http://automationpractice.com");
		//
		//
	}
	
	
	
	
	@Test
	public void LoginTest3() {
		driver.get("http://automationpractice.com");
		//
		//
	}
	
	
	
	
	@Test(groups = "low-priority", dataProvider = "myData", dataProviderClass = DataProviderClass.class)
	public void LoginTest4(String str) {
		driver.get("http://"+str+".com");
		//
		//
	}
	
	
	

}
