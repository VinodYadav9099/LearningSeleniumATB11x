package com.thetestingacademy.ex_02_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium05_WebDriver {

    @Test
    public void test_Webdriver() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

    }


}
