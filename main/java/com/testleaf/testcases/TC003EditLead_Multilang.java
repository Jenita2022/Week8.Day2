package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages_multilang.LoginPage_Multilang;

public class TC003EditLead_Multilang extends ProjectSpecificMethods{

	@BeforeTest
	public void getFile() {
		fileName = "EditLeadData";
	}

	@Test(dataProvider = "fetchdata")
	public void runEditLead(String FName, String UpdatedCoName) throws InterruptedException {

		new LoginPage_Multilang(driver)
		.enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.enterFirstName(FName)
		.clickFindLead()
		.clickFirstResultID()
		.clickEdit().clearCoName()
		.enterCoName(UpdatedCoName)
		.clickUpdate();
	}
}
