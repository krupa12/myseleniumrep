package com.test.flamco.pages;

import javax.print.attribute.standard.RequestingUserName;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.base.BasePage;
import com.test.flamco.util.FlamcoConstants;

public class InputPage extends BasePage {
	@FindBy(xpath = FlamcoConstants.FLOW_TEMPERATURE)
	WebElement flowtemperature;
	@FindBy(xpath = FlamcoConstants.RETURN_TEMPERATURE)
	WebElement returntemperature;
	@FindBy(xpath = FlamcoConstants.TOTAL_OUTPUT)
	WebElement totaloutput;
	@FindBy(xpath = FlamcoConstants.SELECT_BUTTON)
	WebElement selectbutton;

	public InputPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}

	public Object enterdataInput(String flowtemp, String retruntemp, String totaloput) {
		// flowtemperature.clear();

		flowtemperature.sendKeys(Keys.chord(Keys.CONTROL, "a"), String.valueOf(flowtemp));
		test.log(LogStatus.INFO, "Flow temperature entered");
		// returntemperature.clear();
		returntemperature.sendKeys(Keys.chord(Keys.CONTROL, "a"), String.valueOf(retruntemp));
		test.log(LogStatus.INFO, "Return temperature entered");
		totaloutput.sendKeys(String.valueOf(totaloput));
		test.log(LogStatus.INFO, "Total output entered");
		selectbutton.click();
		test.log(LogStatus.INFO, "Clicked on Select Button");

		boolean selecttab = isElementPresent(FlamcoConstants.CHOOSE_VESSEL_TYPE);
		if (selecttab) {
			test.log(LogStatus.PASS, "Navigated to SELECT tab successfully");
			takeScreenshot();
			SelectPage selectPage = new SelectPage(driver, test);
			PageFactory.initElements(driver, selectPage);
			return selectPage;
		} else {
			test.log(LogStatus.FAIL, "Didn't Navigated to SELECT tab");
			takeScreenshot();
			InputPage inputPage = new InputPage(driver, test);
			PageFactory.initElements(driver, inputPage);
			return inputPage;
		}

	}

}
