package com.group9.step_definitions;

import com.group9.pages.LoginPage;
import com.group9.utilities.ConfigurationReader;
import com.group9.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {


    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Login page");
        String URL = ConfigurationReader.getProperty("url");
        System.out.println("URl : " + URL);
        Driver.getDriver().get(URL);

    }

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Login as sales manager");
        loginPage.login();
    }


}
