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

	public void clickOnMenu() {

		GenericMethods.click(driver, ConstantLocators.crossoption);
		GenericMethods.click(driver, ConstantLocators.navigationOption);

	}

	public DashboardPage checkMenuOptions() {

		GenericMethods.scrollDownEnd(driver, ConstantLocators.aboutus).isDisplayed();
		GenericMethods.clickAndroidBackButton(driver);
		return this;
	}

	public DashboardPage checkLoginOption(String userName, String password) {

		GenericMethods.click(driver, ConstantLocators.navigationOption);
		GenericMethods.scrollDownEnd(driver, ConstantLocators.login).click();
		GenericMethods.click(driver, ConstantLocators.loginbutton);
		GenericMethods.input(driver, ConstantLocators.email, userName);
		GenericMethods.input(driver, ConstantLocators.password, password);
		GenericMethods.clickAndroidBackButton(driver);
		GenericMethods.click(driver, ConstantLocators.loginbutton1);
		GenericMethods.waitFor(5000);
		GenericMethods.click(driver, ConstantLocators.navigationOption);
		Assert.assertEquals(GenericMethods.getElementText(driver, ConstantLocators.username), "ASHWIN");
		return this;
	}

}
