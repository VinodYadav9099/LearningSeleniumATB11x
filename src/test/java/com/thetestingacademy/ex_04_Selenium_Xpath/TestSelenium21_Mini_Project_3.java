package com.thetestingacademy.ex_04_Selenium_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_Mini_Project_3 {

    @Owner("Vinod")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_Katalon_login() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_apnt_btn = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        make_apnt_btn.click();
        Thread.sleep(5000);

        List<WebElement> user_name_inputbox = driver.findElements(By.xpath("//input[@placeholder=\"Username\"]"));
        user_name_inputbox.get(1).sendKeys("John Doe");


        List<WebElement> user_pswd_inputbox = driver.findElements(By.xpath("//input[@placeholder=\"Password\"]"));
        user_pswd_inputbox.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_button.click();

        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");


        driver.quit();


    }

}
