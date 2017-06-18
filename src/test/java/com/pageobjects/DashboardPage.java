package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.setup.ConstantLocators;
import com.setup.GenericMethods;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void swipeLeft() {

	GenericMethods.swipeRight(driver);
	GenericMethods.swipeRight(driver);
	GenericMethods.swipeRight(driver);
	GenericMethods.swipeRight(driver);
	GenericMethods.swipeRight(driver);



	}

	public void enterCredentials(String userName,String password) {

		GenericMethods.input(driver, ConstantLocators.userName, userName);
		GenericMethods.input(driver, ConstantLocators.password, password);
		GenericMethods.clickAndroidBackButton(driver);


	}
	
	public void clickOnLoginAndAgree() {

		GenericMethods.click(driver, ConstantLocators.loginButton);
		GenericMethods.click(driver, ConstantLocators.agreeButton);

	}
	
	public void clickOnSecondShow() {

		
		GenericMethods.click(driver, ConstantLocators.channelButton);
		GenericMethods.waitFor(3000);
		GenericMethods.clickAndroidBackButton(driver);
		GenericMethods.waitFor(3000);
		GenericMethods.scrollDown(driver, ConstantLocators.secondShowText);
		GenericMethods.click(driver, ConstantLocators.secondShow);

	}

	public void checkCharacterCount(int count) {

		//GenericMethods.scrollDownEnd(driver, ConstantLocators.aboutus).isDisplayed();
		GenericMethods.getElementText(driver, ConstantLocators.textDescription);
    Assert.assertTrue(GenericMethods.getElementText(driver, ConstantLocators.textDescription).length()>50);
    
    
	}

	public void setReminderFav() {

		//enericMethods.click(driver, ConstantLocators.navigationOption);
		GenericMethods.click(driver, ConstantLocators.reminderButton);
		GenericMethods.click(driver, ConstantLocators.clockButton);
		GenericMethods.click(driver, ConstantLocators.okButton);
		GenericMethods.clickAndroidBackButton(driver);
		GenericMethods.waitFor(3000);
		GenericMethods.click(driver, ConstantLocators.secondShow);
		GenericMethods.click(driver, ConstantLocators.reminderButton);
		GenericMethods.click(driver, ConstantLocators.favButton);
		GenericMethods.waitFor(5000);

		
	}

	public void checkExactShowAvailable() {

		GenericMethods.clickAndroidBackButton(driver);
		GenericMethods.click(driver, ConstantLocators.favTab);
    Assert.assertEquals(GenericMethods.isElementPresent(driver, ConstantLocators.favShow), true);
    
	}
	
	public void checkShowNotAvailable() {
		//GenericMethods.scrollDown(driver, ConstantLocators.secondShowText);
		GenericMethods.click(driver, ConstantLocators.favShow);
		GenericMethods.click(driver, ConstantLocators.reminderButton);
		GenericMethods.click(driver, ConstantLocators.favButton);
		GenericMethods.waitFor(3000);
		GenericMethods.clickAndroidBackButton(driver);
		GenericMethods.waitFor(5000);
		//GenericMethods.scrollDownEnd(driver, ConstantLocators.aboutus).isDisplayed();
		GenericMethods.click(driver, ConstantLocators.favTab);
    Assert.assertFalse(GenericMethods.isElementPresentWithoutWait(driver, ConstantLocators.favShow));
    	
    	
	}
}
