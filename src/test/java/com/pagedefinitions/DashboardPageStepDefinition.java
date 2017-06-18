package com.pagedefinitions;

import com.pageobjects.DashboardPage;
import com.setup.MobileSetup;

import cucumber.api.java.en.*;

public class DashboardPageStepDefinition extends MobileSetup {
	DashboardPage dp;

	@Given("^You are on Dashboard page$")
	public DashboardPage you_are_on_Dashboard_page() {

		dp = new DashboardPage(getDriver());
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dp.swipeLeft();
	
		return dp;

	}

	@And("^You enter \"(.*)\" and \"(.*)\"$")
	public void you_are_on_menu(String userName, String password) {
		dp.enterCredentials(userName, password);

	}
	
	@And("^Click on Login button and Agree Button$")
	public void clickOnLogin() {
		dp.clickOnLoginAndAgree();
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@And("^Click on Second Show$")
	public void clickOnSecondShow() {
		dp.clickOnSecondShow();
		try {
			Thread.sleep(20000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("^Check show description is greater the (\\d+) characters$")
	public void checkCharacterCount(int count) {
	
		dp.checkCharacterCount(count);
	
	}
	
	@And("^Set a reminder and then set as a favourite$")
	public void setReminderFavorite() {
	
    dp.setReminderFav();
		
	}
	
	@And("^Go to favorites and Ensure this exact show available$")
	public void checkExactShow() {
	
		
		dp.checkExactShowAvailable();
	}
	
	@Then("^Remove the show and exact show not available$")
	public void checkShowNotAvailable() {
	
		
	dp.checkShowNotAvailable();
		
	}
	

}
