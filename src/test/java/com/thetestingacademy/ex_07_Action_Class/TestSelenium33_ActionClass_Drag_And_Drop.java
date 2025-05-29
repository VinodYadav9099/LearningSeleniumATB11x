package com.thetestingacademy.ex_07_Action_Class;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium33_ActionClass_Drag_And_Drop extends CommonToAll {

    @Test
    public void test_File_Drag_And_Drop(){

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // Source , Destination
        //  from and to
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();

    }
}
