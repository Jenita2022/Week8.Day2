package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;
import com.testleaf.pages.LoginPage_CrossBrowser;

public class TC010_POM_UsingProperties_CrossBrowser_DeleteLead extends ProjectSpecificMethods_CrossBrowser{

	@BeforeTest
	public void getFile() {
		fileName = "DeleteLeadData";
	}
	@Test(dataProvider="fetchdata", priority = 1)
	public void runDeleteLead(String PhoneNo) throws InterruptedException {

		new LoginPage_CrossBrowser(driver).enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneNo()
		.enterPhoneNo(PhoneNo)
		.clickFindLead()
		.clickFirstResultID()
		.clickDelete();
	}

}
