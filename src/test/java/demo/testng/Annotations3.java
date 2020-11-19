package demo.testng;

import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Annotations3 extends InitDriver{

	
	@Test
	public void testOne() {
		System.err.println("This is test one");
	}
	
	
	@Test
	public void testTwo() {
		System.err.println("This is test two");
	}
	
	
	@Test
	public void testThree() {
		System.err.println("This is test three");
	}
	

}
