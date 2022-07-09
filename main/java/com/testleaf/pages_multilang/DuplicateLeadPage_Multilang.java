package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.ViewLeadPage;

public class DuplicateLeadPage_Multilang extends ProjectSpecificMethods{
	
	public DuplicateLeadPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage_Multilang clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage_Multilang(driver);
	}
	
}
