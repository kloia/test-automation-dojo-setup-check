package com.epias.Task_3;

import com.epias.Task_3.pages.DropdownPage;
import com.epias.Task_3.pages.Homepage;
import com.epias.Task_3.pages.LargeDomPage;
import com.epias.utilities.ConfReader;
import com.epias.utilities.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class POMTests {
    @BeforeEach
    public void setup(){

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
    public void pomtests(){
        Homepage homepage = new Homepage();
        DropdownPage dropdown = new DropdownPage();

        homepage.clickSubmenu("Dropdown");
        dropdown.selectOption("Option 2");
    }

    @Test
    public void titleTest(){
        Homepage homepage = new Homepage();
        LargeDomPage largeDomPage = new LargeDomPage();

        homepage.clickSubmenu("Large & Deep DOM");
        largeDomPage.verifyTitle();

    }
}
