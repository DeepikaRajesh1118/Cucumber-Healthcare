package com.pojohealth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClassHealth;

	public class PojoHealth extends BaseClassHealth {
		// Non parametrized Constructor

		public PojoHealth() {
			PageFactory.initElements(driver,this);
		}

		// Private WebElement

		@FindBy(xpath="(//img[@alt='National Spine & Pain Centers'])[1]")
		private WebElement spinelogo;

		// Getters

		public WebElement getSpinelogo() {
			return spinelogo;
		}
	}


