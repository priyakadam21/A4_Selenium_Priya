package Com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.AddressForm_Page;
import com.ShoppersStack_POM.MyAddresses_Page;
import com.ShoppersStack_POM.MyProfile_Page;

public class TC_001_Verify_user_is_able_to_add_address_or_not_Test extends Base_Test{
	
	@Test
	
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException{
		
		homePage.getAccountSetting().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		
		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		myAddressesPage.getAddAddress().click();
		
		AddressForm_Page addressFormPage = new AddressForm_Page(driver);
		addressFormPage.getOfficeBtn().click();
		
		addressFormPage.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addressFormPage.getOfficeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addressFormPage.getStreetTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		addressFormPage.getLandMarkTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByValue(addressFormPage.getCountryDD(), fileUtility.readDataFromPropertyFile("country"));
		webDriverUtility.selectByValue(addressFormPage.getStateDD(), fileUtility.readDataFromPropertyFile("state"));
		webDriverUtility.selectByValue(addressFormPage.getCityDD(), fileUtility.readDataFromPropertyFile("city"));

		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addressFormPage.getAddAddressBtn().click();
		
		Thread.sleep(2000);
		myAddressesPage.getCloseBtn().click();
		
		webDriverUtility.getWebPageScreenShot(driver);

		
	}

}
