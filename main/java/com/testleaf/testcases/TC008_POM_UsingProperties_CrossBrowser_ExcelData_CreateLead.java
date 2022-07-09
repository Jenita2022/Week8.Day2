package com.testleaf.testcases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;
import com.testleaf.pages.LoginPage_CrossBrowser;
import com.testleaf.pages_multilang.LoginPage_Multilang;

public class TC008_POM_UsingProperties_CrossBrowser_ExcelData_CreateLead extends ProjectSpecificMethods_CrossBrowser{

	@BeforeTest
	public void getFile() {
		fileName = "CreateLeadData";
	}

	@Test(dataProvider="fetchdata")
	public void runCreateLead(String CoName, String Fname, String Lname) {
		new LoginPage_CrossBrowser(driver)
		.enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCoName(CoName)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickCreateLead()
		.verifyCoName()
		.verifyFirstName()
		.verifyLastName();

	}
}
