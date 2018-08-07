package com.cg.amazon.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.amazon.beans.AmazonPage;
public class AmazonWebDriverDemo {
	
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Saisree Mukka\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();

			AmazonPage page = new AmazonPage();
			PageFactory.initElements(driver, page);
			
			//Product1
			page.getProduct1().click();
			AmazonPage.getWindow(driver);
			page.getAddToCart().click();
			page.getLogo().click();
			
			
			//product2
			page.getProduct2().click();
			page.getProduct2_1().click();
			AmazonPage.getWindow(driver);
			page.getAddToCart().click();
			AmazonPage.getWindow(driver);
			page.getProceedToCheckout().click();
			
			page.setMobileNumber("9640178686");
			page.getContinueButton().click();
			page.setPassword("saisree@169");
			page.getLogin().click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
