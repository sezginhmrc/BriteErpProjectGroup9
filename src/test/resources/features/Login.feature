@login
  Feature: Login


    Background: open login page
      Given user is on the login page

    @salesmanager
    Scenario:Login with valid username and password
      When User enters "salesmanager40@info.com" username and "salesmanager" password
      Then User should verify that title is a "#Inbox - Odoo"

    @expensesmanager
    Scenario:Login with valid username and password
      When User enters "expensesmanager50@info.com" username and "expensesmanager" password
      Then User should verify that title is a "#Inbox - Odoo"

      @eventmanager

      Scenario:Login with valid username and password
        When User enters "eventscrmmanager44@info.com" username and "eventscrmmanager" password
        Then User should verify that title is a "#Inbox - Odoo"


    @negative_scenario
    Scenario:Login with invalid username and password
      When User logs in with invalid credentials
      Then User should verify that error message "Wrong login/password."

    @scenario_outline
    Scenario Outline: User names test
      When User enters "<username>" username and "<password>" password


      Examples: credentials
        | username                   | password        |
        | salesmanager40@info.com    | salesmanager    |
        | salesmanager41@info.com    | salesmanager    |
        | salesmanager42@info.com    | salesmanager    |
        | salesmanager43@info.com    | salesmanager    |
        | salesmanager44@info.com    | salesmanager    |
        |expensesmanager50@info.com  | expensesmanager |
        |expensesmanager51@info.com  | expensesmanager |
        |expensesmanager52@info.com  | expensesmanager |
        |expensesmanager53@info.com  | expensesmanager |
        |expensesmanager54@info.com  | expensesmanager |
        |eventscrmmanager44@info.com | eventscrmmanager|

