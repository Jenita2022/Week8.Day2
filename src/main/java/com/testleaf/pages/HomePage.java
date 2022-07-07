package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends ProjectSpecificMethods {
//	public HomePage(ChromeDriver driver) {
//		this.driver = driver;
//	}
@When("Click the CRMSFA link")
public MyHomePage clickCRMSFALink(){
	getDriver().findElement(By.linkText("CRM/SFA")).click();
	return new MyHomePage();
}

@Then("Home page should be displayed")
public void verifyHomePage() {
	System.out.println(getDriver().getTitle());
}
}
