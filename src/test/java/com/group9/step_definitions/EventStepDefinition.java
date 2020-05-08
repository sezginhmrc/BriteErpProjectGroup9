package com.group9.step_definitions;

import com.group9.pages.EventPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventStepDefinition {

    EventPage eventPage = new EventPage();

    @When("navigates to {string} module")
    public void navigates_to_module(String module) {
        eventPage.navigateTo(module);
    }

    @Then("user clicks on events")
    public void user_clicks_on_event() {
        eventPage.pleaseClickEvents();
    }

    @Then("user provides {string}, {string}, {string}, {string}, and {string} and clicks on confirm event")
    public void user_types_event_info(String eventName, String location, String date, String endDate, String minimumAttendees) {
        eventPage.pleaseClickButton();
        eventPage.whatIsIt(eventName);
        eventPage.whereIsIt(location);
        eventPage.whenIsIt(date);
        eventPage.whenIsItEnding(endDate);
        eventPage.attending(minimumAttendees);
        eventPage.clickOnConfirm();
    }


}
