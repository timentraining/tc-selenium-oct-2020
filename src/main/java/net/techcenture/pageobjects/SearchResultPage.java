package net.techcenture.pageobjects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends PageHeader{

	@FindBy(className = "heading-counter")
	private WebElement result_count_holder;
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public int get_result_count() {
		String str =  result_count_holder.getText();
		str=StringUtils.trim(str);
		return Integer.parseInt(str.split(" ")[0]);
	}

}
