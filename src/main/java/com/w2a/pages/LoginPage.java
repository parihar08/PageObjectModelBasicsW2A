package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
//	WebDriver driver;
//	
//	public LoginPage(WebDriver driver){
//		
//		this.driver= driver;
//	}
	
//	public void doLogin(String username, String password){
//		driver.findElement(By.cssSelector("#lid")).sendKeys(username);
//		driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
//		driver.findElement(By.cssSelector("#signin_submit")).click();
//	
//	}
	
	public ZohoAppPage doLogin(String username, String password){
//		driver.findElement(By.cssSelector("#lid")).sendKeys(username);
//		driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
//		driver.findElement(By.cssSelector("#signin_submit")).click();
		type("username_CSS",username);
		type("password_CSS",password);
		click("submit_CSS");
		return new ZohoAppPage();
	}
	
	public void signUpLink(){
		
	}

}
