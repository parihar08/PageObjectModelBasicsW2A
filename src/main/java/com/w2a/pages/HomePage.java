package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page {

//	WebDriver driver;
//	
//	public HomePage(WebDriver driver){
//		this.driver = driver;
//	}
	
	public void goToSignUp() {
//		driver.findElement(By.cssSelector(".zh-signup")).click();
		click("signUp_CSS");
	}

//	public void goToLogin() {
//		driver.findElement(By.cssSelector(".zh-login")).click();
//	}
	
	public LoginPage goToLogin() {
//		driver.findElement(By.cssSelector(".zh-login")).click();
		click("login_CSS");
		return new LoginPage();
	}

	public void goToSupport() {
//		driver.findElement(By.cssSelector(".zh-support")).click();
		click("support_CSS");
	}

	public void goToCustomers() {
//		driver.findElement(By.cssSelector(".zh-customers")).click();
		click("customers_CSS");
	}

	public void goToContactSales() {
//		driver.findElement(By.cssSelector(".zh-contact")).click();
		click("contact_CSS");
	}

}
