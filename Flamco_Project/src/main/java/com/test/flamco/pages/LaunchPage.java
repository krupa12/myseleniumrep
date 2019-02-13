package com.test.flamco.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.base.BasePage;
import com.test.flamco.util.FlamcoConstants;

public class LaunchPage extends BasePage {

	public LaunchPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}

	public HomePage gotoHomePage() {
		test.log(LogStatus.INFO, "Opening Flamco url - " + FlamcoConstants.PROD_URL);
		driver.get(FlamcoConstants.PROD_URL);
		test.log(LogStatus.INFO, "Flamco url opened - " + FlamcoConstants.PROD_URL);
		HomePage homePage = new HomePage(driver, test);
		PageFactory.initElements(driver, homePage);
		return homePage;

	}
}
