package com.thetestingacademy.ex_02_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium14_Close_Quit {

    @Test
    public void test_Quit_VS_Close() throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


//        Thread.sleep(5000);
//        driver.close();

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null


        Thread.sleep(5000);

        driver.quit();
        // It will close all the tabs. - session id == null
    }

}
