package com.qedge.testsuite;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TimeSheet extends Constants{
	
	@Test
	public void timeSheetTest() throws InterruptedException
	{
		TimeSheetPage tsp=PageFactory.initElements(driver,TimeSheetPage.class);
		tsp.menu.time();
		Thread.sleep(4000);
		tsp.selectEmployee();
	}

}
