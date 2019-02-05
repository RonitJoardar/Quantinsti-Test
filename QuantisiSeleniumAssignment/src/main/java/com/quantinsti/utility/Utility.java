package com.quantinsti.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.quantinsti.testbase.TestBase;

public class Utility extends TestBase {
	
	public void captureScreenShot(String sc_name)
	{
		String timeStamp = new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,
					new File(System.getProperty("user.dir") + TestBase.screenshotpath + sc_name + "_" + timeStamp + ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	public void getHandles(String pagetitle, WebDriver driver)
	{
		this.driver=driver;
		
		Set<String> handles = driver.getWindowHandles();
		for(String switchhandles : handles)
		{
		driver.switchTo().window(switchhandles);
		String title = driver.getTitle();
		if(title.equalsIgnoreCase(pagetitle))
				{
				break;
				}
		
		}
	}

}
