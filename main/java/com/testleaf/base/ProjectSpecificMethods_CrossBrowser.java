package com.testleaf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.testleaf.utils.ReadExcel_New;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods_CrossBrowser {

	public String fileName;
	//public ChromeDriver driver;
	public RemoteWebDriver driver;	
	public static Properties prop;

	@Parameters("browser")
	@BeforeMethod
	public void precondition(String browser) throws IOException {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		//
		//		driver.get("http://leaftaps.com/opentaps");
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	}

		//	@BeforeMethod
		//public void precondition(String browser) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream (new File("./src/main/resources/config.properties"));
		prop.load(fis);
		//String browserProp = prop.getProperty("browser");

		//		if(browserProp.equalsIgnoreCase("Chrome")) {
		//			WebDriverManager.chromedriver().setup();
		//			driver = new ChromeDriver();
		//		}
		//		else if(browserProp.equalsIgnoreCase("Edge")) {
		//			WebDriverManager.edgedriver().setup();
		//			driver = new EdgeDriver();
		//		}

		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String urlProp = prop.getProperty("url");
		driver.get(urlProp);
	}

	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	@DataProvider
	public String[][] fetchdata() throws IOException{
		String[][] readData = ReadExcel_New.readData(fileName);
		return readData;
	}

}
