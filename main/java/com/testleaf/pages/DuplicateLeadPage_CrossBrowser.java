package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class DuplicateLeadPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{
	
	public DuplicateLeadPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage_CrossBrowser clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage_CrossBrowser(driver);
	}
	
}
