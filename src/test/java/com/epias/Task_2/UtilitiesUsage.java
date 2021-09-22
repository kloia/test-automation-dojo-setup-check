package com.epias.Task_2;

import com.epias.utilities.ConfReader;
import com.epias.utilities.Driver;
import com.epias.utilities.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UtilitiesUsage {
    @BeforeEach
    public void setup(){
        Driver.get();
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ConfReader.get("url");
        Driver.get().get(url);

    }

    @AfterEach
    public void tearDown(){

        Driver.close();
    }

    @Test
    public void setupTest(){
        Driver.get().findElement(By.linkText("A/B Testing")).click();
        Utils.waitFor(10);
    }

}
