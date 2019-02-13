package com.test.flamco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.base.BasePage;
import com.test.flamco.util.FlamcoConstants;

public class SelectPage extends BasePage {
	@FindBy(xpath = FlamcoConstants.PUMP_AUTOMAT)
	WebElement pumpautomat;
	@FindBy(xpath = FlamcoConstants.CONNECTED_MODE)
	WebElement connectedmode;
	@FindBy(xpath = FlamcoConstants.NUMBER_OF_PUMP_MODULES)
	WebElement noofpumpmodules;
	@FindBy(xpath = FlamcoConstants.NUMBER_OF_PUMPS_PER_MODULES)
	WebElement pumpspermodules;
	@FindBy(xpath = FlamcoConstants.PUMP_MODULES)
	WebElement pumpmodules;
	@FindBy(xpath = FlamcoConstants.SELECT_VESSEL)
	WebElement selectvessel;
	@FindBy(xpath = FlamcoConstants.INTERMEDIATE_VESSEL)
	WebElement intermediatevessel;
	@FindBy(xpath = FlamcoConstants.SELECT_INTERMEDIATE_VESSEL)
	WebElement selectintermediatevessel;
	@FindBy(xpath = FlamcoConstants.EXTRA_COMPONENTS)
	WebElement extracomponents;
	@FindBy(xpath = FlamcoConstants.OUTPUT_BUTTON)
	WebElement outputbutton;

	public SelectPage(WebDriver driver, ExtentTest test) {
		super(driver, test);

	}

	public void chooseVesselType() {
		pumpautomat.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected Pump Automat");

	}

	public void chooseExpanssionVessel() throws InterruptedException {
		connectedmode.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected connected mode");
		noofpumpmodules.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected pump modules");
		pumpspermodules.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected Double pumps");
		pumpmodules.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected pumps");
		selectvessel.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected vessels");
		Thread.sleep(5000);
		intermediatevessel.click();
		selectintermediatevessel.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Intermediate Vessel vessels");
		Thread.sleep(5000);
		extracomponents.click();
		takeScreenshot();
		test.log(LogStatus.PASS, "Selected Extra components");
		js.executeScript("arguments[0].scrollIntoView();", outputbutton);
		outputbutton.click();
	}

}
