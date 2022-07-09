package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class MyHomePage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{
	public MyHomePage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public LeadsPage_CrossBrowser clickLeadsLink() {
		driver.findElement(By.linkText(prop.getProperty("link_Leads"))).click();
		return new LeadsPage_CrossBrowser(driver);
	}

}
