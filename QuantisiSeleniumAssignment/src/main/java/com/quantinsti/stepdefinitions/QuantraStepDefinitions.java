package com.quantinsti.stepdefinitions;

import java.lang.reflect.Method;

import org.junit.Assert;

import com.quantinsti.pagelibrary.LoginPage;
import com.quantinsti.testbase.TestBase;
import com.quantinsti.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class QuantraStepDefinitions extends TestBase {
	
	

	@Given("user is on the Quantra landing page")
	public void user_is_on_the_Quantra_landing_page() throws Exception {
	
		init();
	   
	}

	@When("user verifies the landing page title")
	public void user_verifies_the_landing_page_title() {
		
		String title = driver.getTitle();
		Assert.assertEquals("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", title);
	
	   
	}

	@Then("user clicks on the login icon")
	public void user_clicks_on_the_login_icon() throws InterruptedException {
		Thread.sleep(5000);
		loadLoginPageElements();
		login.loginbtnclick();
	   
	}

	@Then("user navigates to the login window and enters \"(.*)\" and \"(.*)\"")
	public void user_navigates_to_the_login_window_and_enters_and(String username, String password) {
		
		login.enterCredentials(username, password, driver);
	   
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
		login.signinbtnClick();
	}

	@Then("user selects profile from the profile dropdown icon")
	public void user_selects_profile_from_the_profile_dropdown_icon() throws InterruptedException {
		Utility util = new Utility();
		 util.getHandles("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", driver);
		Thread.sleep(5000);
	    loadProfilePageElements();
	    profile.selectProfile();
	    util.getHandles("QuantInsti SSO", driver);
	    
	}

	@Then("user gets the email address text")
	public void user_gets_the_email_address_text() {
	    String emailaddress = profile.geteEmail();
	    System.out.println("Email address is "+ emailaddress);
	}

	@Then("user enters incorrect \"(.*)\" and validates the error message")
	public void user_enters_incorrect_and_validates_the_error_message(String mobilenumber) {
	  profile.mobiletb(mobilenumber);
	  profile.savebtnClick();
	  String alerttext = driver.switchTo().alert().getText();
	  Assert.assertEquals( "Phone is not valid", alerttext);
	}

	@Then("user takes a screenshot of the profile page")
	public void user_takes_a_screenshot_of_the_profile_page() {
	    Utility util = new Utility();
	    util.captureScreenShot("user_takes_a_screenshot_of_the_profile_page");
	   
	}

	@Then("user navigates to My Services Page")
	public void user_navigates_to_My_Services_Page() {
		 driver.switchTo().alert().accept();
		 loadMyServicesPageElements();
		 myservices.myServicesClick();
	}

	@Then("user launches Quantra and gets the page title")
	public void user_launches_Quantra_and_gets_the_page_title() {
		myservices.quantraLaunchBtnClick();
	    Utility util = new Utility();
	    util.getHandles("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", driver);
	    System.out.println("Titile of the Quantra launch Page is " + driver.getTitle());
	    driver.close();
	}

	@Then("user user launches EPAT and gets the page title")
	public void user_user_launches_EPAT_and_gets_the_page_title() {
		 Utility util = new Utility();
		 util.getHandles("QuantInsti SSO", driver);
		 myservices.epatBtnClick();
		 util.getHandles("Algorithmic Trading Course - Training for Traders, Quants & Programmers", driver);
		    System.out.println("Titile of the EPAT launch Page is " + driver.getTitle());
		    driver.close();
		 
	}

	@Then("user navigates back to the main application")
	public void user_navigates_back_to_the_main_application() {
		Utility util = new Utility();
		 util.getHandles("Quantra by QuantInsti | Courses on Algorithmic & Quantitative Trading", driver);
	}

	@Then("user logs out")
	public void user_logs_out() {
		
		//profile.selectProfile();
	}



}
