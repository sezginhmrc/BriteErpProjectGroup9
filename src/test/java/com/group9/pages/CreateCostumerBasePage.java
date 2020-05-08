package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateCostumerBasePage extends BasePage{

    @FindBy(xpath = "(//a[@class='oe_menu_toggler']//span)[3]")
    private WebElement sales;
    @FindBy(xpath = "(//span[contains (text(), 'Customers')])[2]")
    private WebElement customers;
    @FindBy(xpath = "//button[contains (text(), 'Create')]")
    private WebElement create;
    @FindBy(name = "name")
    private WebElement nameInput;
    @FindBy(name = "street")
    private WebElement streetInput;
    @FindBy(name="city")
    private WebElement cityInput;
    @FindBy(name = "zip")
    private WebElement zipCodeInput;
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    private WebElement save;

    public void navigateTo(){
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(3);
        sales.click();
        customers.click();
    }
    public void createClick(){
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(3);
        create.click();
    }
    public void enterAdressInformation(String name, String street, String city, String zip,String email){
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.visibilityOf(nameInput));
        nameInput.sendKeys(name);
        streetInput.sendKeys(street);
        cityInput.sendKeys(city);
        zipCodeInput.sendKeys(zip);
        emailInput.sendKeys(email);
        System.out.println(":::Enter address information");
        System.out.println("Enter street: "+street);
        System.out.println("Enter city: "+city);
        System.out.println("Enter zip: "+zip);
        System.out.println("Enter email: "+email);
    }
    public void saveClick(){
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(3);
        save.click();
    }

}
