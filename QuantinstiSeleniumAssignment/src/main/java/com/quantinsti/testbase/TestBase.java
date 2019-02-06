package com.quantinsti.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.quantinsti.pagelibrary.LoginPage;
import com.quantinsti.pagelibrary.MyServicesPage;
import com.quantinsti.pagelibrary.ProfilePage;
import com.quantinsti.utility.Utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;

/**
 * 
 * @author ronit This is the base class. It defines properties , instantiates
 *         driver and page elements
 */
public class TestBase {

	public WebDriver driver;
	private String baseurl, chromepath, firefoxpath, browser;
	public static String screenshotpath;
	public LoginPage login;
	public MyServicesPage myservices;
	public ProfilePage profile;
	public Utility util;

	public TestBase() {
		File file = new File(System.getProperty("user.dir") + "/src/main/resources/config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			Properties config = new Properties();
			config.load(fis);
			this.baseurl = config.getProperty("URL");
			this.chromepath = config.getProperty("ChromePath");
			this.firefoxpath = config.getProperty("FirefoxPath");
			this.screenshotpath = config.getProperty("ScreenshotPath");
			this.browser = config.getProperty("Browser");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Start Browser and open the link
	public void init() throws Exception {

		if (this.browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", this.firefoxpath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(baseurl);
		} else if (this.browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", this.chromepath);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions", "test-type");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(baseurl);

		}
	}

	// Instatiating Page objects in the base class is a good practice as its easy to
	// call through methods, code looks clean and becomes reuasable.
	public void loadLoginPageElements() {
		login = PageFactory.initElements(driver, LoginPage.class);
	}

	public void loadMyServicesPageElements() {
		myservices = PageFactory.initElements(driver, MyServicesPage.class);
	}

	public void loadProfilePageElements() {
		profile = PageFactory.initElements(driver, ProfilePage.class);
	}
}
