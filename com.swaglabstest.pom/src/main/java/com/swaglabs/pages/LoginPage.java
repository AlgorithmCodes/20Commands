package com.swaglabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.base.SwagBase;

public class LoginPage extends SwagBase {
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement btnLogin;
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void userLogin(String userName,String pass) {
		username.sendKeys(userName);
		password.sendKeys(pass);
		btnLogin.click();
	}
}
