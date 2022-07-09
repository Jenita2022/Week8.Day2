package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages_multilang.LoginPage_Multilang;

public class TC002CreateLead_Multilang extends ProjectSpecificMethods{

	@BeforeTest
	public void getFile() {
		fileName = "CreateLeadData";
	}

	@Test(dataProvider="fetchdata")
	public void runCreateLead(String CoName, String Fname, String Lname) {
		new LoginPage_Multilang(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink().clickLeadsLink().clickCreateLeadLink()
		.enterCoName(CoName)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickCreateLead();
	}

}
