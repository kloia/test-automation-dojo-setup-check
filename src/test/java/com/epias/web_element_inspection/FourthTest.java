package com.epias.web_element_inspection;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("A/B Testing")).click();
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Add/Remove")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
