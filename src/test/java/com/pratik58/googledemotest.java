package com.pratik58;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googledemotest {

    private WebDriver driver;

    @Test(priority = 0)
    public void testjbkTitle() throws InterruptedException {
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        Thread.sleep(5000);
        System.out.println(title);
        Assert.assertEquals(title, "Google");
        Thread.sleep(5000);
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    
}
