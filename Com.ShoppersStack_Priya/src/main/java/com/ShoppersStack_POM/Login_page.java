package com.ShoppersStack_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	private WebElement emailfield;
	
	@FindBy(id="Password")
	private WebElement paaswordField;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginBtn;
	

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPaaswordField() {
		return paaswordField;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}