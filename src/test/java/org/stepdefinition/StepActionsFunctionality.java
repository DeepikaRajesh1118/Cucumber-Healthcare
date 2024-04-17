package org.stepdefinition;



import org.testng.Assert;
import com.baseclass.BaseClassHealth;
import com.pojohealth.PojoAction;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepActionsFunctionality extends BaseClassHealth {
	PojoAction poa;
	
	@When("User click the spine and pain logo")
	public void user_click_the_spine_and_pain_logo() {  
		poa=new PojoAction();
		click(poa.getSpineLogo());
	   
	}

	@When("User enter the zip code")
	public void user_enter_the_zip_code() {
		sendTxt(poa.getSearch(),"614204");
	    
	}

	@When("User should click the search and go")
	public void user_should_click_the_search_and_go() {
	    click(poa.getGo());
	}

	@Then("User should navigate to new page")
	public void user_should_navigate_to_new_page() {
	
		String Expected="https://www.treatingpain.com/find-a-location/?ZipCode=614204";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, Expected);
	    close(); 
	}



}
