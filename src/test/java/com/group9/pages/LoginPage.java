package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import com.group9.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {



    @FindBy(id = "login")
    private WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    private WebElement warningMessage;


    public String getWarningMessage(){
        BrowserUtilities.waitForPageToLoad(6);
        wait.until(ExpectedConditions.visibilityOf(warningMessage));
        BrowserUtilities.wait(4);
        return warningMessage.getText().trim();
    }

    public void login(String usernameValue, String passwordValue){
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        email.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
        loginButton.click();
    }

    public void login(){
        wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
        email.sendKeys(ConfigurationReader.getProperty("username-salesmanager"));
        password.sendKeys(ConfigurationReader.getProperty("password-salesmanager"));
        loginButton.click();
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.waitForPageToLoad(3);
    }

    public void role(String role){
        String userName="";
        String password="";
        if(role.equalsIgnoreCase("sales manager")){
            userName="salesmanager40@info.com";
            password="salesmanager";
        }else if(role.equalsIgnoreCase("expenses manager")) {
            userName = "expensesmanager50@info.com";
            password = "expensesmanager";
        }else if(role.equalsIgnoreCase("event manager")) {
            userName = "eventscrmmanager44@info.com";
            password = "eventscrmmanager";
        } else {
            throw new RuntimeException("invalid role!");
        }
        System.out.println("Login as "+role);
    }
}
