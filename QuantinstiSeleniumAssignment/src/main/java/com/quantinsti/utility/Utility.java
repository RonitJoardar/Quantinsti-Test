package com.quantinsti.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quantinsti.testbase.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;

/**
 * 
 * @author ronit The Utility class contains methods which are widely reused
 *         throughout the framework, the main objective of this class to improve
 *         plug and play reusablit
 */

public class Utility extends TestBase {

	public Logger logger;

	/**
	 * 
	 * @param sc_name This method is used to capture screenshot of the current
	 *                screen, user can pass any string to concatenate with the
	 *                current date time stamp for the screenshot name. Screenshots
	 *                are stored in the Screenshots folder in
	 *                QuantinstiSeleniumAssignment
	 */
	public void captureScreenShot(String sc_name) {
		String timeStamp = new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(
					System.getProperty("user.dir") + TestBase.screenshotpath + sc_name + "_" + timeStamp + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * This method will switch between windows/tabs by validating the page title
	 * first
	 * 
	 * @param pagetitle
	 * @param driver
	 */

	public void getHandles(String pagetitle, WebDriver driver) {
		this.driver = driver;

		Set<String> handles = driver.getWindowHandles();
		for (String switchhandles : handles) {
			driver.switchTo().window(switchhandles);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase(pagetitle)) {
				break;
			}

		}
	}

	/**
	 * Explicit wait invoke
	 * 
	 * @param driver
	 * @param element
	 */
	public void explicitWait(WebDriver driver, WebElement element) {
		this.driver = driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Instantiates the logger class
	 * 
	 * @param className
	 */

	public void initiateLogger(String className) {
		// Here we need to create logger instance so we need to pass Class name
		// for
		// which we want to create log file in my case className will take the
		// test classname
		logger = Logger.getLogger(className);

		// configure log4j properties file
		File log4jfile = new File("./src/main/resources/log4j.properties");
		PropertyConfigurator.configure(log4jfile.getAbsolutePath());
	}

	@After
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
