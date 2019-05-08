package com.newtour.assignment3;



import com.newtour.assignment3.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class newtour {
	WebConnector con;

	public newtour(WebConnector con) {
		this.con = con;
	}
	@Given("^I open (.*)$")
	public void browser(String browserName) {
		System.out.println("Opening browser " + browserName);
		con.openBrowser(browserName);
	}

	@And("^I navigate to (.*)$")
	public void i_navigate_to_url(String url) {
		System.out.println("Navigating to " + url);
		con.navigate(url);
	}

	@And("^I click on (.*)$")
	public void i_click_on_register_xpath(String locatorKey) throws InterruptedException {
		System.out.println("clicking on " + locatorKey);
		con.click(locatorKey);
	}

	@And("^In (.*) I enter (.*)$")
	public void i_enter(String objectKey,String data ) {
		con.type(objectKey,data);
		
	}
	@And ("^In (.*) I select$")
	public void i_select(String objectKey, String data) {
		con.type(objectKey, data);
	}
}
