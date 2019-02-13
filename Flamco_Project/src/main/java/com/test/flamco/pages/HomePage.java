package com.test.flamco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.base.BasePage;
import com.test.flamco.util.FlamcoConstants;

public class HomePage extends BasePage {
	@FindBy(xpath = FlamcoConstants.VESSEL_SIZING)
	WebElement vesselsizing;
	@FindBy(xpath = FlamcoConstants.ALLOW_COOKIES_BUTTON)
	WebElement allowcookiesbutton;

	public HomePage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}

	public Object gotoVesselsizing() {
		test.log(LogStatus.INFO, "Homepage Launched sucessfully");
		allowcookiesbutton.click();
		test.log(LogStatus.INFO, "Clicked on Allow cookies button");
		vesselsizing.click();
		test.log(LogStatus.INFO, "Clicked on Central heating");

		boolean inputtab = isElementPresent(FlamcoConstants.EXTENTED_INPUT);
		if (inputtab) {
			test.log(LogStatus.PASS, "Navigated to INPUT tab sucessfully");
			takeScreenshot();
			InputPage inputpage = new InputPage(driver, test);
			PageFactory.initElements(driver, inputpage);
			return inputpage;

		} else {
			test.log(LogStatus.FAIL, "Didn't navigate to INPUT tab");
			takeScreenshot();
			HomePage homepage = new HomePage(driver, test);
			PageFactory.initElements(driver, homepage);
			return homepage;

		}

	}

	public void gotoBalancingValve() {

	}
}
