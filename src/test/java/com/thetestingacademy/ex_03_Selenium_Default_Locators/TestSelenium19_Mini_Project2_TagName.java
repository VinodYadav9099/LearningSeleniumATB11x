package com.thetestingacademy.ex_03_Selenium_Default_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_Mini_Project2_TagName {

    @Owner("Vinod")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void test_vwo_free_trail_error_verify() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email_input = driver.findElement(By.id("page-v1-step1-email"));
        email_input.sendKeys("abc");

        WebElement check_box_policy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        check_box_policy.click();

        WebElement submit_button = driver.findElement(By.tagName("button"));
        submit_button.click();

        Thread.sleep(3000);


        // C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason


        WebElement error_messg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_messg.getText(), "The email address you entered is incorrect.");

        driver.quit();

    }

}
