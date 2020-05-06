package com.group9.step_definitions;

import com.group9.pages.CreateCostumerBasePage;
import com.group9.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateCostumerStepDefinition {

    CreateCostumerBasePage createCostumerBasePage=new CreateCostumerBasePage();

    @Then("User navigate to Sales and Costumers")
    public void user_navigate_to_Sales_and_Costumers() {
        BrowserUtilities.wait(4);
        createCostumerBasePage.navigateTo();
    }

    @Then("User clicks on create button")
    public void user_clicks_on_create_button() {
        BrowserUtilities.wait(3);
        createCostumerBasePage.createClick();
    }

    @Then("User creates a order with following info:")
    public void user_creates_a_order_with_following_info(List<Map<String,String>> dataTable) {
        Map<String ,String> values= dataTable.get(0);
        createCostumerBasePage.enterAdressInformation(values.get("Name"),values.get("Street"),
                values.get("City"),
                values.get("Zipcode"),
                values.get("Email"));
    }
    @Then("User click save button")
    public void user_click_save_button() {
            BrowserUtilities.wait(5);
            createCostumerBasePage.saveClick();
    }

}
