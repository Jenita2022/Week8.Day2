package com.testleaf.pages_multilang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPage_Multilang extends ProjectSpecificMethods {

	public CreateLeadPage_Multilang(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//OR condition
	@FindAll(
			{
				@FindBy(how = How.ID, using ="createLeadForm_companyName"),
				@FindBy(how = How.NAME, using = "companyName")
			}
			) WebElement eleCoName;
	public CreateLeadPage_Multilang enterCoName(String CoName) {
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CoName);
		eleCoName.sendKeys(CoName);
		return this;
	}

	public CreateLeadPage_Multilang enterFirstName(String Fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		return this;
	}

	public CreateLeadPage_Multilang enterLastName(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;
	}

	@FindBy(how = How.NAME, using = "submitButton") WebElement eleButtonCreateLead;
	public ViewLeadPage_Multilang clickCreateLead() {
		//driver.findElement(By.name("submitButton")).click();
		eleButtonCreateLead.click();
		return new ViewLeadPage_Multilang(driver);
	}
}
