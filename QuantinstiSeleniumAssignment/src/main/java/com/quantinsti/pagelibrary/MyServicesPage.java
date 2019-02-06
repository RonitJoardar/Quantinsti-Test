package com.quantinsti.pagelibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.quantinsti.testbase.TestBase;

/**
 * 
 * @author ronit This file contains Page Objects and Action methods of the My
 *         Services Page
 */
public class MyServicesPage extends TestBase {

	@FindBy(xpath = "//a[text()='My Services']")
	public WebElement myservices;

	@FindBy(xpath = "//button[text()='launch']")
	public WebElement quantralaunchbtn;

	@FindBy(xpath = "//button[text()='enroll']")
	public WebElement epatbtn;

	public void myServicesClick(WebDriver driver) {
		this.driver = driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", myservices);
	}

	public void quantraLaunchBtnClick() {
		quantralaunchbtn.click();
	}

	public void epatBtnClick() {
		epatbtn.click();
	}

}
