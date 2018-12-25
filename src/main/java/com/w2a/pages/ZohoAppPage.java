package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

//	WebDriver driver;
//	
//	public ZohoAppPage(WebDriver driver){
//		this.driver = driver;
//	}
	public void goToCalender() {
//		driver.findElement(By.cssSelector(".zicon-apps-calendar.zicon-apps-96")).click();
		click("calender_CSS");
	}

	public void goToCliq() {
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();
		click("cliq_CSS");
	}

//	public void goToConnect() {
//		driver.findElement(By.cssSelector(".zicon-apps-connect.zicon-apps-96")).click();
//	}
	
	public CRMHomePage goToConnect() {
//		driver.findElement(By.cssSelector(".zicon-apps-connect.zicon-apps-96")).click();
		click("connect_CSS");
		return new CRMHomePage();
	}

	public void goToCRM() {
//		driver.findElement(By.cssSelector(".zicon-apps-crm.zicon-apps-96")).click();
		click("crm_CSS");
	}

	public void goToDesk() {
//		driver.findElement(By.cssSelector(".zicon-apps-support.zicon-apps-96")).click();
		click("desk_CSS");
	}

	public void goToMail() {
//		driver.findElement(By.cssSelector(".zicon-apps-mail.zicon-apps-96")).click();
		click("mail_CSS");
	}

	public void goToPageSense() {
//		driver.findElement(By.cssSelector(".zicon-apps-pagesense.zicon-apps-96")).click();
		click("pagesense_CSS");
	}

	public void goToPeople() {
//		driver.findElement(By.cssSelector(".zicon-apps-people.zicon-apps-96")).click();
		click("people_CSS");
	}

	public void goToSalesIQ() {
//		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		click("salesiq_CSS");
	}

}
