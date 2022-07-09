package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadPage extends ProjectSpecificMethods{
	//	
	//	public EditLeadPage(ChromeDriver driver) {
	//		this.driver = driver;
	//	}
	@Then("The 'Edit Lead' page should be displayed")
	public void verifyPgTitle() {
		System.out.println(getDriver().getTitle());
	}
	@Then("Clear the Company Name")
	public EditLeadPage clearCoName() {
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	@When("Enter the new Company name {string}")	
	public EditLeadPage enterCoName(String UpdatedCoName) {
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(UpdatedCoName);
		return this;
	}
	@When("Click the Update button")
	public EditLeadPage clickUpdate() {
		getDriver().findElement(By.xpath("//input[@value='Update']")).click();
		return new EditLeadPage();
	}
}
