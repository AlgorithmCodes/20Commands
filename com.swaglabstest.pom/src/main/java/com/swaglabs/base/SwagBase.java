package com.swaglabs.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagBase {
	
	public static WebDriver driver;
	public void initDriver() {
		String browser="chrome";
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		}else if(browser.endsWith("ff")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid browsername");
		}
		
	}

}
