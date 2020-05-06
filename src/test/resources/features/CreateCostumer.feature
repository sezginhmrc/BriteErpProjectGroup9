
@create
  Feature: Sales


    Scenario: Create Sales Order
      Given User is on the login page
      When User enters "salesmanager40@info.com" username and "salesmanager" password
      Then User should verify that title is a "#Inbox - Odoo"
      Then User navigate to Sales and Costumers
      And User clicks on create button
      Then User creates a order with following info:
      |Name         |Street          |City         |Zipcode|Email             |
      |Jayne Doe    | 68 Main street | Springfield |01001  |jayne_doe@mail.com|
      Then User click save button






