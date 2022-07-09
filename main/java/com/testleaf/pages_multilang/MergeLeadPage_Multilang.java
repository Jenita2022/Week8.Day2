package com.testleaf.pages_multilang;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.AlertPage;

public class MergeLeadPage_Multilang extends ProjectSpecificMethods{
	
	public MergeLeadPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadsChildWindowPage_Multilang clickFirstLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadsChildWindowPage_Multilang(driver);
	}
	
	public FindLeadsChildWindowPage_Multilang clickSecondLookup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadsChildWindowPage_Multilang(driver);
	}
	
	public MergeLeadPage_Multilang parentWindow() {
//		String parentwin = driver.getWindowHandle();
//		driver.switchTo().window(parentwin);
		Set<String> set = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(set);
		driver.switchTo().window(lst.get(0));
		return this;
	}
	
	public AlertPage_Multilang clickMerge() {
	driver.findElement(By.linkText("Merge")).click();
	return new AlertPage_Multilang(driver);
	}
	

}
