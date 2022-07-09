package com.testleaf.testcases;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/main/java/com/testleaf/features/EditLead.feature",glue = "com/testleaf/pages", monochrome = true)
public class Runner_EditLead extends ProjectSpecificMethods{

	
}
