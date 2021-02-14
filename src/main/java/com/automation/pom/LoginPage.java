package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement passwd;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement submit;

	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
