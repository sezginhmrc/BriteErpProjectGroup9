@Calendar_Feature
Feature: Calendar page verification
  As a Expenses manager I should be able to create meeting on Calendar Page

  Background: Opening Login Page
    Given  User is on the login page


  Scenario Outline:  authorized manager create meeting on calendar page
    When user logs in as a "expenses manager" on Login Page
    And navigates to "Calendar" module
    And manager clicks "List" button
    And  manager clicks "Create" button
    And manager provides following info
    Examples:
      |Meeting Subjet |Starting at |Duration |Tags             |Location |Description     |
      |Stand-up       |8           |1        |Costumer Meeting |New York |Group 9 Meeting |
    And manager clicks "Save" button
    Then manager verify "Event created" displayed




