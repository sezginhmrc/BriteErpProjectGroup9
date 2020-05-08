@pricelist
Feature: Adding price lists as Scenario Outline

  Scenario Outline: Create pricelists and verify that they are displayed

    Given User is on the login page
    When user logs in as a sales manager
    And navigates to "<module>" module
    Then user clicks on pricelists
    And user provides "<name>" and "<E-commerce Promotional Code>" for new pricelist and saves
    When user clicks on pricelists
    Then "<newRetailers>" should be displayed

    Examples:
      | module | name          | E-commerce Promotional Code | newRetailers  |
      | Sales  | USD Retailers | 1234                        | USD Retailers |
      | Sales  | Costco        | 505                         | Costco        |
      | Sales  | Marshalls     | 1010                        | Marshalls     |
