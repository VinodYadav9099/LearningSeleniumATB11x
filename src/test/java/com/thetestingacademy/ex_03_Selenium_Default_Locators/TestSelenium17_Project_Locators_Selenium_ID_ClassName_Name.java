package com.thetestingacademy.ex_03_Selenium_Default_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_ClassName_Name {

    // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
    // Step 2 - Find the Password  and enter the 1234.
    // Step 3 - Find the Submit  and click on the button.
    // Step 4 - Wait some time.
    // Step 5 - Verify the message error message.


    @Description("Script to check invalid login on app.vwo.com, Check Error Message")
    @Owner("Vinod")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_VWO_Login_Invalid_Credentials() throws Exception{

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--Start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // data-gtm-form-interact-field-id="0"
        // > close Tag

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("vinod@gmail.com");

        // Step 2 - Find the Password  and enter the 1234.

        // 2. Find the password inputbox and enter the password

        //<input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // fdprocessedid="qo0yox">

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("1234");

        // 3. Find the submit button and click on it.
        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >


        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();


        // Step 4 - Wait some time.
        Thread.sleep(3000);


        // Step 5 - Verify the message error message.
        // <div
        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();





    }
}
