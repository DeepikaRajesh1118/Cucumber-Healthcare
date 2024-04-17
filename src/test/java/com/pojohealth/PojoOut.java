package com.pojohealth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClassHealth;

public class PojoOut extends BaseClassHealth {
	//non parametrized constructor
	public PojoOut() {
		PageFactory.initElements(driver, this);
	}
	
	//private Webelement
	@FindBy(xpath="(//a[@class='flex-middle-center auto'])[5]")
	private WebElement findLocation;

	@FindBy(xpath="//input[@id='SystemV1MapNEWSystemV2_HDR0_ZipCode']")
	private WebElement zipCode;
	
	@FindBy(xpath="//input[@id='SystemV1MapNEWSystemV2_HDR0_City']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='SystemV1MapNEWSystemV2_HDR0_Name']")
	private WebElement locationName;
	
	//Getters
	public WebElement getFindLocation() {
		return findLocation;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getLocationName() {
		return locationName;
	}
	

}
