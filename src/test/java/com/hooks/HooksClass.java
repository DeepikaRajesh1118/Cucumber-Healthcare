package com.hooks;



import com.baseclass.BaseClassHealth;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class HooksClass extends BaseClassHealth{

	@Before
	public void setUp() {
		System.out.println("Browser got launched and Maximized");
		System.out.println("Application Url got opened in the browser");
		//browserLaunch();
	}

	@After
	public void exitSetup() {
		System.out.println("Loggedout from the application");
		System.out.println("Browser got closed");
		close();
	}
}
