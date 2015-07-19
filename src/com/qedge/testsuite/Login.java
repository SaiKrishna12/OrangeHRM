package com.qedge.testsuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login  extends Constants{
	
	@Parameters("browser")
	@Test
	public void loginTest(String b) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		 driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://localhost:8090/orangehrm");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		OrangehrmLogin login=PageFactory.initElements(driver,OrangehrmLogin.class);
		login.loginTest("Admin","Admin");
	}

}
