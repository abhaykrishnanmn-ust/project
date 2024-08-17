Feature: Validate Destination functionality

  Scenario: Check for where to
    Given user opens website
    When user clicks on where
    Then user selects destination
    And curresponding location is selected
    Then date is selected
    And number of people is selected
    Then first card is selected
    When details are checked
    Then verify with the deatils given for booking with details in the page