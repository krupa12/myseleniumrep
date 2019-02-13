package com.test.flamco.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.test.flamco.pages.HomePage;
import com.test.flamco.pages.InputPage;
import com.test.flamco.pages.LaunchPage;
import com.test.flamco.pages.SelectPage;
import com.test.flamco.testcases.base.BaseTest;
import com.test.flamco.util.DataUtil;
import com.test.flamco.util.FlamcoConstants;

public class InputTest extends BaseTest {
	String testCaseName = "InputTest";

	@Test(dataProvider = "getData")
	public void navigateToInput(Hashtable<String, String> data) {
		test = extent.startTest(testCaseName);
		if (!DataUtil.isTextExectable(xls, testCaseName) || data.get(FlamcoConstants.RUNMODE_COL).equals("N")) {
			test.log(LogStatus.SKIP, "Skipping the test as Runmode is N");
			throw new SkipException("Skipping the test as Runmode is N");
		}
		test.log(LogStatus.INFO, "Starting Input Test");
		test.log(LogStatus.INFO, "Opening browser");
		init(data.get("Browser"));
		LaunchPage launchPage = new LaunchPage(driver, test);
		PageFactory.initElements(driver, launchPage);
		HomePage homePage = launchPage.gotoHomePage();
		homePage.takeScreenshot();
		Object page = homePage.gotoVesselsizing();
		if (page instanceof HomePage) {
			Assert.fail("Didn't navigate to Input tab");

			// test.log(LogStatus.FAIL, "Didn't navigate to Input tab");

		} else if (page instanceof InputPage) {

			InputPage inputPage = (InputPage) page;
			Object page1 = inputPage.enterdataInput(data.get("FlowTemperature"), data.get("ReturnTemperature"),
					data.get("TotalOutput"));

			if (page1 instanceof InputPage)
				Assert.fail("Didn't navigate to Select tab");

			else if (page1 instanceof SelectPage) {
				SelectPage selectPage = (SelectPage) page1;
				test.log(LogStatus.PASS, "Input test PASSED");
			}

		}
	}

	// SelectPage selectPage = (SelectPage)
	// inputPage.enterdataInput(data.get("FlowTemperature"),
	// data.get("ReturnTemperature"), data.get("TotalOutput"));

	// selectPage.takeScreenshot();

	@AfterMethod
	public void quit() {
		if (extent != null) {
			extent.endTest(test);
			extent.flush();
		}
	}

	@DataProvider
	public Object[][] getData() {
		return DataUtil.getData(xls, testCaseName);

	}

}
