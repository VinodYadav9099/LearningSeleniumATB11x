package com.thetestingacademy.ex_02_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium13_NoHTTP {

    @Test
    public void test_Without_Https(){

        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.close();
    }
}
