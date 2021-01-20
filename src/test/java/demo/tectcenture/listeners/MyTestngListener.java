package demo.tectcenture.listeners;

import org.openqa.selenium.logging.NeedsLocalLogs;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import net.techcenture.pageobjects.Reporter;

public class MyTestngListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		new Reporter().reportTestStarted(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.err.println("************** Test suite started **************** ");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.err.println("************** Test suite finished **************** ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.err.println("Test is passed:"+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.err.println("Test is FAILED:"+ result.getName());
	}
	
	
	

}
