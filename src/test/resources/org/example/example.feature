Feature: Alert FLow

  Scenario: Verify working of Alert flow
    Given user is in the App Alert screen
    When user clicks on Ok Cancel button
    When user clicks on Cancel button
    When user gets into Accounts screen
    Then alert box is closed
