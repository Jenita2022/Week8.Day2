package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class LeadsPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser {

	public LeadsPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage_CrossBrowser clickCreateLeadLink() {
		driver.findElement(By.linkText(prop.getProperty("link_Create_Lead"))).click();
		return new CreateLeadPage_CrossBrowser(driver);
	}

	public FindLeadPage_CrossBrwoser clickFindLeadsLink() {
		driver.findElement(By.linkText(prop.getProperty("link_Find_Leads"))).click();
		return new FindLeadPage_CrossBrwoser(driver);
	}
//	public MergeLeadPage clickMergeLeadLink() {
//		driver.findElement(By.linkText("Merge Leads")).click();
//		return new MergeLeadPage(driver);
//	}

}
