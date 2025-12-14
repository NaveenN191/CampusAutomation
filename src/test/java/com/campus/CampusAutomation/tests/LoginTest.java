package com.campus.CampusAutomation.tests;

import org.testng.annotations.Test;
import com.campus.CampusAutomation.BaseClass;
import com.campus.CampusAutomation.pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void verifyLogin() {
        // Open login page
        driver.get("http://3.108.179.14:8081/superadmin/login.html?error=true");

        // Use LoginPage object
        LoginPage lp = new LoginPage(driver);
        lp.loginToCampus("admin", "admin123");

        System.out.println("✅ Login test executed successfully");
    }
}