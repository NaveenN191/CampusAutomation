package com.campus.CampusAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");  // adjust if ID is different

    // Actions
    public void loginToCampus(String uname, String pwd) {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        btn.click();

        System.out.println("✅ Login button clicked successfully");
    }
}