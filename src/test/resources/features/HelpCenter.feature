Feature: Validating help center feature

  Scenario: Verify user is able to use help centre option
    Given user opens website
    And verify user is on homepage
    And user clicks on profile icon
    When user clicks on the help centre option
    Then verify help centre page is displayed with text
      | Hi, how can we help |