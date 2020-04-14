package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class HomePage extends TestBase{
	
	RecruitmentPage recruitmentpage;
	PerformancePage performancepage;
	
	// page factory - OR:
	@FindBy(linkText="Recruitment")
	WebElement recruitmentLink;
	
	@FindBy(linkText="Performance")
	WebElement performanceLink;
	
//  @FindBy(xpath= "//td[contains(text(),'User:Krishna')]")	
//	WebElement userNameLabel;
	
	// initialise the objects
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions or methods:
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public RecruitmentPage clickOnRecruitmentLink() {
		recruitmentLink.click();
		return new RecruitmentPage();
	}
	public PerformancePage clickOnPerformanceLink() {
		performanceLink.click();
		return new PerformancePage();
	}
//	public boolean verifyCorrectUserName(){
//		return userNameLabel.isDisplayed;
	}


