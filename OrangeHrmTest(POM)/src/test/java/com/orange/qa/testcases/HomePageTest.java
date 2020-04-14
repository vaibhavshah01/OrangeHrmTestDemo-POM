package com.orange.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.HomePage;
import com.orange.qa.pages.LoginPage;
import com.orange.qa.pages.RecruitmentPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	RecruitmentPage recruitmentPage;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	    loginPage = new LoginPage();
	    recruitmentPage = new RecruitmentPage();
	    homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "OrangeHRM", "Home page title not matched");
	}
	@Test(priority=2)
	public void verifyRecruitmentLinkTest() {
		recruitmentPage = homepage.clickOnRecruitmentLink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
