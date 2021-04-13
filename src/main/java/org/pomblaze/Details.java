package org.pomblaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details extends BaseClass {
        public Details() {
        	
        	PageFactory.initElements(driver, this);
		}
        
        @FindBy(name="inputName")
        private WebElement name;
        
        
        
        @FindBy(name="address")
        private WebElement address;
        
        
        
        @FindBy(name="city")
        private WebElement city;
        
        
        
        @FindBy(name="state")
        private WebElement state;
        
        
        
        @FindBy(name="zipCode")
        private WebElement zipCode;
        
        
        @FindBy(name="cardType")
        private WebElement cardType;
        
        
        @FindBy(name="creditCardNumber")
        private WebElement creditCardNumber;
        
        
        @FindBy(name="creditCardMonth")
        private WebElement creditCardMonth;
        
        
        @FindBy(name="creditCardYear")
        private WebElement creditCardYear;
        
        
        @FindBy(name="nameOnCard")
        private WebElement nameOnCard;
        
        @FindBy(name="rememberMe")
        private WebElement rememberMe;
        
        @FindBy(xpath="//input[@type='submit']")
        private WebElement btnsubmit;

		public WebElement getName() {
			return name;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCity() {
			return city;
		}

		public WebElement getState() {
			return state;
		}

		public WebElement getZipCode() {
			return zipCode;
		}

		public WebElement getCardType() {
			return cardType;
		}

		public WebElement getCreditCardNumber() {
			return creditCardNumber;
		}

		public WebElement getCreditCardMonth() {
			return creditCardMonth;
		}

		public WebElement getCreditCardYear() {
			return creditCardYear;
		}

		public WebElement getNameOnCard() {
			return nameOnCard;
		}

		public WebElement getRememberMe() {
			return rememberMe;
		}

		public WebElement getBtnsubmit() {
			return btnsubmit;
		}
        
        
  }
