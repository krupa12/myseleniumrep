package com.test.flamco.util;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlamcoConstants {
	//urls
	public static final String STG_URL="http://flamco-mindtree:Amersfoortseweg9@apps-stg.flamcogroup.com/";
	public static final String UAT_URL="http://apps-uat.flamcogroup.com/";
	public static final String PROD_URL="https://source-to-emitter.com/";
	
	
	//paths
	public static final String REPORTS_PATH = "D:\\Selenium\\extent report\\";
	public static final String SCREENSHOT_PATH ="D:\\Selenium\\ScreenShots\\";
	public static final String DATA_XLS_PATH = System.getProperty("user.dir")+"\\Data\\Data.xlsx";
	public static final String TESTDATA_SHEET = "TestData";
	public static final Object RUNMODE_COL = "Runmode";
	public static final String TESTCASES_SHEET = "TestCases";
	
	//locators
	public static final String VESSEL_SIZING = "//*[@id='app']/div[1]/div[3]/div[1]/div";
	public static final String EXTENTED_INPUT = "//span[@class='extended-input']";
	public static final String ALLOW_COOKIES_BUTTON = "//button[@class='js-cookie-consent-agree cookie-consent__agree']";
	public static final String FLOW_TEMPERATURE = "//input[@name='flowtemp']";
	public static final String RETURN_TEMPERATURE = "//input[@name='returntemp']";
	public static final String TOTAL_OUTPUT = "//*[@id='__BVID__3']/div[3]/div[2]/div/div[1]/div/input";
	public static final String CHOOSE_VESSEL_TYPE = "//a[text()='Choose Vessel type']";
	public static final String SELECT_BUTTON = "//button[@id='next-btn']";
	public static final String PUMP_AUTOMAT = "//*[@id='selectaccordion1']/div/div[2]/div[4]/div/label";
	public static final String CONNECTED_MODE = "//div[@id='loaddependent']";
	public static final String NUMBER_OF_PUMP_MODULES = "//label[text()='4']";
	public static final String NUMBER_OF_PUMPS_PER_MODULES = "//span[@class='switch-label']";
	public static final String PUMP_MODULES = "//label[text()='D 02']";
	public static final String SELECT_VESSEL = "//*[@id='selectaccordion2']/div/div[4]/div[3]";
	public static final String INTERMEDIATE_VESSEL = "//a[text()='Choose Intermediate Vessel']";
	public static final String SELECT_INTERMEDIATE_VESSEL = "//*[@id='selectaccordion3']/div/div[3]/div[3]";
	public static final String EXTRA_COMPONENTS = "//a[text()='Extra Components']";
	public static final String OUTPUT_BUTTON = "//span[@class='nxt-btn-sec']";
}
