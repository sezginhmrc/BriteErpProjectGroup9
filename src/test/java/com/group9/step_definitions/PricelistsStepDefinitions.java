package com.group9.step_definitions;

import com.group9.pages.SalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class PricelistsStepDefinitions {


    SalesPage salesPage = new SalesPage();

    @When("navigates to {string} module")
    public void navigates_to_module(String module) {
        salesPage.navigateTo(module);
    }

    @Then("user clicks on pricelists")
    public void user_clicks_on_pricelists() {
        salesPage.clickOnPriceList();
    }

    @Then("user provides {string} and {string} for new pricelist and saves")
    public void user_provides_and_for_new_pricelist_and_saves(String name, String commercialCode) {
       salesPage.clickOnCreateButton();
       salesPage.providePricelistName(name);
       salesPage.providePromoCode(commercialCode);
       salesPage.clickOnSave();
    }


    @Then("{string} should be displayed")
    public void should_be_displayed(String stringExpected) {
        System.out.println("String expected from scenario outline:" + stringExpected);
        String actual = salesPage.getCurrentPricelistName(stringExpected);
        //above needs a revision
        Assert.assertEquals(actual,stringExpected);
    }


}
