package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LeadsPage;

public class ViewLeadPage_Multilang extends ProjectSpecificMethods{

	public ViewLeadPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage_Multilang verifyFirstName() {
		System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}

	public EditLeadPage_Multilang clickEdit() {
		driver.findElement(By.linkText(prop1.getProperty("link_Edit"))).click();
		return new EditLeadPage_Multilang(driver);
	}

	public LeadsPage_Multilang clickDelete() {
		driver.findElement(By.linkText(prop1.getProperty("link_Delete"))).click();
		return new LeadsPage_Multilang(driver);
	}

	public DuplicateLeadPage_Multilang clickDuplicate() {
		driver.findElement(By.linkText(prop1.getProperty("link_Duplicate"))).click();
		return new DuplicateLeadPage_Multilang(driver);
	}

	public ViewLeadPage_Multilang verifyCoName() {
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}

	public ViewLeadPage_Multilang verifyPageTitle() {
		System.out.println("Title: "+driver.getTitle());
		return this;
	}


}
