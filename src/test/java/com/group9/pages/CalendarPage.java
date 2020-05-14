package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CalendarPage extends BasePage {

    @FindBy(xpath = "//button[@aria-label='list']")
    private WebElement list;

    @FindBy(css = "[accesskey=\"c\"]")
    private WebElement create;

    @FindBy(xpath = "//button[@accesskey='s']")
    private WebElement save;

    @FindBy(id = "o_field_input_187")
    private WebElement meetingSubject;

    @FindBy(id = "o_field_input_195")
    private WebElement startingAt;

    @FindBy(id = "o_field_input_197")
    private WebElement duration;

    @FindBy(id = "o_field_input_199")
    private WebElement tags;

    @FindBy(id = "o_field_input_29")
    private WebElement reminder;

    @FindBy(id = "o_field_input_201")
    private WebElement location;

    @FindBy (id = "o_field_input_32")
    private WebElement description;


    @FindBy(xpath = "(//div[@class=\"o_thread_message_content\"])[2]")
    private WebElement succesMessage;

    public void clickList() {
        wait.until(ExpectedConditions.visibilityOf(list)).click();
    }

    public void clickCreate() {
        wait.until(ExpectedConditions.visibilityOf(create)).click();
    }

    public void createCalendaerEvet(String meeting_subject, String starting_at, String duration_, String tags_, String location_,String description_) {
        wait.until(ExpectedConditions.visibilityOf(meetingSubject)).sendKeys(meeting_subject);
        wait.until(ExpectedConditions.visibilityOf(startingAt)).sendKeys(starting_at);
        wait.until(ExpectedConditions.visibilityOf(duration)).clear();
        duration.sendKeys(duration_);
        wait.until(ExpectedConditions.visibilityOf(tags)).sendKeys(tags_);
        wait.until(ExpectedConditions.visibilityOf(location)).sendKeys(location_);
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.visibilityOf(description)).sendKeys(description_);

    }
    public String succesMessageDisplayed(){
        BrowserUtilities.wait(2);
        return succesMessage.getText();
    }


    public void clickButton(String button) {
        button = button.toUpperCase();
        switch (button) {
            case "LIST":
                list.click();
                break;
            case "CREATE":
                create.click();
                break;
            case "SAVE":
                save.click();
                break;
            default:
                Assert.fail("There is no such a " + button + " avilable in swith statement");
        }
    }
}

