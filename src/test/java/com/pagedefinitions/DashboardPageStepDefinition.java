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
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dp;

	}

	@When("^You are on Menu$")
	public void you_are_on_menu() {
		dp.clickOnMenu();

	}

	@Then("^Check Menu and Login options with \"(.*)\" and \"(.*)\"$")
	public void check_menu_and_login(String userName, String password) {
		dp.checkMenuOptions().checkLoginOption(userName, password);
	}

}
