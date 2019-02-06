package com.quantinsti.pagelibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.quantinsti.testbase.TestBase;
import com.quantinsti.utility.Utility;

/**
 * 
 * @author ronit This file contains Page Objects and Action methods of the Login
 *         Page
 */
public class LoginPage extends TestBase {

	@FindBy(xpath = "//p[contains(text(),'Login')]")
	public WebElement loginbtn;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailtb;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordtb;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signinbtn;

	public void loginbtnclick() {
		loginbtn.click();
	}

	public void enterCredentials(String username, String password, WebDriver driver) {
		this.driver = driver;
		util = new Utility();
		util.getHandles("QuantInsti SSO", driver);
		emailtb.sendKeys(username);
		passwordtb.sendKeys(password);
	}

	public void signinbtnClick() {
		signinbtn.click();
	}

}
