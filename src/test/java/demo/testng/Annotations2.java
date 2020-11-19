package demo.testng;

import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class Annotations2 extends InitDriver{

	@Test
	public static void testOne() {
		System.err.println("This is test one");
	}
	
	@Test
	public  static void testTwo() {
		System.err.println("This is test two");
	}
	
	@Test
	public  static void testThree() {
		System.err.println("This is test three");
	}
	

}
