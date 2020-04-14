package com.orange.qa.util;

import com.orange.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	// switch to frame method
	public void switchToFrame() {
	driver.switchTo().frame("mainpanel");
	}
	
	// take screenshot when exception occur
	

}
