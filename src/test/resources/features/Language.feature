Feature: Validate language functionality
  Scenario: Verify language option
    Given user opens website
    And verify user is on homepage
    When user clicks on global icon
    Then verify language options are displayed
    When user clicks on language
    Then verify user is on homepage
    When user clicks on global icon
    Then verify language is changed to the selected language