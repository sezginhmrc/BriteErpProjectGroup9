package com.group9.pages;

import com.group9.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CrmPage extends BasePage{

    @FindBy(xpath = "//span[@class='oe_menu_text' and contains(text(),'CRM')]")
    protected WebElement crmTab;

    @FindBy(xpath = "//button[@accesskey='c' and contains(text(),'Create')]")
    protected WebElement createPipelineBtn;

    @FindBy(xpath = "//html/head/title")
    protected WebElement title;

    //@FindBy(xpath = "//input[@name='name']")
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    protected WebElement opportunityInput;

    @FindBy(xpath = "//input[@name='planned_revenue']")
    protected WebElement expectedRevenueBtn;

    @FindBy(xpath = "//button[@name='close_dialog']")
    protected WebElement createOpportunityBtn;

    @FindBy(xpath = "//div[@class='o_column_quick_create']")
    protected WebElement createColumnBtn;

    @FindBy(xpath = "//input[@class='form-control o_input']")
    protected WebElement inputCreateColumn;

    @FindBy(xpath = "//button[@class='btn btn-primary o_kanban_add']")
    protected WebElement addButton;



    public void clickOnCrmTab(){
        wait.until(ExpectedConditions.elementToBeClickable(crmTab)).click();
        BrowserUtilities.wait(3);

    }

    public void clickOnCreatePipeline(){
        BrowserUtilities.wait(5);
        wait.until(ExpectedConditions.elementToBeClickable(createPipelineBtn)).click();
        BrowserUtilities.wait(2);
    }


    public String getTitle(){
        BrowserUtilities.wait(3);
        return title.getText();
    }

    public void inputOpportunityTitle(String title){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='o_field_char o_field_widget o_input o_required_modifier']")));
        opportunityInput.sendKeys(title, Keys.ENTER);
        BrowserUtilities.wait(2);
    }

    public void inputExpectedRevenue(String revenue){
        wait.until(ExpectedConditions.elementToBeClickable(expectedRevenueBtn));
        expectedRevenueBtn.clear();
        expectedRevenueBtn.sendKeys(revenue, Keys.ENTER);
        BrowserUtilities.wait(2);


    }

   public void clickOnCreateOpportunity(){
        wait.until(ExpectedConditions.elementToBeClickable(createOpportunityBtn)).click();
        BrowserUtilities.wait(2);
   }

   public void clickOnCreateColumn(){
        BrowserUtilities.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(createColumnBtn)).click();
        BrowserUtilities.wait(2);

   }

   public void createNewColumn(String column){
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(inputCreateColumn));
        inputCreateColumn.sendKeys(column, Keys.ENTER);
        BrowserUtilities.wait(2);
   }

   public void clickOnAddButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
        BrowserUtilities.wait(2);
   }
}
