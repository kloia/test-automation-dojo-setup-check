package com.epias.web_element_inspection;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement element = driver.findElement(By.tagName("h1"));
        String text = element.getText();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        driver.quit();

    }
}
