package org.pomblaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindFlightpage extends BaseClass {
	
	public FindFlightpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="fromPort")
	private WebElement dep;
	
	@FindBy(name="toPort")
	private WebElement des;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btn;

	public WebElement getDep() {
		return dep;
	}

	public WebElement getDes() {
		return des;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	
	
	
	
	
	

}
