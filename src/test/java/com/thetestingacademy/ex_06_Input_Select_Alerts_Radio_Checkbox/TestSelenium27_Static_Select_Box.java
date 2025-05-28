package com.thetestingacademy.ex_06_Input_Select_Alerts_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium27_Static_Select_Box {

    @Description("To Check how to Static Select Box")
    @Test
    public void test_Static_SelectBox() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
        //select.selectByIndex(2);
        //select.selectByValue("1");
        select.selectByIndex(1);


    }
}
