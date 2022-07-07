package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
//	
//	public EditLeadPage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	public EditLeadPage clearCoName() {
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	
	public EditLeadPage enterCoName(String UpdatedCoName) {
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(UpdatedCoName);
		return this;
	}

	public EditLeadPage clickUpdate() {
		getDriver().findElement(By.xpath("//input[@value='Update']")).click();
		return new EditLeadPage();
	}
}
