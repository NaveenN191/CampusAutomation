package com.campus.CampusAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By aboutUs = By.xpath("//a[text()='About']");
    By courses = By.xpath("//a[text()='Courses']");
    By internship = By.xpath("//a[text()='Internship']");
    By contactUs = By.xpath("//a[text()='Contact']");
    By buyNow = By.xpath("//button[contains(text(),'Buy') or contains(text(),'BUY')]");
    By readMore = By.xpath("(//a[contains(text(),'Read')])[1]");
    By exploreMore = By.xpath("//a[contains(text(),'Explore')]");
    By facebook = By.xpath("//i[contains(@class,'facebook')]");
    By instagram = By.xpath("//i[contains(@class,'instagram')]");
    By linkedin = By.xpath("//i[contains(@class,'linkedin')]");

    // Actions
    public void clickAboutUs() {
        driver.findElement(aboutUs).click();
    }

    public void clickCourses() {
        driver.findElement(courses).click();
    }

    public void clickInternship() {
        driver.findElement(internship).click();
    }

    public void clickContactUs() {
        driver.findElement(contactUs).click();
    }

    public void clickBuyNow() {
        driver.findElement(buyNow).click();
    }

    public void clickReadMore() {
        driver.findElement(readMore).click();
    }

    public void clickExploreMore() {
        driver.findElement(exploreMore).click();
    }

    public void clickFacebook() {
        driver.findElement(facebook).click();
    }

    public void clickInstagram() {
        driver.findElement(instagram).click();
    }

    public void clickLinkedin() {
        driver.findElement(linkedin).click();
    }
}