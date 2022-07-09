package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class ViewLeadPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{

	public ViewLeadPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public ViewLeadPage_CrossBrowser verifyFirstName() {
		System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}
	public ViewLeadPage_CrossBrowser verifyLastName() {
		System.out.println(driver.findElement(By.id("viewLead_lastName_sp")).getText());
		return this;
	}
	public ViewLeadPage_CrossBrowser verifyCoName() {
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}
	public ViewLeadPage_CrossBrowser verifyPageTitle() {
		System.out.println("Title: "+driver.getTitle());
		return this;
	}
	public EditLeadPage_CrossBrowser clickEdit() {
		driver.findElement(By.linkText(prop.getProperty("link_Edit"))).click();
		return new EditLeadPage_CrossBrowser(driver);
	}
	public LeadsPage_CrossBrowser clickDelete() {
		driver.findElement(By.linkText(prop.getProperty("link_Delete"))).click();
		return new LeadsPage_CrossBrowser(driver);
	}
	public DuplicateLeadPage_CrossBrowser clickDuplicate() {
		driver.findElement(By.linkText(prop.getProperty("link_Duplicate_Lead"))).click();
		return new DuplicateLeadPage_CrossBrowser(driver);
	}
}
