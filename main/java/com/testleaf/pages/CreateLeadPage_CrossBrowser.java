package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class CreateLeadPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser {
	
	public CreateLeadPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage_CrossBrowser enterCoName(String CoName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CoName);
		return this;
	}

	public CreateLeadPage_CrossBrowser enterFirstName(String Fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		return this;
	}

	public CreateLeadPage_CrossBrowser enterLastName(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;
	}

	public ViewLeadPage_CrossBrowser clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage_CrossBrowser(driver);
	}
}
