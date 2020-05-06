package com.group9.pages;

import com.group9.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {



    @FindBy (id = "login")
    private WebElement emailInput;

    @FindBy (id = "password")
    private WebElement passwordInput;


    /**
     * Function below will help you log in
     * as "sales-manager" using credentials from config.properties
     */
    public void login(){
        wait.until(ExpectedConditions.visibilityOf(emailInput)).sendKeys(ConfigurationReader.getProperty("username-salesmanager"));
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(ConfigurationReader.getProperty("password-salesmanager"), Keys.ENTER);

    }
}
