package com.quantinsti.pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
	@FindBy(xpath = "//li/span[contains(@class,'img-circle')]")
	private WebElement profileicon;
	
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	private WebElement profilelink;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailtb;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobiletb;
	
	@FindBy(xpath = "//button[@type='submit' and contains(text(),'save')]")
	private WebElement savebtn;
	
	public void selectProfile()
	{
		profileicon.click();
		profilelink.click();
		}
	public String geteEmail()
	{
		String email = emailtb.getText();
		return email;
	}
	public void mobiletb(String mobilenumber)
	{
		mobiletb.clear();
		mobiletb.sendKeys(mobilenumber);
	}
	public void savebtnClick()
	{
		savebtn.click();
	}
	
	
	

}
