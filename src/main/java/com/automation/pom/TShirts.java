package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirts {
	public static WebDriver driver;

	@FindBy(xpath="//a[text()='Women']")
	private WebElement womenicon;
	
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirtss;
	
	public TShirts(WebDriver ldriver) {
	this.driver=ldriver;	
    PageFactory.initElements(driver,this);
	}

	public WebElement getWomenicon() {
		return womenicon;
	}

	public WebElement getTshirtss() {
		return tshirtss;
	}

	public void setTshirtss(WebElement tshirtss) {
		this.tshirtss = tshirtss;
	}

	
	
}
