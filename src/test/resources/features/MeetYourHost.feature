Feature: Validating meet your host feature

  Scenario: Verify user is getting the correct host information
    Given user opens website
    And verify user is on homepage
    When user click on "Amazing views"
    And user selects first card
    And user selects Meet your Host option
    Then verify displayed details with the host details