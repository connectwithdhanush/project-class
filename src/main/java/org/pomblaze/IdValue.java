package org.pomblaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdValue extends BaseClass {
	
	public IdValue() {
		PageFactory.initElements(driver, this);	}
		
	
	@FindBy(xpath="((//table[@class='table']//tr)[2]//td)[2]")
	private WebElement id;


	public WebElement getId() {
		return id;
	}
			
	
	
	
	

}
