package net.techcenture.seleniumdemo;

import org.testng.annotations.Test;

import net.timentraining.core.TestBase;
import net.timentraining.core.io.Excel;
import net.timentraining.core.mail.Gmail;
import net.timentraining.core.util.TestUtility;

public class UsingFramework extends TestBase{
	
	
	
	
	public static void main(String[] args) {

		System.out.println(TestUtility.getTodaysDate());
		System.out.println(TestUtility.getPastDate(7));
		System.out.println(TestUtility.generate_random_alphanumeric_string(12));
		
		//using emails
//		Gmail gmail = new Gmail("timentrainingstudent@gmail.com", "time&training");
//		String emailMsg = gmail.get_most_recent_email();
//		System.out.println(emailMsg);
		
//		gmail.ComposeEmail("somebody@gmail.com", "Test report", "test msg");
		
		
	}
	
	@Test
	public void simpleTest() {
		webui.launch("http://automationpractice.com/");
		webui.click_element_by_className("login");
		
		Excel excel = new Excel("F:\\Time And Training\\Demo Folder\\tc\\TestData.xlsx", "Sheet1");
		String s = excel.getCellValue(2, 1);
		System.out.println(s);
		
		webui.enter_text_by_id("email", s);
		
		
		
		
	}

}
