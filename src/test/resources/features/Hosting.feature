Feature: Validate hosting functionality

  Background:
    Given user opens website

  Scenario: Verify hosting
    And verify user is on homepage
    When user clicks on Airbnb your home
    Then verify Airbnb your home is displayed with text
      | You could earn |

  Scenario: Verify hosting page price slider
    And verify user is on homepage
    When user clicks on Airbnb your home
    Then verify Airbnb your home is displayed with text
      | You could earn |
    When user uses slider
    Then verify the price is changing