package com.quantinsti.stepdefinitions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.quantinsti.testbase.TestBase;
import com.quantinsti.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author ronit This class contains test scripts in the form of Step
 *         Definitions for the features defined in quantra.feature
 */
public class QuantraStepDefinitions extends TestBase {

	@Given("user is on the Quantra landing page")
	public void user_is_on_the_Quantra_landing_page() throws Exception {

		init();
		util = new Utility();
		util.initiateLogger(QuantraStepDefinitions.class.getName());

	}

	@When("user verifies the landing page title")
	public void user_verifies_the_landing_page_title() {

		String title = driver.getTitle();
		Assert.assertEquals("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", title);
		util.logger.info("****User is on the Quantra Home Screen****");
	}

	@Then("user clicks on the login icon")
	public void user_clicks_on_the_login_icon() {

		loadLoginPageElements();
		util.explicitWait(driver, login.loginbtn);
		login.loginbtnclick();

	}

	@Then("user navigates to the login window and enters \"(.*)\" and \"(.*)\"")
	public void user_navigates_to_the_login_window_and_enters_and(String username, String password) {

		login.enterCredentials(username, password, driver);

	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {

		login.signinbtnClick();
		util.logger.info("****User has logged in****");

	}

	@Then("user selects profile from the profile dropdown icon")
	public void user_selects_profile_from_the_profile_dropdown_icon() {

		util.getHandles("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", driver);
		loadProfilePageElements();
		util.explicitWait(driver, profile.profileicon);
		profile.profileIconClick();
		profile.profilelinkClick();
		util.logger.info("****User is on Profile Screen****");
	}

	@Then("user gets the email address text")
	public void user_gets_the_email_address_text() {
		util.getHandles("QuantInsti SSO", driver);
		util.explicitWait(driver, profile.emailtb);
		String emailaddress = profile.getEmail();
		System.out.println("Email address is " + emailaddress);
	}

	@Then("user enters incorrect \"(.*)\" and validates the error message")
	public void user_enters_incorrect_and_validates_the_error_message(String mobilenumber) {
		profile.mobiletb(mobilenumber, driver);
		profile.savebtnClick();
		util.explicitWait(driver, profile.errorTxt);
		Assert.assertEquals("Phone is not valid", profile.getAlertText()); // Modal alert, hence does not require
																			// driver.switchto.alert
	}

	@Then("user takes a screenshot of the profile page")
	public void user_takes_a_screenshot_of_the_profile_page() {

		util.captureScreenShot("user_takes_a_screenshot_of_the_profile_page");
		profile.alertOkClick();
		util.logger.info("****Screenshot Taken****");
	}

	@Then("user navigates to My Services Page")
	public void user_navigates_to_My_Services_Page() {

		loadMyServicesPageElements();
		util.explicitWait(driver, myservices.myservices);
		myservices.myServicesClick(driver);
		util.logger.info("****User is on My Services page****");

	}

	@Then("user launches Quantra and gets the page title")
	public void user_launches_Quantra_and_gets_the_page_title() {

		util.explicitWait(driver, myservices.quantralaunchbtn);
		myservices.quantraLaunchBtnClick();
		util.getHandles("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", driver);
		System.out.println("Title of the Quantra launch Page is " + driver.getTitle());
		util.logger.info("****User is on Quantra Page****");

	}

	@Then("user user launches EPAT and gets the page title")
	public void user_user_launches_EPAT_and_gets_the_page_title() throws InterruptedException {

		util.getHandles("QuantInsti SSO", driver);
		util.explicitWait(driver, myservices.epatbtn);
		myservices.epatBtnClick();
		util.getHandles("Algorithmic Trading Course - Training for Traders, Quants & Programmers", driver);
		Thread.sleep(5000);
		System.out.println("Title of the EPAT launch Page is " + driver.getTitle());
		util.logger.info("****User is on EPAT Page****");

	}

	@Then("user navigates back to the main application")
	public void user_navigates_back_to_the_main_application() {

		util.getHandles("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", driver);
		util.logger.info("****User is back on Home Screen****");
	}

	@Then("user logs out and closes the browser")
	public void user_logs_out_and_closes_the_browser() {

		util.explicitWait(driver, profile.profileicon);
		profile.profileIconClick();
		profile.logoutlinkClick();
		util.logger.info("****User has logged out****");
		driver.quit();
		util.logger.info("****Browser Closed****");

	}

}
