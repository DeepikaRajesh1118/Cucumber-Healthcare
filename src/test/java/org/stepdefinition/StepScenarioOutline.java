package org.stepdefinition;

import com.baseclass.BaseClassHealth;
import com.pojohealth.PojoOut;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepScenarioOutline extends BaseClassHealth {
	PojoOut po;
	@When("The user navigate the Find Location")
	public void the_user_navigate_the_Find_Location() {
		po=new PojoOut();
		click(po.getFindLocation());   
	}

	@When("The user enters {string} and {string} and {string}")
	public void the_user_enters_and_and(String zip, String states, String locate) throws InterruptedException {
		
		sendTxt(po.getZipCode(),zip);
		sendTxt(po.getCity(),states);
		sendTxt(po.getLocationName(),locate);
		Thread.sleep(4000);
	}

	@Then("The user should be see the location details displayed")
	public void the_user_should_be_see_the_location_details_displayed() {
		//need to give displayed condition
		quit();
	    
	}

	


}
