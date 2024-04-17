package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;

import com.baseclass.BaseClassHealth;
import com.pojohealth.PojoHealth;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinitionClass extends BaseClassHealth {
	// Scenario 1
	PojoHealth ph;
	@Given("open the Browser and maximize the window")
	public void open_the_Browser_and_maximize_the_window() throws IOException {
		browserLaunch();
		urlWebsite("https://www.treatingpain.com/");
	
	}

	@When("User navigate to the Given URl")
	public void user_navigate_to_the_Given_URl() throws IOException {
	
		 //urlWebsite(readExcel(3,0));
		
	}

	@When("User click the Spline & Pain logo")
	public void user_click_the_Spline_Pain_logo() {
		ph = new PojoHealth();
		click(ph.getSpinelogo());

	}

	@Then("Should open the new Webpage With Details")
	public void should_open_the_new_Webpage_With_Details() {
		String Expected = "https://www.treatingpain.com/";
		String Actual = driver.getCurrentUrl();
		Assert.assertEquals(Expected, Actual);
		close();
	}

}
