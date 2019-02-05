package com.quantinsti.pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyServicesPage {
	
	@FindBy(xpath = "//a[@href='/services']")
	private WebElement myservices;
	
	@FindBy(xpath = "//button[text()='launch']")
	private WebElement quantralaunchbtn;
	
	@FindBy(xpath = "//button[text()='enroll']")
	private WebElement epatbtn;
	
	public void myServicesClick()
	{
		myservices.click();
	}
	public void quantraLaunchBtnClick()
	{
		quantralaunchbtn.click();
	}
	public void epatBtnClick()
	{
		epatbtn.click();
	}
	

}
