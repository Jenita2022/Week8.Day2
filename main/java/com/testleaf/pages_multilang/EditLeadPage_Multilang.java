package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class EditLeadPage_Multilang extends ProjectSpecificMethods{
	
	public EditLeadPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage_Multilang clearCoName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	
	public EditLeadPage_Multilang enterCoName(String UpdatedCoName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(UpdatedCoName);
		return this;
	}

	public EditLeadPage_Multilang clickUpdate() {
		driver.findElement(By.xpath(prop1.getProperty("button_Update"))).click();
		return new EditLeadPage_Multilang(driver);
	}
}
