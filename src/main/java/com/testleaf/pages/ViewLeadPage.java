package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewLeadPage extends ProjectSpecificMethods{

	//	public ViewLeadPage(ChromeDriver driver) {
	//		this.driver = driver;
	//	}

	public ViewLeadPage verifyFirstName() {
		System.out.println(getDriver().findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}

	@When("Click the 'Edit' link")
	public EditLeadPage clickEdit() {
		getDriver().findElement(By.linkText("Edit")).click();
		return new EditLeadPage();
	}

	public LeadsPage clickDelete() {
		getDriver().findElement(By.linkText("Delete")).click();
		return new LeadsPage();
	}

	public DuplicateLeadPage clickDuplicate() {
		getDriver().findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
	}
	@Then("Verify the Company Name and ID")
	public ViewLeadPage verifyCoName() {
		System.out.println(getDriver().findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}
	@Then("The 'View Lead' page should be displayed")
	public ViewLeadPage verifyPageTitle() {
		System.out.println("Title: "+getDriver().getTitle());
		return this;
	}


}
