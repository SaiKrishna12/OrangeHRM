package com.qedge.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	public void admin()
	{
		admin.click();
	}
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim;
	public void pim()
	{
		pim.click();
	}
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement leave;
	public void leave()
	{
		leave.click();
	}
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement time;
	public void time()
	{
		time.click();
	}
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recruitment;
	public void recruitment()
	{
		recruitment.click();
	}
    
	@FindBy(id="menu_performance_viewPerformanceModule")
	WebElement performance;
	public void performance()
	{
		performance.click();
	}

}
