package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data){
		//Adding a comment
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		//ZohoAppPage zp =login.doLogin("trainer@way2automation.com", "Selenium@123");
		login.doLogin(data.get("username"), data.get("password"));
		Assert.fail("Login Test Failed");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
