package com.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods{

	//	public MergeLeadPage(ChromeDriver driver) {
	//		this.driver = driver;
	//	}
	//	
	public FindLeadsChildWindowPage clickFirstLookup() {
		getDriver().findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadsChildWindowPage();
	}

	public FindLeadsChildWindowPage clickSecondLookup() throws InterruptedException {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadsChildWindowPage();
	}

	public MergeLeadPage parentWindow() {
		//		String parentwin = driver.getWindowHandle();
		//		driver.switchTo().window(parentwin);
		Set<String> set = getDriver().getWindowHandles();
		List<String> lst = new ArrayList<String>(set);
		getDriver().switchTo().window(lst.get(0));
		return this;
	}

	public AlertPage clickMerge() {
		getDriver().findElement(By.linkText("Merge")).click();
		return new AlertPage();
	}


}
