package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadsPage extends ProjectSpecificMethods {
	
private static final String string = null;
//	public LeadsPage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	@When("Click the 'Create Lead' link")
	public CreateLeadPage clickCreateLeadLink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLeadsLink() {
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
public MergeLeadPage clickMergeLeadLink() {
	getDriver().findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}
@Then("'Leads' page should be displayed")
public void verifyLeadsPage() {
	System.out.println(getDriver().getTitle());
}

}
