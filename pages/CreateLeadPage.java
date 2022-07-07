package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethods {

	//	public CreateLeadPage(ChromeDriver driver) {
	//		this.driver = driver;
	//	}

	@When("Enter the Company name {string}")
	public CreateLeadPage enterCoName(String CoName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(CoName);
		return this;
	}

	@When("Enter the First name {string}")
	public CreateLeadPage enterFirstName(String Fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		return this;
	}
	@When("Enter the Last name {string}")
	public CreateLeadPage enterLastName(String Lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;
	}
	@When("Click the Create Lead button")
	public ViewLeadPage clickCreateLead() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

	@Then("'Create Lead' page should be displayed")
	public void verifyLeadsPage() {
		System.out.println(getDriver().getTitle());
	}
}
