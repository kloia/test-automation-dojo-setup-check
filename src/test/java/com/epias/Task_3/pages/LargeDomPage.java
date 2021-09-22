package com.epias.Task_3.pages;

import com.epias.utilities.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LargeDomPage {
    public LargeDomPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(tagName = "h3")
    public WebElement title;


    public void verifyTitle(){
        Assertions.assertEquals("Large & Deep DOM", title.getText());
    }
}
