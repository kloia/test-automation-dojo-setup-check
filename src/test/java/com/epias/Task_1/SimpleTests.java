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

public class SimpleTests {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @Test
    public void myFirstTest(){
        driver.findElement(By.linkText("A/B Testing")).click();
        WebElement title = driver.findElement(By.tagName("h3"));
        String actualTitle = title.getText();
        System.out.println(actualTitle);
        Assertions.assertEquals("No A/B Test", actualTitle);
    }

    @AfterEach
    public void tearDown(){

        driver.quit();
    }

}
