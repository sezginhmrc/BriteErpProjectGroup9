package com.group9.step_definitions;

import com.group9.pages.SalesPage;
import com.group9.utilities.BrowserUtilities;
import com.group9.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.DataFormatReaders;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class SalesStepDefinitions {

    SalesPage salesPage=new SalesPage();

    @When("navigates to Sales module")
    public void navigates_to_Sales_module() {
        BrowserUtilities.waitForPageToLoad(10);
        salesPage.navigateTo("Sales");
    }

    @Then("user verify that table has this headers Quotation number, Quotation Date, Customer, Salesperson, Total, Status")
    public void user_verify_that_table_has_this_headers_Quotation_number_Quotation_Date_Customer_Salesperson_Total_Status() {
        List<String> expected= Arrays.asList("Quotation Number", "Quotation Date", "Customer", "Salesperson", "Total", "Status");
        Assert.assertEquals(expected,salesPage.getTableHeaders());

    }

    @Then("user clicks on checkbox on the header")
    public void user_clicks_on_checkbox_on_the_header() {
        BrowserUtilities.waitForPageToLoad(10);
        salesPage.clickSelectAllCheckbox();
        BrowserUtilities.wait(2);
    }

    @Then("user verify that all quotations are selected")
    public void user_verify_that_all_quotations_are_selected() {
        List<WebElement> checkboxes= Driver.getDriver().findElements(By.cssSelector("input[type='checkbox']"));

        boolean chckbox=false;
        for (WebElement checkbox:checkboxes) {
            if (checkbox.isSelected()) {
                chckbox=true;
            }
        }
        Assert.assertTrue(chckbox);
    }

    @Then("user verify that print and action options should be displayed")
    public void user_verify_that_print_and_action_options_should_be_displayed() {
        BrowserUtilities.waitForPageToLoad(10);
        Assert.assertTrue(salesPage.getPrintOption().isDisplayed());
        Assert.assertTrue(salesPage.getActionOption().isDisplayed());
    }
}
