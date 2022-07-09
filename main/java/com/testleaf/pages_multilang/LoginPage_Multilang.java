package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.HomePage;

public class LoginPage_Multilang extends ProjectSpecificMethods{

	public LoginPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how = How.ID, using = "username") WebElement eleUserName;
	public LoginPage_Multilang enterUserName() {
		//driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		eleUserName.sendKeys(prop.getProperty("username"));
		return this;
	}

	@CacheLookup
	@FindBy(how = How.ID, using = "password") WebElement elePassword;
	public LoginPage_Multilang enterPassword() {
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		elePassword.sendKeys(prop.getProperty("password"));
		return this;
	}
	
	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using ="decorativeSubmit") WebElement eleLogin;
	public HomePage_Multilang clickLogin() {
		//driver.findElement(By.className("decorativeSubmit")).click();
		eleLogin.click();
		return new HomePage_Multilang(driver);

	}

}
