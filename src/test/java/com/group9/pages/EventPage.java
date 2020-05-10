package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EventPage extends BasePage {

    @FindBy(xpath = "//a[@data-menu='124']")
    private WebElement eventsButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButton;

    @FindBy(name = "name")
    private WebElement eventTitle;

    @FindBy(xpath = "//input[@class ='o_input ui-autocomplete-input']")
    private WebElement location;

    @FindBy(xpath = "//input [@class='o_datepicker_input o_input']" )
    private WebElement startDate;

    @FindBy(xpath = "//input [@class='o_datepicker_input o_input']")
    private WebElement endDate;

    @FindBy(xpath = "//input [@class='o_field_integer o_field_number o_field_widget o_input']")
    private WebElement minAttendees;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
    private WebElement confirm;

    public void pleaseClickEvents() {
        wait.until(ExpectedConditions.elementToBeClickable(eventsButton)).click();
        BrowserUtilities.wait(5);
    }

    public void pleaseClickButton() {
        BrowserUtilities.waitForPageToLoad(5);
        wait.until(ExpectedConditions.elementToBeClickable(createButton)).click();
    }
    public void whatIsIt(String titleValue) {
        BrowserUtilities.waitForPageToLoad(5);
        wait.until(ExpectedConditions.elementToBeClickable(eventTitle)).sendKeys(titleValue);
    }


    public void whenIsIt(String startValue) {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(startDate)).sendKeys(startValue);
    }

    public void whenIsItEnding(String endValue) {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(endDate)).sendKeys(endValue);
    }

    public void attending(String atValue) {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(minAttendees)).sendKeys(atValue);
    }
    public void clickOnConfirm(){
        wait.until(ExpectedConditions.elementToBeClickable(confirm)).click();
    }

}
