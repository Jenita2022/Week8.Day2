package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;
import com.testleaf.pages.LoginPage_CrossBrowser;

public class TC011_POM_UsingProperties_CrossBrowser_ExcelData_DuplicateLead extends ProjectSpecificMethods_CrossBrowser{
	@BeforeTest
	public void getFile() {
		fileName = "DuplicateLeadData";
	}

	@Test(dataProvider = "fetchdata")
	public void runDuplicateLead(String Email) throws InterruptedException {
		new LoginPage_CrossBrowser(driver).enterUserName().enterPassword().clickLogin()
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
