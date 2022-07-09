package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class HomePage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{
	public HomePage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//OR condition
	@CacheLookup
	@FindAll(
			{
				@FindBy(how = How.LINK_TEXT, using ="CRM/SFA"),
				@FindBy(how = How.XPATH, using ="//div[@class='crmsfa']//a)[2]")
			}
			)WebElement eleCRMSFA;
	public MyHomePage_CrossBrowser clickCRMSFALink(){
		//driver.findElement(By.linkText("CRM/SFA"));
		//driver.findElement(By.linkText(prop.getProperty("link_CRMSFA"))).click();
		//driver.findElement(By.xpath("//div[@class='crmsfa']//a)[2]")).click();
		eleCRMSFA.click();
		return new MyHomePage_CrossBrowser(driver);
	}
	
//AND condition
	@CacheLookup
	@FindBys(
			{
				@FindBy(how = How.CLASS_NAME, using ="decorativeSubmit"),
				@FindBy(how = How.XPATH, using ="//input[@type='submit']")
			}
			) WebElement eleLogout;
	public LoginPage_CrossBrowser clickLogoutLink(){
		//driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		eleLogout.click();

		return new LoginPage_CrossBrowser(driver);
	}


}
