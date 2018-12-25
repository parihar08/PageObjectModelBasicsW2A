package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.zoho.com");
//		driver.manage().window().fullscreen();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//We should not be creating straight forward object for business classes like this
		
//		HomePage home = new HomePage();
//		home.goToLogin();
//		
//		LoginPage login = new LoginPage();
//		login.doLogin("trainer@way2automation.com", "Selenium@123");
//		
//		ZohoAppPage zp = new ZohoAppPage();
//		zp.goToCRM();
//		
//		Page.menu.goToAccounts();
//		
//		AccountsPage account = new AccountsPage();
//		account.goToCreateAccount();
//		
//		CreateAccountPage cap = new CreateAccountPage();
//		cap.createAccount("Test");
		
		HomePage home = new HomePage();
		LoginPage login = home.goToLogin();
		ZohoAppPage zp =login.doLogin("trainer@way2automation.com", "Selenium@123");
		zp.goToCRM();
		
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount("Test");

	}

}
