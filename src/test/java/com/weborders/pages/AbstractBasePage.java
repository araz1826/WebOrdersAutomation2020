package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//meanst to be extended
public abstract class AbstractBasePage {

    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,20);

    public AbstractBasePage(){ // created constructor
        // this line is always run when we create an object
        PageFactory.initElements(Driver.getDriver(),this);  // we need this for FindBy anotations
    }
}
