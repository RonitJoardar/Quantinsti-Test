package com.quantinsti.pagelibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.quantinsti.testbase.TestBase;

/**
 * 
 * @author ronit This file contains Page Objects and Action methods of the
 *         Profile Page
 */
public class ProfilePage extends TestBase {

	@FindBy(xpath = "//li/span[contains(@class,'img-circle')]")
	public WebElement profileicon;

	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	private WebElement profilelink;

	@FindBy(name = "email")
	public WebElement emailtb;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobiletb;

	@FindBy(xpath = "//div[text()='Phone is not valid']")
	public WebElement errorTxt;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okBtn;

	@FindBy(xpath = "//button[@type='submit' and contains(text(),'save')]")
	private WebElement savebtn;

	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement logoutlink;

	public void profileIconClick() {
		profileicon.click();

	}

	public void profilelinkClick() {
		profilelink.click();

	}

	public String getEmail() {
		String email = emailtb.getAttribute("value");
		return email;
	}

	public String getAlertText() {
		String alert = errorTxt.getText();
		return alert;
	}

	public void alertOkClick() {
		okBtn.click();

	}

	public void mobiletb(String mobilenumber, WebDriver driver) {
		this.driver = driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '';", mobiletb);
		mobiletb.sendKeys(mobilenumber);
	}

	public void savebtnClick() {
		savebtn.click();
	}

	public void logoutlinkClick() {
		logoutlink.click();

	}

}
