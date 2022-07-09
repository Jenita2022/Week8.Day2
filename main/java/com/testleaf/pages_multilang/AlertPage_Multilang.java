package com.testleaf.pages_multilang;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.ViewLeadPage;

public class AlertPage_Multilang extends ProjectSpecificMethods{
	
	public AlertPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new ViewLeadPage(driver);
	}
	

}
