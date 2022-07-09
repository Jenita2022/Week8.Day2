package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class FindLeadPage_CrossBrwoser extends ProjectSpecificMethods_CrossBrowser{

	public FindLeadPage_CrossBrwoser(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public FindLeadPage_CrossBrwoser enterFirstName(String FName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(FName);
		return this;
	}
	
	public FindLeadPage_CrossBrwoser clickPhoneNo() {
		driver.findElement(By.xpath(prop.getProperty("tab_Phone"))).click();
		return this;
	}
	public FindLeadPage_CrossBrwoser enterPhoneNo(String PhoneNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNo);
		return this;
	}
	
	public FindLeadPage_CrossBrwoser clickEmail() {
		driver.findElement(By.xpath(prop.getProperty("tab_Email"))).click();
		return this;
	}
	public FindLeadPage_CrossBrwoser enterEmail(String Email) {
		driver.findElement(By.name("emailAddress")).sendKeys(Email);
		return this;
	}
	
	public FindLeadPage_CrossBrwoser clickFindLead() {
		driver.findElement(By.xpath(prop.getProperty("button_FindLeads"))).click();
		return this;
	}

	public ViewLeadPage_CrossBrowser clickFirstResultID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage_CrossBrowser(driver);
	}
}
