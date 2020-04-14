package com.orange.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.qa.base.TestBase;
import com.orange.qa.pages.HomePage;
import com.orange.qa.pages.LoginPage;
import com.orange.qa.pages.RecruitmentPage;

public class RecruitmentPageTest extends TestBase {
	

	LoginPage loginPage;
	HomePage homepage;
	RecruitmentPage recruitmentPage;

	public RecruitmentPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
	    recruitmentPage = new RecruitmentPage();
	    loginPage = new LoginPage();
	    homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	    Thread.sleep(2000);
	   recruitmentPage =  homepage.clickOnRecruitmentLink();
	   Thread.sleep(2000);
	}
	@Test
	public void verifyCandidatesLinkTest() {
		 recruitmentPage.checkBtnclick();
		 Assert.assertTrue(recruitmentPage.checkBtnclick());

		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
