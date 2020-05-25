package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//meanst to be extended
public abstract class AbstractBasePage {

    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,20);

    @FindBy (tagName = "h1")
    protected WebElement pageLogo;  // since it is common put under base

    @FindBy (tagName = "h2")  //h2 is common for all susbtile
    protected WebElement pageSubtitle;

    public String getPageSubtitle(){
        BrowserUtilities.waitForPageToLoad(10);
        return pageSubtitle.getText().trim();
    }


    public String getPageLogoText(){

        return pageLogo.getText();
    }

    public AbstractBasePage(){ // created constructor
        // this line is always run when we create an object
        PageFactory.initElements(Driver.getDriver(),this);  // we need this for FindBy anotations
    }

    public void navigateTo(String component){
        String locator="//a[text()='"+component+"']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
    }


}
