package com.swaglabs.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	public static Properties prop;
	public ReadConfig() {
		
		 prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("B:\\gitCommands\\com.swaglabstest.pom\\src\\main\\resources\\properties\\config.properties");
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
	

}
