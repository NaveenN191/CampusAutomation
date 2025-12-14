package com.campus.CampusAutomation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.campus.CampusAutomation.BaseClass;
import com.campus.CampusAutomation.pages.HomePage;



public class HomePageTest extends BaseClass {

	@Test
	public void clickAllButtons() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    try {
	        Thread.sleep(2000); // wait for UI to settle
	        WebElement aboutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//button[@aria-label='About Us']")));
	        aboutLink.click();
	        System.out.println("✅ Successfully clicked on 'About' link");
	    } catch (TimeoutException e) {
	        System.out.println("❌ Test failed: Element not found or clickable within 15 seconds");
	        Assert.fail("Test failed: Element not found - 'About' link");
	    }
	}
}