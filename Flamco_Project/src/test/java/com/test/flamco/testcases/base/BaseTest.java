package com.test.flamco.testcases.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.util.ExtentManager;
import com.test.flamco.util.FlamcoConstants;
import com.test.flamco.util.Xls_Reader;

public class BaseTest {
	public ExtentReports extent = ExtentManager.getInstance();
	public ExtentTest test;
	public WebDriver driver;
	public Xls_Reader xls = new Xls_Reader(FlamcoConstants.DATA_XLS_PATH);

	public void init(String bType) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		test.log(LogStatus.INFO, "Opening browser - " + bType);
		if (bType.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if (bType.equals("Chrome"))
			driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Opened browser sucessfully - " + bType);

	}

	public void reportFailure(String failureMessage) {
		test.log(LogStatus.FAIL, failureMessage);
		takeScreenshot();
		Assert.fail(failureMessage);

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

}
