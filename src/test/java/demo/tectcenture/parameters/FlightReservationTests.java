package demo.tectcenture.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.techcenture.framework.DB;
 class Excel{
	 
	public static final String val="3";
	 
	public static String getCell() {
		return "3";
	}
}
public class FlightReservationTests {
	
	@DataProvider(name = "flightdata")
	public Object[][] getFlightTestData() {
		Object[][] obj = new Object[][]{
			{1,"oneway","01/25/2021",""},
			{2,"oneway","01/25/2021",""},
			{3,"round","01/25/2021","02/25/2021"}
		};
		
		return obj;
	}
	
	@Test(dataProvider = "flightdata")
	public void reserve_a_flight_with_1_pass_and_oneway_dataprovider(
			Integer numOfPass, 
			String typeOfTrip, 
			String depDate, 
			String retDate ) {
		System.out.println("launced website");
		System.out.println("go to flight reservation page");
		System.out.println("Enter number of pass:  "+ numOfPass);
		System.out.println("Enter origin airport: JFK");
		System.out.println("Enter destination airport: ATL");
		System.out.println("Select type of trip: "+ typeOfTrip);
		System.out.println("Select dep date: "+ depDate);
		
		if(!retDate.isEmpty()) {
			System.out.println("Select ret date: "+ retDate);
		}
		
		System.out.println("Verify flight resevred successfully");
	
	}

	
	@Test
	@Parameters({"numberofpassenger","typeoftrip","departuredate","returndate"})
	public void reserve_a_flight_with_1_pass_and_oneway(
			@Optional("3") int numOfPass, 
			@Optional("oneway") String typeOfTrip, 
			@Optional("01/25/2021") String depDate, 
			@Optional("1") String retDate ) {
		System.out.println("launced website");
		System.out.println("go to flight reservation page");
		System.out.println("Enter number of pass:  "+ numOfPass);
		System.out.println("Enter origin airport: JFK");
		System.out.println("Enter destination airport: ATL");
		System.out.println("Select type of trip: "+ typeOfTrip);
		System.out.println("Select dep date: "+ depDate);
		
		if(!retDate.isEmpty()) {
			System.out.println("Select ret date: "+ retDate);
		}
		
		System.out.println("Verify flight resevred successfully");
		
	}

}
