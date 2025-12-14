package com.campus.CampusAutomation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.campus.CampusAutomation.BaseClass;
import com.campus.CampusAutomation.pages.HomePage;

import io.netty.handler.timeout.TimeoutException;

public class HomePageTest extends BaseClass {

	@Test
	public void clickAllButtons() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    try {
	        // Wait for the 'About' link to be visible and clickable
	     WebElement aboutLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'About')]")));
	        aboutLink.click();
	        System.out.println("✅ Successfully clicked on 'About' link");
	    } catch (TimeoutException e) {
	        System.out.println("❌ Element not found: 'About' link not visible or clickable within 15 seconds");
	        Assert.fail("Test failed: Element not found - 'About' link");
	    }
	}
}