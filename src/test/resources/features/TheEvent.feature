@event
  Feature: Annual company event

    Scenario Outline: Create and post the event

      Given user is on the login page
      When user logs in as a event manager
      And navigates to "<module>" module
      Then user clicks on events
      And user provides "<Event Name>", "<Location>", "<Start Date>", "<End Date>", and "<Minimum Attendees>" and clicks on confirm event

      Examples:
       |module |Event Name        |Location |Start Date |End Date  |Minimum Attendees|
       |Events |Annual Conference |Boston   |06/06/2020 |06/08/2020|2300             |


