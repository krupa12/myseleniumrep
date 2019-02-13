package com.test.flamco.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.util.FlamcoConstants;


public class BasePage {
	public WebDriver driver;
	public ExtentTest test;
   public JavascriptExecutor js = (JavascriptExecutor) driver;

	public BasePage() {

	}

	public BasePage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

	}
	
	
	public String verifyTitle(String expTitle) {
		test.log(LogStatus.INFO, "Verifying the title - " + expTitle);
		return "";

	}
	
	public String verifyText(String locator, String expText) {

		return "";

	}
	
	public boolean isElementPresent(String locator) {
		test.log(LogStatus.INFO, "Trying to find elements -> " + locator);
		int s = driver.findElements(By.xpath(locator)).size();
		if (s == 0) {
			test.log(LogStatus.INFO, "Element not found");
			return false;

		} else {
			test.log(LogStatus.INFO, "Element found");
			return true;
		}
	}
	
	public void takeScreenshot() {
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		String filePath = FlamcoConstants.SCREENSHOT_PATH + "screenshots//" + screenshotFile;
		// store screenshot in that file
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(scrFile, new File(filePath));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, test.addScreenCapture(filePath));
	}
	
	public void reportFailure(String failureMessage) {
		test.log(LogStatus.FAIL, failureMessage);
		takeScreenshot();
		Assert.fail(failureMessage);
	
}
}
