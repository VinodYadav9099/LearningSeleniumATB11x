package com.thetestingacademy.ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_Waits {

    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price() {

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://app.vwo.com");
        driver.quit();


    }
}
