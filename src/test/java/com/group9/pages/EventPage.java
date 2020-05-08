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

    @FindBy(id = "o_field_input_174")
    private WebElement location;

    @FindBy(name = "date_begin")
    private WebElement startDate;

    @FindBy(name = "date_end")
    private WebElement endDate;

    @FindBy(name = "seats_min")
    private WebElement minAttendees;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
    private WebElement confirm;

    public void pleaseClickEvents() {
        wait.until(ExpectedConditions.elementToBeClickable(eventsButton)).click();
        BrowserUtilities.wait(20);
    }

    public void pleaseClickButton() {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(createButton)).click();
    }
    public void whatIsIt(String titleValue) {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(eventTitle)).sendKeys(titleValue);
    }

    public void whereIsIt(String locationValue) {
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(location)).sendKeys(locationValue);
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
