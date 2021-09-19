package com.pratik58;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class devpro {

    private WebDriver driver;

//    @Test(priority = 0)
//    public void firstBox() throws InterruptedException {
//        driver.get("https://nodejs.dev/learn");
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals(title, "Introduction to Node.js");
//
//        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        Thread.sleep(3000);
//        js.executeScript("window.scrollBy(0,3010)");
//
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(".material-icons:nth-child(3)")).click();

//        WebElement searchIcon = driver.findElement(By.cssSelector("#jump-to-suggestion-search-global .jump-to-suggestion-name"));
//        searchIcon.click();
//
//        WebElement searchEleOne = driver.findElement(By.cssSelector(".menu-item:nth-child(2)"));
//        searchEleOne.click();
//
//        WebElement searchEleTwo = driver.findElement(By.cssSelector(".menu-item:nth-child(3)"));
//        searchEleTwo.click();
//
//        WebElement searchEleThree = driver.findElement(By.cssSelector(".menu-item:nth-child(1)"));
//        searchEleThree.click();
//
//        WebElement searchPython = driver.findElement(By.linkText("python"));
//        searchPython.click();

//    }

    @Test(priority = 0)
    public void firstBox() {
        driver.get("https://nodejs.dev/learn");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Introduction to Node.js");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void secondBox() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,3010)");
    }

    @Test(priority = 2)
    public void thirdBox() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".material-icons:nth-child(3)")).click();
    }

    @Test(priority = 3)
    public void fourthBox() throws InterruptedException {
        WebElement community = driver.findElement(By.linkText("Community"));
        community.click();
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,152)");
    }

    @Test(priority = 4)
    public void fifthBox() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,687)");
    }

    @Test(priority = 5)
    public void sixthBox() throws InterruptedException {
        WebElement releases = driver.findElement(By.id("link-releases"));
        releases.click();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,152)");
    }

    @Test(priority = 6)
    public void seventhBox() throws InterruptedException {
        Thread.sleep(1500);
        WebElement about = driver.findElement(By.id("link-about"));
        about.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,893)");
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void eightBox() throws InterruptedException {
        driver.findElement(By.cssSelector(".material-icons:nth-child(2)")).click();
        Thread.sleep(3000);
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
