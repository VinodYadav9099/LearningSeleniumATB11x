package com.thetestingacademy.ex_02_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {

    @Description("Open the URL")
    @Test
    public void test_Selenium_maximize_minimize() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

//        driver.manage().window().maximize();
//        driver.manage().window().minimize();



        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        driver.quit();


    }
}
