package com.qedge.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangehrmLogin {
	
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	public void loginTest(String username,String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		login.click();
	}
	
	
	
	

}
