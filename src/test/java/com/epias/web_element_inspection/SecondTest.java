package com.epias.web_element_inspection;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("selcuk@kloia.com");
        Thread.sleep(2000);
        driver.quit();
    }
}
