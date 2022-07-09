package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
//Cucumber supports only default constructor. So remove the own constructor. 
//So,to do parallel exe in Cucumber, create ThreadLocal which helps to have independant thread for each thread.
	
//	public HomePage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	@Given("Enter the username {string}")
	public LoginPage enterUserName(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username); //access getDriver()
		return this;
	}
	@Given("Enter the password {string}")
	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);//access getDriver()
		return this;
	}
	@When("Click the Login button")
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click(); //access getDriver()
		return new HomePage();

	} 

}
