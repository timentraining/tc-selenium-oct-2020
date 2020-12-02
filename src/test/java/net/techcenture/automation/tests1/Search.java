package net.techcenture.automation.tests1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Search extends InitDriver{

	@Test(dataProvider = "searchData", dataProviderClass = DataProviderClass.class)
	public void SearchTest1(String gender, String size, String color, Integer maxPrice) {
		driver.get("http://automationpractice.com");
		//
		System.out.println("Searching a product with. Gender: "+gender+", Size: "+size+", Color: "+color+", MaxPrice: "+ maxPrice);
		//
	}
	
	
	
	@Test
	public void SearchTest2() {
		driver.get("http://automationpractice.com");
		//
		//
	}
	
	
	
	

}
