package com.epias.Task_3.pages;

import com.epias.utilities.Driver;
import org.openqa.selenium.By;

public class Homepage {

    public void clickSubmenu(String submenu){
        Driver.get().findElement(By.linkText(submenu)).click();
    }
}
