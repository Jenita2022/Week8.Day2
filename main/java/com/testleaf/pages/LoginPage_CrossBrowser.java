package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class LoginPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{
	public LoginPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "username") WebElement eleUName;
	public LoginPage_CrossBrowser enterUserName() {
		//driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		eleUName.sendKeys(prop.getProperty("username"));
		return this;
	}

	@FindBy(how = How.ID, using = "password") WebElement elePwd;
	public LoginPage_CrossBrowser enterPassword() {
		//driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		elePwd.sendKeys(prop.getProperty("password"));
		return this;
	}

	public HomePage_CrossBrowser clickLogin() {
		driver.findElement(By.className(prop.getProperty("button_Login"))).click();
		return new HomePage_CrossBrowser(driver);

	}

}
