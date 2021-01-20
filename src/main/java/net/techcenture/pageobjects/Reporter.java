package net.techcenture.pageobjects;

public class Reporter {
	
	public void reportTestStarted(String testName) {
		System.out.println("Test started: "+ testName);

	}
	
	public void report_step(String stepDescription, String msg, String passorfail) {
		System.out.println("[ "+passorfail+" ] TN: "+ " | " + "Step: "+ stepDescription+"\n"+"- "+ msg);
	}
	

}
