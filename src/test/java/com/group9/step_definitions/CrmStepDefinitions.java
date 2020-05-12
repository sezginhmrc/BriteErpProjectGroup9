package com.group9.step_definitions;

import com.group9.pages.CrmPage;
import com.group9.utilities.BrowserUtilities;
import com.group9.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CrmStepDefinitions {

    CrmPage crmpage = new CrmPage();



    @When("user navigates to CRM module")
    public void user_navigates_to_CRM_module() {

        crmpage.navigateTo("CRM");
    }


    @Then("user verifies the page title {string}")
    public void user_verifies_the_page_title(String title) {
        System.out.println("Expected values: " + title);
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }


    @Then("user creates a new pipeline with this information:")
    public void user_creates_a_new_pipeline_with_this_information(Map<String, String> dataTable) {
        crmpage.clickOnCreatePipeline();
        crmpage.inputOpportunityTitle("Offer");

        crmpage.inputExpectedRevenue("1000");
        crmpage.clickOnCreateOpportunity();
        System.out.println("The new opportunity is created");


    }

    @Then("user creates the new column")
    public void user_creates_the_new_column() {
       crmpage.clickOnCreateColumn();
        crmpage.createNewColumn("closed");
        crmpage.clickOnAddButton();
        System.out.println("New column is created");
    }


}
