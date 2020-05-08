@sales_page
Feature: Sales page verification

  Scenario: User verify that Quotations table has these headers Quotation number, Quotation Date, Customer, Salesperson, Total, Status

    Given User is on the login page
    When user logs in as a sales manager
    And navigates to Sales module
    Then user verify that table has this headers Quotation number, Quotation Date, Customer, Salesperson, Total, Status

  Scenario: User verify that after select all quotations checkbox, all quotations should be selected

    Given User is on the login page
    When user logs in as a sales manager
    And navigates to Sales module
    Then user clicks on checkbox on the header
    Then user verify that all quotations are selected

  Scenario: User verify that after one quotation selected, print and action options should be displayed

    Given User is on the login page
    When user logs in as a sales manager
    And navigates to Sales module
    Then user clicks on checkbox on the header
    Then user verify that print and action options should be displayed


