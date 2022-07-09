package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class EditLeadPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{
	
	public EditLeadPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage_CrossBrowser clearCoName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	
	public EditLeadPage_CrossBrowser enterCoName(String UpdatedCoName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(UpdatedCoName);
		return this;
	}

	public ViewLeadPage_CrossBrowser clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		return new ViewLeadPage_CrossBrowser(driver);
	}
	
}
