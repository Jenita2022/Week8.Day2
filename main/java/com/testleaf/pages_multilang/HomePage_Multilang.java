package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.MyHomePage;

public class HomePage_Multilang extends ProjectSpecificMethods {

	public HomePage_Multilang(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyHomePage_Multilang clickCRMSFALink(){
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage_Multilang(driver);
	}
}
