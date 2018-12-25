package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{

//	public CreateAccountPage goToCreateAccount() {
//		driver.findElement(By.cssSelector(".newwhitebtn.customPlusBtn")).click();
//		return new CreateAccountPage();
//
//	}
	
//	public void goToCreateAccount() {
//		driver.findElement(By.xpath("//*[@id='topRightIcons']/span[1]/link-to/button")).click();
//
//	}
	
	public CreateAccountPage goToCreateAccount() {
//		driver.findElement(By.xpath("//*[@id='topRightIcons']/span[1]/link-to/button")).click();
		click("createAccount_XPATH");
		return new CreateAccountPage();
	}

	public void goToImportAccount() {

	}

}
