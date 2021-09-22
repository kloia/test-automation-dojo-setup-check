package com.epias.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
