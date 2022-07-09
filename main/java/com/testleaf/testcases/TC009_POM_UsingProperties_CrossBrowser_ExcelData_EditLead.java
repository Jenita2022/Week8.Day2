package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;
import com.testleaf.pages.LoginPage_CrossBrowser;

public class TC009_POM_UsingProperties_CrossBrowser_ExcelData_EditLead extends ProjectSpecificMethods_CrossBrowser{

	@BeforeTest
	public void getFile() {
		fileName = "EditLeadData";
	}

	@Test(dataProvider = "fetchdata", priority = -1)
	public void runEditLead(String FName, String UpdatedCoName) throws InterruptedException {
		new LoginPage_CrossBrowser(driver).enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.enterFirstName(FName)
		.clickFindLead()
		.clickFirstResultID()
		.clickEdit()
		.clearCoName()
		.enterCoName(UpdatedCoName)
		.clickUpdate();
		
	}
}
