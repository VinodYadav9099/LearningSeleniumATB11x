package com.thetestingacademy.ex_02_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_MiniProject2_AddExtension {

//    Practice Selenium Project #2
//            1. You need open the Youtube.com
//            2. You need add a extension which blocks the ads


    @Description("Mini Project #2 Add Extension")
    @Test
    public void test_AddExtension() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex_02_SeleniumBasic/AdBlock.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");
        driver.quit();
    }
}
