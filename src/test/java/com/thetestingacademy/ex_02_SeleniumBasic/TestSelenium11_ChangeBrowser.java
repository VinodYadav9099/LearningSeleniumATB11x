package com.thetestingacademy.ex_02_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11_ChangeBrowser {

    @Test
    public void test_ChangeBrowser(){

        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver.quit();
    }
}
