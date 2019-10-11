package com.mercury.library;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

public class Base {
	final static Logger logger = Logger.getLogger(Base.class);

	public static WebDriver driver;
	public static AutomationLibrary mylibrary;
	private static JavaPropertiesManager readProperty;
	private static String browser;
	private static String demoType;

	@BeforeClass
	public void beforeAllTestStart() {

		

		mylibrary = new AutomationLibrary(driver);

	}

	@AfterClass
	public void afterAllTestCompleted() {

	}

	@BeforeMethod
	public void beforeEachTestStart() {
		driver = mylibrary.startChromeBrowser();
	}

	@AfterMethod
	public void afterEachTestEnd(ITestResult result) {
		try {
			if (ITestResult.FAILURE == result.getStatus()) {
				mylibrary.captureScreenshot(result.getName(), "target/screenshots/");
			}
			Thread.sleep(2 * 1000);

			driver.close(); // close the browser
			driver.quit(); // kills/deletes the driver object

		} catch (Exception e) {
			logger.error("Error: ", e);
		}
	}

}
