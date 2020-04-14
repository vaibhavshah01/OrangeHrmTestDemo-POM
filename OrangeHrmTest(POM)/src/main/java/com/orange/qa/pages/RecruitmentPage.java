package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class RecruitmentPage extends TestBase{
	
	// page factory - OR
	
	@FindBy(xpath = "//input[@id=\"btnSrch\"]")
	WebElement searchBtnLink;
	
	@FindBy (xpath = "//input[@name=\"chkSelectAll\"]")
	WebElement checkBoxBtn;
	
	public RecruitmentPage() {
		super();
	}
	
	// initialise the objects
	
		public void RecriutmentPage() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifySearchBtnLink() {
			return searchBtnLink.isDisplayed();
		}
		
		public boolean checkBtnclick() {
			 return checkBoxBtn.isDisplayed();
		}
	
}
