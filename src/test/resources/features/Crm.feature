@crm
Feature: Creating new pipeline

  Scenario: Create new pipeline and verify displayed information
    Given User is on the login page
    When User enters "eventscrmmanager44@info.com" username and "eventscrmmanager" password
    And user navigates to CRM module
    Then user verifies the page title "Pipeline - Odoo"

    And user creates a new pipeline with this information:
    |Opportunity Title|Expected Revenue|
    |Offer           |1000            |

    Then user creates the new column










