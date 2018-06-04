package com.cbt.stpdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cbt.utilities.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {
	
	private WebDriver driver;
	
	public StepDefs(SharedDriver sharedDriver) {
		driver = sharedDriver;
	}
	@Given("^I am on the home page$")
	public void I_am_on_the_home_page() throws Throwable {
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	}

	@Then("^I should be able to (.*)$")
	public void I_should_be_able_to_login(String option) throws Throwable {
	  driver.findElement(By.id("lst-ib")).sendKeys(option);
	  Thread.sleep(3000);
	    
	}
}

	
