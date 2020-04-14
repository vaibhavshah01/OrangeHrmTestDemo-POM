package com.orange.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// page factory - OR:
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement login;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgot_your_password_link;
	
	// initialisation the page object
	public LoginPage() { // constructor
		PageFactory.initElements(driver,this); // to initialise the WebElements we use this method from PageFactory class
	}
	// Actions
   public String validateLoginPageTitle() {// validate page title
	return driver.getTitle();
	}
   public boolean validateForgotPasswordLink() {
    return forgot_your_password_link.isDisplayed();
   }
   public HomePage login(String un, String pwd) {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   login.click();
	   
	   return new HomePage();
   }  
  
}
   
