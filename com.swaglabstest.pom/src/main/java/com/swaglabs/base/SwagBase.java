package com.swaglabs.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.swaglabs.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagBase {

	public static WebDriver driver;
	public static ReadConfig readConfig;
	public static Logger log;
	public static final int implicitWait=readConfig.getImplicitlyWait();
	public static final int pageLoadOutTime=readConfig.getPageLoadoutTime();
	public static void initDriver() {
		log=Logger.getLogger("SwagApplication");
		Properties logProp=new Properties();
		try {
			logProp.load(new FileInputStream("log.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		PropertyConfigurator.configure(logProp);
		
		
		readConfig=new ReadConfig();
		log.debug("ReadConfig is initiated");
		String browser = readConfig.getBrowserName();
		log.info(browser+" initiated successfully");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.debug("Browser launched successfully");
		} else if (browser.endsWith("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.debug("Browser launched successfully");
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			log.debug("Browser launched successfully");
		} else {
			System.out.println("Invalid browser name");
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageLoadOutTime, TimeUnit.SECONDS);

	}
	
	public static void tearDown() {
		
		driver.close();
		log.debug("Browser terminated successfully");
	}
	

}
