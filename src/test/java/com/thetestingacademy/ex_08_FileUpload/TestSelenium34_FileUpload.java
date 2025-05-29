package com.thetestingacademy.ex_08_FileUpload;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSelenium34_FileUpload extends CommonToAll {

    @Description("This is file upload code")
    @Owner("Vinod")
    @Test
    public void test_File_Upload() {

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        driver.manage().window().maximize();

        String working_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearnSeleniumATB11x


        String path_file = working_dir + "/src/test/java/com/thetestingacademy/Data.txt";

        uploadFileInput.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();


    }

}
