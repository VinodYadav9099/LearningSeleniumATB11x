package com.thetestingacademy.ex_02_SeleniumBasic;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10_MiniProject_Selenium extends CommonToAll {

    @Description
    @Test
    public void test_MiniProject(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");


        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println(driver.getTitle());
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("CURA Healthcare Service text is not visible");
            //throw new Exception("CURA Healthcare Service text is not visible");
        }

        closeBrowser(driver);
    }
}
