package com.pojohealth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClassHealth;

public class PojoMenu extends BaseClassHealth {
	
			// Non parametrized Constructor

			public PojoMenu() {
				PageFactory.initElements(driver,this);
			}

			// Private WebElement
			
			@FindBy(xpath="(//a[@class='flex-middle-center auto'])[1]")
			private WebElement about;

			@FindBy(xpath="//a[text()='What Hurts?']")
			private WebElement what;
			
			@FindBy(xpath="//a[text()='Treatments']")
			private WebElement treatments;
			
			@FindBy(xpath="(//a[text()='Find A Doctor'])[1]")
			private WebElement findDoctor;
			
			@FindBy(xpath="//a[text()='Find A Location']")
			private WebElement findLocation;
			
		
			@FindBy(xpath="(//a[text()='Patient Resources'])[1]")
			private WebElement patient;
			
			@FindBy(xpath="(//img[@alt='National Spine & Pain Centers'])[1]")
			private WebElement spineLogo;
			
			//Getters
			public WebElement getAbout() {
				return about;
			}

			public WebElement getWhat() {
				return what;
			}

			public WebElement getTreatments() {
				return treatments;
			}

			public WebElement getFindDoctor() {
				return findDoctor;
			}
			public WebElement getFindLocation() {
				return findLocation;
			}


			public WebElement getPatient() {
				return patient;
			}

			public WebElement getSpineLogo() {
				return spineLogo;
			}
			

}
