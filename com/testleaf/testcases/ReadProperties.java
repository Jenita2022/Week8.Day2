package com.testleaf.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(new File("./src/main/resources/config.properties")); //Set the file path
		
		prop.load(fis); //Load the file
		
		String urlPropValue = prop.getProperty("url"); //read the data from properties file
		System.out.println(urlPropValue);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
		//System.out.println(prop.getProperty("lang"));
		System.out.println(prop.getProperty("button_Login"));
		System.out.println(prop.getProperty("link_CRMSFA"));
		System.out.println(prop.getProperty("link_Leads"));

			
	}
}
