package com.cg.amazon.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.amazon.beans.AmazonPage;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDefinition {
	private WebDriver driver;
	private AmazonPage page;

	@Before
	public void setUpEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Saisree Mukka\\chromedriver.exe");
	}

	@Given("^User access the amazon page in chrome$")
	public void user_access_the_amazon_page_in_chrome() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		page = new AmazonPage();
		PageFactory.initElements(driver, page);
	}

	@When("^User chooses produts$")
	public void user_chooses_produts() throws Throwable {
		page.getProduct1().click();
		AmazonPage.getWindow(driver);
		page.getAddToCart().click();
		page.getLogo().click();

		page.getProduct2().click();
		page.getProduct2_1().click();
		AmazonPage.getWindow(driver);
		page.getAddToCart().click();
		AmazonPage.getWindow(driver);
	}

	@When("^User Proceeds to checkOut$")
	public void user_Proceeds_to_checkOut() throws Throwable {
		AmazonPage.getWindow(driver);
		page.getProceedToCheckout().click();
	}

	@When("^User Enters his credentials$")
	public void user_Enters_his_credentials() throws Throwable {
		page.setMobileNumber("9640178686");
		page.getContinueButton().click();
		page.setPassword("saisree@169");
		page.getLogin().click();
	}

	@Then("^User should Proceed to ShipmentPage$")
	public void user_should_Proceed_to_ShipmentPage() throws Throwable {

	}
}
