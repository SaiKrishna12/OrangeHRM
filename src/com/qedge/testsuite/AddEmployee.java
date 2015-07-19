package com.qedge.testsuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	
	@Test
	public void addEmployeeTest() throws IOException, InterruptedException
	{
		AddEmployeePage emppage=PageFactory.initElements(driver,AddEmployeePage.class);
		emppage.menu.pim();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		int rowcount=eo.getRowCount(path1,0);
		for(int i=1;i<=rowcount;i++)
		{
			Thread.sleep(3000);
			Row r=eo.returnRow(path1,0,i);
			emppage.addEmployee(r);
			Thread.sleep(3000);
			emppage.menu.pim();
		}	
	}
		
	

}
