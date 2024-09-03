Feature: Validate currency functionality

  Scenario: Verify currency
    Given user opens website
    And verify user is on homepage
    When user clicks on global icon
    And user selects currency
    Then verify currency options are displayed
    And select the currency
    Then verify currency is changed to the selected currency