package com.cg.amazon.beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPage {

	@FindBy(how=How.XPATH,xpath="//*[@id=\"d2ce8549\"]/span/div/div[1]/a/img")
	WebElement Product1;

	@FindBy(how=How.ID,id="add-to-cart-button")
	WebElement addToCart;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"nav-logo\"]/a[1]/span[1]")
	WebElement logo;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"ddabb9d0\"]/span/div/div[1]/a/img")
	WebElement Product2;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"result_0\"]/div/div[2]/div/a/img")
	WebElement Product2_1;
	
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"hlb-ptc-btn-native\"]")
	WebElement proceedToCheckout;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"ap_email\"]")
	WebElement mobileNumber;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"continue\"]")
	WebElement continueButton;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"ap_password\"]")
	WebElement password;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"signInSubmit\"]")
	WebElement Login;
//
//	@FindBy(how=How.XPATH,xpath="//*[@id=\"deals-shoveler-ns_RDMNENEHAEY45RGNV1WE_4829_\"]/div[2]/a[2]")
//	WebElement forwardArrow;
//	public WebElement getForwardArrow() {
//		return forwardArrow;
//	}

	public AmazonPage() {
		
	}

	public WebElement getProduct1() {
		return Product1;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	
	public WebElement getLogo() {
		return logo;
	}

	public static WebDriver getWindow(WebDriver driver) {
		driver.getWindowHandle();
		for (String with : driver.getWindowHandles()) {
			driver.switchTo().window(with);
		}
		return driver;
	}

	public WebElement getProduct2() {
		return Product2;
	}

	public WebElement getProduct2_1() {
		return Product2_1;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	
	public String getMobileNumber() {
		return this.mobileNumber.getAttribute("value");
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber.sendKeys(mobileNumber);
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public String getPassword() {
		return this.password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public WebElement getLogin() {
		return Login;
	}

	

	
}
