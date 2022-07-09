package com.testleaf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.testleaf.utils.ReadExcel_New;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public ChromeDriver driver;	
	public String fileName;

	public static Properties prop1;// to access outside the class
	public static Properties prop;
	
	@BeforeMethod
	public void precondition() throws IOException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//copy same code from readproperties file
		prop = new Properties(); //global variable so removed Properties
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/config.properties"));
		prop.load(fis);
		driver.get(prop.getProperty("url"));//driver.get("http://leaftaps.com/opentaps");
		
		String langFile = prop.getProperty("lang"); // To access the lang specific properties file by passing the variable in file path
		
		prop1 = new Properties(); 
		FileInputStream fis1 = new FileInputStream(new File("./src/main/resources/"+langFile+".properties"));//access lang specific properties file
		prop1.load(fis1);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
