package com.testleaf.testcases;

import org.testng.annotations.DataProvider;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

//parallel TC exe - Login and CreateLead TC

@CucumberOptions(features = "src/main/java/com/testleaf/features", glue ="com/testleaf/pages", monochrome = true)
public class Runner_Login_ParallelTCExe extends ProjectSpecificMethods {
	@Override
	@DataProvider(parallel = true) 
	public Object[][] scenarios() {
		return super.scenarios();
	}
}




