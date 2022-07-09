package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LeadsPage;

public class MyHomePage_Multilang extends ProjectSpecificMethods{

	public MyHomePage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}

	public LeadsPage_Multilang clickLeadsLink() {
		driver.findElement(By.linkText(prop1.getProperty("link_Leads"))).click();
		return new LeadsPage_Multilang(driver);
	}

}
