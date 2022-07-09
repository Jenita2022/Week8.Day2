package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.CreateLeadPage;
import com.testleaf.pages.EditLeadPage;
import com.testleaf.pages.FindLeadPage;
import com.testleaf.pages.MergeLeadPage;

public class LeadsPage_Multilang extends ProjectSpecificMethods {

	public LeadsPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage_Multilang clickCreateLeadLink() {
		driver.findElement(By.linkText(prop1.getProperty("link_Create_Lead"))).click();
		return new CreateLeadPage_Multilang(driver);
	}

	public FindLeadPage_Multilang clickFindLeadsLink() {
		driver.findElement(By.linkText(prop1.getProperty("link_Find_Leads"))).click();
		return new FindLeadPage_Multilang(driver);
	}
	public MergeLeadPage clickMergeLeadLink() {
		driver.findElement(By.linkText(prop1.getProperty("link_Merge_Leads"))).click();
		return new MergeLeadPage(driver);
	}


}
