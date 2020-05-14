package com.group9.step_definitions;

import com.group9.pages.CalendarPage;
import com.group9.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateCalendarStep_Definitions {

    LoginPage loginPage = new LoginPage();
    CalendarPage calendarPage = new CalendarPage();

    @When("user logs in as a {string} on Login Page")
    public void user_logs_in_as_a_on_Login_Page(String expensesManager) {
            if(expensesManager.equalsIgnoreCase("expenses manager")){
                loginPage.login("expensespanager50@info.com","expensesmanager");
            } else {
                Assert.fail("No Such a "+expensesManager+" has permission to acces");
            }
    }

    @When("manager clicks {string} button")
    public void manager_clicks_button(String string) {
            calendarPage.clickButton(string);
    }

    @When("manager provides following info")
    public void manager_provides_following_info(List<Map<String, String>> dataTable) {
       calendarPage.createCalendaerEvet(dataTable.get(0).get("Meeting Subjet"),dataTable.get(0).get("Starting at"),dataTable.get(0).get("Duration"),dataTable.get(0).get("Tags"),dataTable.get(0).get("Location"),dataTable.get(0).get("Description"));

    }



    @Then("manager verify {string} displayed")
    public void manager_verify_displayed(String string) {
      Assert.assertEquals(string,calendarPage.succesMessageDisplayed());
    }

}
