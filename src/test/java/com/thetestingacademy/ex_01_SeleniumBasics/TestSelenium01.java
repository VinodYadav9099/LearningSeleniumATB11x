package com.thetestingacademy.ex_01_SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


    @Test
    public void test_VWOLoginPage(){

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://app.vwo.com");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.quit();



    }
}
