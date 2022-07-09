package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadPage_Multilang extends ProjectSpecificMethods{

	public FindLeadPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadPage_Multilang enterFirstName(String FName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(FName);
		return this;
	}
	
	public FindLeadPage_Multilang clickPhoneNo() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadPage_Multilang enterPhoneNo(String PhoneNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNo);
		return this;
	}
	
	public FindLeadPage_Multilang clickEmail() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}
	public FindLeadPage_Multilang enterEmail(String Email) {
		driver.findElement(By.name("emailAddress")).sendKeys(Email);
		return this;
	}
	
	public FindLeadPage_Multilang clickFindLead() {
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath(prop1.getProperty("button_FindLeads"))).click();
		
		return this;
	}

	public ViewLeadPage_Multilang clickFirstResultID() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage_Multilang(driver);
	}
}
