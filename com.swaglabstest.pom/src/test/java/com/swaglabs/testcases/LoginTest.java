package com.swaglabs.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.swaglabs.base.SwagBase;
import com.swaglabs.pages.LoginPage;

public class LoginTest extends SwagBase {

	@BeforeMethod
	public void init() {
		initDriver();
	}

	@Test
	public void loginAsStandardUser() {

		LoginPage loginPage = new LoginPage();
		String actualTitle = loginPage.getTitle();
		Assert.assertEquals("Swag Labs", actualTitle);
		loginPage.userLogin(readConfig.getStandardUsername(), readConfig.getUniversalPassword());
		
	}
	
	@Test
	public void loginAsLockedUser() {

		LoginPage loginPage = new LoginPage();
		String actualTitle = loginPage.getTitle();
		Assert.assertEquals("Swag Labs", actualTitle);
		loginPage.userLogin(readConfig.getLockedUsername(), readConfig.getUniversalPassword());
		
	}
	
	@Test
	public void loginAsProblemUser() {

		LoginPage loginPage = new LoginPage();
		String actualTitle = loginPage.getTitle();
		Assert.assertEquals("Swag Labs", actualTitle);
		loginPage.userLogin(readConfig.getProblemUsername(), readConfig.getUniversalPassword());
		
	}
	
	@Test
	public void loginAsPerformanceGlitchUser() {

		LoginPage loginPage = new LoginPage();
		String actualTitle = loginPage.getTitle();
		Assert.assertEquals("Swag Labs", actualTitle);
		loginPage.userLogin(readConfig.getPerformanceGlitchUsername(), readConfig.getUniversalPassword());
		
	}
	
	

	@AfterMethod
	public void closeDriver() {
		tearDown();
	}

}
