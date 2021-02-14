package com.automation.baseclass;

import org.openqa.selenium.WebDriver;

import com.automation.pom.LoginPage;
import com.automation.pom.SignInPage;
import com.automation.pom.TShirts;

public class AutomationPractice extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args)throws Exception {
		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		SignInPage sp=new SignInPage(driver);
		
		clickOnElements(sp.getLogin());
		LoginPage lp=new LoginPage(driver);
		inputToElements(lp.getEmail(), "karthikayan1992@gmail.com");
		inputToElements(lp.getPasswd(), "Gold@K");
		clickOnElements(lp.getSubmit());
		TShirts ts=new TShirts(driver);	
		mouseHover(ts.getWomenicon());
		mouseHover(ts.getTshirtss());
		clickOnElements(ts.getTshirtss());
		
		
				}

}
