package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"html:target/cucumber-report", 
		"json:target/cucumber-report/cucumber.json"}, 
		features = "./src/test/resources/features",
		glue = "com/cbt/stpdefs"
		
		)
public class CukesCBT {

}
