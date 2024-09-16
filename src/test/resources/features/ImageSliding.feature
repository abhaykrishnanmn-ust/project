Feature: Validating image sliding functionality
  Scenario: Verify image sliding functionality
    Given user opens website
    And verify user is on homepage
    When user click on "Amazing views"
    And user clicks on the next in card image
    Then verify image displayed is second-"2"