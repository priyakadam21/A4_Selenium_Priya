package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddresses_Page {

	public MyAddresses_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddress;

	@FindBy(xpath = "(//span[contains(@class,'MuiButton-start')])[2]")
	private WebElement deleteBtn;

	@FindBy(xpath = "//button[text()='Yes'][1]")
	private WebElement yesBtn;

	@FindBy(xpath = "//button[contains(@class,'Toastify__close-button')]")
	private WebElement closeBtn;

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}

}
