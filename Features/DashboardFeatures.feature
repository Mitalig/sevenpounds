Feature: Dashboard Functionality

  Scenario Outline: To test the Dashboard Functionality
    Given You are on Dashboard page
    And  You enter "<userName>" and "<password>"
    And  Click on Login button and Agree Button
    And  Click on Second Show
    Then Check show description is greater the 50 characters
    And  Set a reminder and then set as a favourite
    And  Go to favorites and Ensure this exact show available
    Then Remove the show and exact show not available

    Examples: 
      | userName    | password |
      | ashwink1989 | test@123 |
