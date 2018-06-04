package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"html:target/cucumber-report/register", 
		"json:target/cucumber-report/register/cucumber.json"}, 
		features = "./src/test/resources/features/register",
		glue = "com/cbt/stpdefs"
		
		)
public class RegisterRunner {

}
