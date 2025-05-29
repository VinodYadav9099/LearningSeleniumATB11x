package com.thetestingacademy.ex_07_Action_Class;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium32_ActionClass_Pageup_pagedown extends CommonToAll {

    @Test
    public void test_page_up_page_down(){

        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();
       // waitForJVM(10000);

    }

}
