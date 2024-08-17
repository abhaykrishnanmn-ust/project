Feature: Validate stays functionalities

  Scenario: Verify searching destination functionality
    Given user opens website
    When user clicks on where
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects first card
    Then verify displayed details with the input details

  Scenario: Verify searching destination for Experiences
    Given user opens website
    When user clicks on experiences
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects first card
    Then verify displayed details with the input details

  Scenario: Verify farm option has farm in description
    Given user opens website
    When user clicks on farm
    And user clicks on search button
    Then user selects first card
    Then verify farm description contains "farm" in it

  Scenario: Verify filter option
    Given user opens website
    When user clicks on filter
    Then user selects filter by Entire home
    And user selects filter by Price Range
    And user selects filter by Rooms and Beds
    And user selects filter by Amenities
    And user selects filter by Booking options
    And user selects filter by Top-tier stays
    And user selects filter by Property type
    And user selects filter by Accessibility features
    And user selects filter by Host language
    Then user clicks on show
    When user selects first card
    Then verify displayed details with the user interest

  Scenario: Verify hosting
    Given user opens website
    When user clicks on Airbnb your home
    Then verify text You could earn is displayed

  Scenario: Verify language option
    Given user opens website
    When user clicks on global icon
    Then verify language options are displayed
    When user clicks on language
    Then verify language is changed to the selected language

  Scenario: Verify currency
    Given user opens website
    When user clicks on global icon
    And user selects currency
    Then verify currency options are displayed
    Then select the currency
    And user select on rooms
    When user clicks on the card
    Then verify currency is changed to the selected currency

  Scenario: Verify image sliding functionality
    Given user opens website
    When user clicks on the next in card image
    Then verify image sliding functionality is working properly
  
  
  Scenario: Verify user is getting the correct host information
    Given user opens website
    When user clicks on the first card
    And user selects Meet your Host more option
    Then verify displayed details with the host details
