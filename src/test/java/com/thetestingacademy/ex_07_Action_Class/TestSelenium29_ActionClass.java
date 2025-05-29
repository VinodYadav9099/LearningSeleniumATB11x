package com.thetestingacademy.ex_07_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium29_ActionClass {

    @Test
    public void test_actions() {

        WebDriver driver = new EdgeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();



        WebElement firstName = driver.findElement(By.name("firstname"));

        // Keys - Action classes
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstName, "Vinod Yadav")
                .keyUp(Keys.SHIFT).build().perform();


    }
}
