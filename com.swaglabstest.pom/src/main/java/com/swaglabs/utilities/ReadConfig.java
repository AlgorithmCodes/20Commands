package com.swaglabs.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static Properties prop;

	public ReadConfig() {

		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("B:\\gitCommands\\com.swaglabstest.pom\\src\\main\\resources\\properties\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getBrowserName() {

		return prop.getProperty("browser");

	}
	
	public String getStandardUsername() {
		return prop.getProperty("standard_username");
	}
	
	public String getLockedUsername() {
		return prop.getProperty("locked_username");
	}

	
	public String getProblemUsername() {
		return prop.getProperty("problem_username");
	}

	
	public String getPerformanceGlitchUsername() {
		return prop.getProperty("performance_glitch_username");
	}
	
	public String getUniversalPassword() {
		return prop.getProperty("universal_password");
	}
	
	public int getImplicitlyWait() {
		return Integer.parseInt(prop.getProperty("implicitlywait"));
	}
	
	public int getPageLoadoutTime() {
		return Integer.parseInt(prop.getProperty("pageloadouttime"));
	}
	
	
}
