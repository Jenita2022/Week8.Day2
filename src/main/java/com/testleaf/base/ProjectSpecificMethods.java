package com.testleaf.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.testleaf.utils.ReadExcel_New;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests {
	

	//public static ChromeDriver driver; Treadlocal gives the session id now so no need of this stt.
	private static final ThreadLocal<ChromeDriver> tldriver = new ThreadLocal<ChromeDriver>(); // indepedant session id for each thread(exe)
	//To access private variable outside the class - use encapsulation - setters and getters methods	
	public void setDriver(ChromeDriver driver) {
			tldriver.set(driver);
		}
	public ChromeDriver getDriver() {
		return tldriver.get();
	}
	
	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//tldriver.set(new ChromeDriver()); //setting tldriver value to chromedriver
		setDriver(new ChromeDriver()); //calling setDriver method as tldriver.set(new ChromeDriver()) is in the method
		//driver.get("http://leaftaps.com/opentaps");
		//tldriver.get().get("http://leaftaps.com/opentaps");
		getDriver().get("http://leaftaps.com/opentaps");
		//driver.manage().window().maximize();
		//tldriver.get().manage().window().maximize();
		getDriver().manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//tldriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postcondition() {
		getDriver().close();
	}


}
