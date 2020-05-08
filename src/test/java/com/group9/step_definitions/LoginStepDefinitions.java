package com.group9.step_definitions;

import com.group9.pages.LoginPage;
import com.group9.utilities.BrowserUtilities;
import com.group9.utilities.ConfigurationReader;
import com.group9.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {


    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void User_is_on_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("url");
        System.out.println("URl : " + URL);
        Driver.getDriver().get(URL);

    }

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Login as sales manager");
        loginPage.login();
    }

    @When("User enters {string} username and {string} password")
    public void User_enters_username_and_password(String string, String string2) {
        System.out.printf("Login with user name  %s and %s password",string,string2);
        loginPage.login(string,string2);
    }
    @Then("User should verify that title is a {string}")
    public void user_should_verify_that_title_is_a(String string) {
        System.out.println("Verify that page title is: "+string);
        BrowserUtilities.wait(4);
        Assert.assertEquals(string,Driver.getDriver().getTitle());
    }

    @When("User logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
        System.out.println("Invalid username or password");
        BrowserUtilities.wait(4);
        loginPage.login("sales","pass");
    }

    @Then("User should verify that error message {string}")
    public void user_should_verify_that_error_message(String string) {
        string = "Wrong login/password";
        System.out.println("Verify that warning message Wrong login/password.");
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(3);
        Assert.assertEquals(string,loginPage.getWarningMessage());

    }
}
