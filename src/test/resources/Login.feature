@login
  Feature: Login


    Background: open login page
      Given user is on the login page

      @positive_scenario
    Scenario:Login with valid username and password
      When user logs in with valid credentials
      Then User should verify that title is a "#Inbox - Odoo"

      @negative_scenario
    Scenario:Login with invalid username and password
      When User logs in with invalid credentials
      Then User should verify that error message "Wrong login/password."

