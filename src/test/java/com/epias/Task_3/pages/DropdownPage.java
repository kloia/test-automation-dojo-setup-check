package com.epias.Task_3.pages;

import com.epias.utilities.Driver;
import com.epias.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    public DropdownPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "dropdown")
    public WebElement dropdownList;



    public void selectOption(String option){
        /* dropdownList.click();
        ////option[text()='Option 2']
        String optionXpath = "//option[text()='" + option + "']";
        Driver.get().findElement(By.xpath(optionXpath)).click();
       */

        Select select = new Select(dropdownList);
        select.selectByVisibleText(option);



        Utils.waitFor(3);
    }
}
