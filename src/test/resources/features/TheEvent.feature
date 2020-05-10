@event
  Feature: Annual company event

    Scenario Outline: Create and post the event

      Given User is on the login page
      When user logs in as a event manager
      And navigates to "<modules>" module
      Then user clicks on events
      # above should be user clicks on CREATE . I think you do not have location for create button..it cannot go enter below info
      And user provides "<Event Name>", "<Location>", "<Start Date>", "<End Date>", and "<Minimum Attendees>" and clicks on confirm event

      Examples:
       |modules |Event Name        |Location |Start Date |End Date  |Minimum Attendees|
       |Events  |Annual Conference |Boston   |06/06/2020 |06/08/2020|2300             |


