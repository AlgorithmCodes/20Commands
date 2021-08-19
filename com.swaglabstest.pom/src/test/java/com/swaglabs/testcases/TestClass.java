package com.swaglabs.testcases;

import org.testng.annotations.Test;

import com.swaglabs.base.SwagBase;

public class TestClass extends SwagBase{
	
	public void start() {
		
		initDriver();
		
	}
	@Test
	public void testDemo() {
		System.out.println("Hello");
		
	}
	
	public void tearDown() {
		driver.close();
	}

}
