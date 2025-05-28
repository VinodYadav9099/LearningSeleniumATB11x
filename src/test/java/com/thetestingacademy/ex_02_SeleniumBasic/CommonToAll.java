package com.thetestingacademy.ex_02_SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll {

        public EdgeDriver driver;

        public void openBrowser(WebDriver driver, String url) {
            driver.get(url);
            driver.manage().window().maximize();
        }

        public void closeBrowser(WebDriver driver) {
            driver.quit();
        }

    public void waitForVisibility(WebDriver driver, int timeInSeconds,String xpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
