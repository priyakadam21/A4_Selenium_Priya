package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath ="//span[contains(@class,'BaseBadge-ba')]")
	private WebElement accountSetting;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOutbtn;

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogOutbtn() {
		return logOutbtn;
	}
	
	

}
