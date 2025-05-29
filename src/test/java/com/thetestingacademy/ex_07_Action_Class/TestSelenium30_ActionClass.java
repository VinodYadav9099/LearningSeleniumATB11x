package com.thetestingacademy.ex_07_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium30_ActionClass {

    @Test
    public void test_actions() {

        WebDriver driver = new EdgeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);

        // move to Element
        // click
        // sendKeys

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

    }
}
