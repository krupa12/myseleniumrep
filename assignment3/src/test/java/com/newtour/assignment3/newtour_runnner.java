package com.newtour.assignment3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		strict=false,
		monochrome=false,
		features= {"src/test/resources/"},
		glue = {"com.newtour.assignment3"},
				plugin= {
						"html:target/site/cucumber-html",
						"json:target/cucumber1.json"}
		)
public class newtour_runnner {

}
