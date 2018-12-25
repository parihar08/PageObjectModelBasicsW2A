package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	/*
	 * TopMenu ISA Page ?? No
	 * HomePage HASA TopMenu
	 * AccountsPage HASA TopMenu
	 * Page HASA TopMenu
	 * 
	 * ISA relation means > Inheritance - extended the common parent page in other page classes
	 * HASA relationship means > Encapsulation takes place. 
	 * Means TopMenu class will be encapsulated in all the pages class wherever we have this common functionality access 
	 */
	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		this.driver = driver;
		
	}
	public void goToHome() {

	}

	public void goToFeeds() {

	}

	public void goToLeads() {

	}

//	public void goToAccounts() {
//				
//		driver.findElement(By.xpath("//*[@id='menuContent']/crm-tab/div/div/lyte-yield[4]/div/a")).click();
//	}
	
	public AccountsPage goToAccounts() {
		
		//driver.findElement(By.xpath("//*[@id='menuContent']/crm-tab/div/div/lyte-yield[4]/div/a")).click();
		Page.click("goToAccounts_XPATH");
		return new AccountsPage();
	}

	public void goToContacts() {

	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}

	public void SignOut() {

	}

}
