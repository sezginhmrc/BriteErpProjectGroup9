package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import com.group9.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    /**
     * Method below is for navigation. Provide module name you want to navigate
     * @param module like : Calendar/ CRM/ Website etc.
     */
    public void navigateTo(String module){
        String moduleXpath = "//span[@class='oe_menu_text' and contains(text(),'" + module +"')]";
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));

        Actions actions = new Actions (driver);
        BrowserUtilities.wait(4);
        actions.moveToElement(moduleElement).
                pause(2000).
                click().build().perform();

        BrowserUtilities.wait(5);
    }


}