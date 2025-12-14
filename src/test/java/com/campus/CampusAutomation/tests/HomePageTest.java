package com.campus.CampusAutomation.tests;

import org.testng.annotations.Test;

import com.campus.CampusAutomation.BaseClass;
import com.campus.CampusAutomation.pages.HomePage;

public class HomePageTest extends BaseClass {

    @Test
    public void clickAllButtons() throws InterruptedException {

        HomePage hp = new HomePage(driver);

        hp.clickAboutUs();
        Thread.sleep(1000);

        hp.clickCourses();
        Thread.sleep(1000);

        hp.clickInternship();
        Thread.sleep(1000);

        hp.clickContactUs();
        Thread.sleep(1000);

        hp.clickBuyNow();
        Thread.sleep(1000);

        hp.clickReadMore();
        Thread.sleep(1000);

        hp.clickExploreMore();
        Thread.sleep(1000);

        // Social media
        hp.clickFacebook();
        Thread.sleep(1000);

        hp.clickInstagram();
        Thread.sleep(1000);

        hp.clickLinkedin();
        Thread.sleep(1000);
    }
}