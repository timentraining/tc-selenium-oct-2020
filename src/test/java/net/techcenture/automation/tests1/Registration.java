package net.techcenture.automation.tests1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Registration extends InitDriver{
	
	
	@Parameters({"firstname","lastname","userid"})
	@Test
	public void RegisterAuser(@Optional("John") String fname, @Optional("Smith") String lname, @Optional("j.smith") String userid) {
		driver.get("http://automationpractice.com");
		//open registration form
		
		//enter first name
		System.out.println("Entered firstname: "+ fname);
		//enter last name
		System.out.println("Entered lastname: "+ lname);
		//enter userid
		System.out.println("Entered userid: "+ userid);
		//enter password
		//click register
	}
	
	
	
	@Test
	public void RegistrationTest2() {
		driver.get("http://automationpractice.com");
		//
		//
	}
	
	
	
	
	@Test
	public void RegistrationTest3() {
		driver.get("http://automationpractice.com");
		//
		//
	}
	
	


}
