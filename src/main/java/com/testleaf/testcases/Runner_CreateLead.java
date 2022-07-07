package com.testleaf.testcases;

import org.testng.annotations.DataProvider;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/com/testleaf/features/CreateLead.feature", glue ="com/testleaf/pages", monochrome = true)
public class Runner_CreateLead extends ProjectSpecificMethods{
		@Override
		@DataProvider(parallel = true) //parallel exec of multiple data. This should work only if we have ThreadLocal
		public Object[][] scenarios() {
			return super.scenarios(); //execute the same codelines in scenarios() method. so super.scenarios()
			}
	}
