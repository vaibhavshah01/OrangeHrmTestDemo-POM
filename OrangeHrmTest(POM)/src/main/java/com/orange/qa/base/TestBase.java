package com.orange.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orange.qa.util.TestUtil;

public class TestBase {
	
	// global static variables which we can use through the program
 public static WebDriver driver;
 public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\OrangeHrmTest(POM)\\src\\main\\java\\com\\orange\\qa\\config\\config.properties");
			prop.load(fip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser"); // Initialise the browser
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe\\");
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize(); // maximise window
		driver.manage().deleteAllCookies(); // delete all cookies
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);// page load timeout change ctrl+mouseover
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS); // implicit wait from TestUtil class
		
		driver.get(prop.getProperty("url"));//launch URL
		
	}
}
