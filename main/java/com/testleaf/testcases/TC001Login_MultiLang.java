package com.testleaf.testcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;
import com.testleaf.pages_multilang.LoginPage_Multilang;

public class TC001Login_MultiLang extends ProjectSpecificMethods{

	@Test
	public void runLogin() {
		new LoginPage_Multilang(driver).enterUserName()
		.enterPassword()
		.clickLogin();
	}

}
