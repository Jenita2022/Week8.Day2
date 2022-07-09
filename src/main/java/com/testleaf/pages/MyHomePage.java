package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethods{
	

//	public MyHomePage(ChromeDriver driver) {
//		this.driver = driver;
//	}
//	
	@When("Click the 'Leads' link")
	public LeadsPage clickLeadsLink() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}

	@Then("'My Home' page should be displayed")
	public void verifyMyHome() {
		System.out.println(getDriver().getTitle());
	}
}
