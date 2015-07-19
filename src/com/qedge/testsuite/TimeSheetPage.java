package com.qedge.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeSheetPage {
	Menu menu=null;
	public TimeSheetPage(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	
	@FindBy(id="employee")
	WebElement employee;
	@FindBy(id="btnView")
	WebElement view;
	public void selectEmployee()
	{
		employee.clear();
		employee.sendKeys("John Smith");
		view.click();
	}

}
