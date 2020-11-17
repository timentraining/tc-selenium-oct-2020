package demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {
	
	
	@Test
	public void test_1() {
//		String color = null;
//		
//		String fruit = "orange";
//		
//
//		if(fruit.equals("apple")) {
//			color = "red";
//		}
//		else if(fruit.equals("banana")) {
//			color = "yellow";
//		}
//		
//		Assert.assertEquals(color, "red", "Verify color name by fruit name");
//		
		
	}
	@Test
	public void test_headlights_on() {
		
		Car car = new Car();
		String headlight_status = car.turn_on_headlights("on");
		Assert.assertEquals(headlight_status, "Headlights are onewue","Verify car headlight is ON");
		
		
	}
	
	
	@Test
	public void test_headlights_off() {
		
		Car car = new Car();
		String headlight_status = car.turn_on_headlights("off");
		Assert.assertEquals(headlight_status, "Headlights are off","Verify car headlight is OFF");
		
		
	}
	
	
	@Test
	public void test_car_radio() {
		
		Car car = new Car();
		String radio_status = car.turn_on_radio("on");
		Assert.assertEquals(radio_status, "Radio is on","Verify car car radio is ON");
		
		
	}
	
	
	

}
