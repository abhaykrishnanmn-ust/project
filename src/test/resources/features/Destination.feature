Feature: Validate stays functionalities

  Scenario: Verify searching destination functionality
    Given user opens website
    When user clicks on where
    Then user selects destination by "region"
    And  select check in and check out date
    And  select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects first card
    Then verify displayed details with the input details