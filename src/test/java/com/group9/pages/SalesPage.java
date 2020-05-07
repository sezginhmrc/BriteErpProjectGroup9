package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SalesPage extends BasePage{

    @FindBy (xpath = "//a[@data-menu='466']")
    private WebElement pricelistsButton;

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    private WebElement createButton;

    @FindBy (css = "[class^='o_field_char o_field_widget o_input o']")
    private WebElement nameInput;

    @FindBy (css = "input[name='code']")
    private WebElement promoCodeInput;

    @FindBy (xpath = "//button[@accesskey='s']")
    private WebElement saveButton;


    public void clickOnPriceList(){
        wait.until(ExpectedConditions.elementToBeClickable(pricelistsButton)).click();
        BrowserUtilities.wait(2);
    }

    public void clickOnCreateButton(){
        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(createButton)).click();
    }

    public void providePricelistName(String input){
        wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(input);
    }

    public void providePromoCode(String code){
        wait.until(ExpectedConditions.visibilityOf(promoCodeInput)).sendKeys(code);
    }

    public void clickOnSave(){
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }


    /**
     *
     * @param nameProvidedByUs is the name displayed on the page
     * @return
     */
    public String getCurrentPricelistName(String nameProvidedByUs){
        WebElement priceListName = driver.findElement(By.xpath("//table//td[contains(text(),'"+ nameProvidedByUs +"')]"));
        return priceListName.getText();
    }

}
