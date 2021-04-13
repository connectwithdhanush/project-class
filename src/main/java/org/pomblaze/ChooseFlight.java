package org.pomblaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseFlight extends BaseClass {
	
	public ChooseFlight() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class='btn btn-small'])[3]")
	private WebElement btnchoose;

	public WebElement getBtnchoose() {
		return btnchoose;
	} 

	}
