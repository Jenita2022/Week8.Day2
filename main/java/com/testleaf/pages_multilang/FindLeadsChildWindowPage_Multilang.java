package com.testleaf.pages_multilang;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsChildWindowPage_Multilang extends ProjectSpecificMethods{
		
	public FindLeadsChildWindowPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadsChildWindowPage_Multilang switchtoChildWindow() {
		Set<String> set = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(set);
		driver.switchTo().window(lst.get(1));
		return this;
	}

	public FindLeadsChildWindowPage_Multilang enterFirstLookupFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Cathy");
		return this;
	}

	public FindLeadsChildWindowPage_Multilang clickFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public MergeLeadPage_Multilang clickFirstResulID() {
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		return new MergeLeadPage_Multilang(driver);
	}

	public FindLeadsChildWindowPage_Multilang enterSecondLookupFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SS");
		return this;
	}
	
	public MergeLeadPage_Multilang clickSecondResulID() {
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		return new MergeLeadPage_Multilang(driver);
	}



}
