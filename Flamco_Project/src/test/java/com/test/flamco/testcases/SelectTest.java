package com.test.flamco.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
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

public class SelectTest extends BaseTest {
	String testCaseName = "SelectTest";

	@Test(dataProvider = "getData")
	public void navigatetoSelect(Hashtable<String, String> data) throws InterruptedException {
		test = extent.startTest(testCaseName);
		if (!DataUtil.isTextExectable(xls, testCaseName) || data.get(FlamcoConstants.RUNMODE_COL).equals("N")) {
			test.log(LogStatus.SKIP, "Skipping the test as Runmode is N");
			throw new SkipException("Skipping the test as Runmode is N");
		}
		test.log(LogStatus.INFO, "Starting Select Test");
		test.log(LogStatus.INFO, "Opening browser");
		init(data.get("Browser"));

		LaunchPage launchPage = new LaunchPage(driver, test);
		PageFactory.initElements(driver, launchPage);
		HomePage homePage = launchPage.gotoHomePage();
		InputPage inputPage = (InputPage) homePage.gotoVesselsizing();
		SelectPage selectPage = (SelectPage) inputPage.enterdataInput(data.get("FlowTemperature"),
				data.get("ReturnTemperature"), data.get("TotalOutput"));
		Thread.sleep(1000);
		selectPage.chooseVesselType();
		selectPage.chooseExpanssionVessel();

	}

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
