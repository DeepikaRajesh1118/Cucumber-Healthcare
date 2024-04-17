package com.pojohealth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClassHealth;

public class PojoAction extends BaseClassHealth {
	        // Non parametrized Constructor

			public PojoAction() {
				PageFactory.initElements(driver, this);;
			}
			
			//private WebElement
			@FindBy(xpath="(//img[@alt='National Spine & Pain Centers'])[1]")
			private WebElement spineLogo;

			@FindBy(id="Search")
			private WebElement search;
			
			@FindBy(xpath="(//a[@class='search-btn flex-stretch'])[1]")
			private WebElement go;
			
			
			
            //Getters
			public WebElement getSpineLogo() {
				return spineLogo;
			}
			
			public WebElement getSearch() {
				return search;
			}

			public WebElement getGo() {
				return go;
			}
			

}
