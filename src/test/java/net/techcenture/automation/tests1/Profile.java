package net.techcenture.automation.tests1;

import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Profile extends InitDriver{

	
	
	
	@Test
	public void ProfileTest1() {
		driver.get("http://www.cnn.com");
		//
		//
	}
	
	
	
	@Test(groups = {"smoke"})
	public void ProfileTest2() {
		driver.get("http://www.cnn.com");
		//
		//
	}
	
	
	
	
	@Test(groups = {"smoke"})
	public void ProfileTest3() {
		driver.get("http://www.cnn.com");
		//
		//
	}
	
	
	
	
	@Test
	public void ProfileTest4() {
		driver.get("http://www.cnn.com");
		//
		//
	}
	

	
	
}
