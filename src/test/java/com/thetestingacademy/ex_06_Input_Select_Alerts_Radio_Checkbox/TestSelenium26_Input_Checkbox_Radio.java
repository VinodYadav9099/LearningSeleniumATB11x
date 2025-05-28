package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium26_Input_Checkbox_Radio {

    @Description("To Check how to select Check box and Radio Box")
    @Test
    public void test_Radio_CheckBox() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();

        Thread.sleep(5000);
        driver.quit();


    }
}
