package net.techcenture.automation.tests1;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "searchData")
	public static Object[][] searchData(){
		Object[][] data = new Object[][] {
			{"M","Medium","Black",85},
			{"F","Small","Red",125},
			{"F","Extra Small","White",55}
		};
		
		return data;
	}

	
	@DataProvider(name = "myData")
	public static Object[][] myData(){
		Object[][] data = new Object[][] {
			{"M"},
			{"F"},
			{"F"}
		};
		
		return data;
	}
	

}
