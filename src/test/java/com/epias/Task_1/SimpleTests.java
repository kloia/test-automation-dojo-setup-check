package com.epias.Task_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SimpleTests {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");

    }

    @AfterEach
    public void tearDown(){

        driver.quit();
    }

    @Test
    public void myFirstTest(){
        driver.findElement(By.linkText("A/B Testing")).click();
        WebElement title = driver.findElement(By.tagName("h3"));
        String actualTitle = title.getText();
        System.out.println(actualTitle);
        Assertions.assertEquals("No A/B Test", actualTitle);
    }

    @Test
    public void loginTest(){
        driver.findElement(By.partialLinkText("Form")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        String actualTitle = driver.findElement(By.tagName("h2")).getText();
        Assertions.assertTrue(actualTitle.equals("Secure Area"));
        Assertions.assertEquals("Secure Area", actualTitle);
        WebElement logoutButton = driver.findElement(By.className("radius"));
        Assertions.assertTrue(logoutButton.isDisplayed());

    }

    @Test
    public void logoutTest(){
        driver.findElement(By.partialLinkText("Form")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.linkText("Logout")).click();
        String actualTitle = driver.findElement(By.id("flash")).getText();
        Assertions.assertTrue(actualTitle.contains("You logged out of the secure area!"));

        Assertions.assertEquals("You logged out of the secure area!\n" +
                "×", actualTitle);
    }

    @Test
    public void waitTest() {

        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 2:")).click();
        driver.findElement(By.tagName("button")).click();

        String text = driver.findElement(By.cssSelector("#finish>h4")).getText();
        Assertions.assertEquals("Hello World!", text);
    }

    @Test
    public void waitTest2(){
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 1:")).click();
        driver.findElement(By.tagName("button")).click();
        WebElement loadingIcon = driver.findElement(By.id("loading"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(loadingIcon));

        String text = driver.findElement(By.cssSelector("#finish>h4")).getText();
        Assertions.assertEquals("Hello World!", text);
    }



}
