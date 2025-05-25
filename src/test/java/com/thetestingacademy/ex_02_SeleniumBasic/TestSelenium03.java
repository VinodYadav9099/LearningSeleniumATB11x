package com.thetestingacademy.ex_02_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Difference B/W the Selenium 3 and 4")
    @Test
    public void test_Selenium03() {

    // Selenium 3
        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");


    // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");


    }

}
