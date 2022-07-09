package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages_multilang.LoginPage_Multilang;

public class TC005DuplicateLead_Multilang extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getFile() {
		fileName="DuplicateLeadData";
	}

	@Test(dataProvider = "fetchdata")
	public void runDuplicateLead(String Email) throws InterruptedException {
		
		new LoginPage_Multilang(driver)
		.enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickEmail()
		.enterEmail(Email)
		.clickFindLead()
		.clickFirstResultID()
		.clickDuplicate()
		.clickCreateLead();
	}
}
