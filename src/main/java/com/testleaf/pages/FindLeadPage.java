package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
//
//	public FindLeadPage(ChromeDriver driver) {
//		this.driver = driver;
//	}

	public FindLeadPage enterFirstName(String FName) {
		getDriver().findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(FName);
		return this;
	}
	
	public FindLeadPage clickPhoneNo() {
		getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadPage enterPhoneNo(String PhoneNo) {
		getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNo);
		return this;
	}
	
	public FindLeadPage clickEmail() {
		getDriver().findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}
	public FindLeadPage enterEmail(String Email) {
		getDriver().findElement(By.name("emailAddress")).sendKeys(Email);
		return this;
	}
	
	public FindLeadPage clickFindLead() {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public ViewLeadPage clickFirstResultID() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage();
	}
}