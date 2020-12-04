package net.techcenture.seleniumdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.techcenture.core.InitDriver;

public class HtmlTableDemo extends InitDriver {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(2,25,35,254,1);
		System.out.println(list.indexOf(Collections.min(list)));
	}

	
	
	
	@Test
	public void interact_with_html_table() throws InterruptedException {
		driver.get("http://www.leafground.com/pages/table.html");
		
		//Get the count of number of columns
		List<WebElement> all_columns  = driver.findElements(By.xpath("//th[ancestor::table[@id='table_id']]"));
       // System.out.println(all_columns.size());
		Assert.assertEquals(all_columns.size(), 6, "Verify tolal number of colum is 6");
		
		
		//Get the count of number of rows
		int row_size = driver.findElements(By.xpath("//tr[child::td]")).size();
		Assert.assertEquals(row_size, 4, "Verify tolal number of row is 4");
		
		//Get the progress value of 'Learn to interact with Elements'
        String progess_value_of_row_2  = driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
        Assert.assertEquals(progess_value_of_row_2, "80%", "Verify progress value is 80%");
		
        
        //Check the vital task for the least completed progress.
        List<WebElement> rows = driver.findElements(By.xpath("//tr[child::td]"));
       
        List<Integer> percentages = new ArrayList<Integer>();
        for(int i=0;i<rows.size();i++) {
        	WebElement row = rows.get(i);
        	WebElement progress = row.findElement(By.xpath(".//td[2]"));
        	String progress_text = progress.getText().replace("%", "");
        	int converted_percentage = Integer.parseInt(progress_text);
        	percentages.add(converted_percentage);
     
        }
        int index = percentages.indexOf(Collections.min(percentages));
        driver.findElement(By.xpath("//tr[child::td]["+(index+1)+"]//td[3]")).findElement(By.tagName("input")).click();

        
        
        Thread.sleep(5000);
	}

}
