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

  Scenario: Verify user is able to use help centre option
    Given user opens website
    And user clicks on profile icon
    When user clicks on the help centre option
    Then verify help centre page is displayed with text "Hi, how can we help"

  Scenario: Verify Price
    Given user opens website
    When user clicks on the first card
    And get price and total price
    Then verify price is displayed correctly

  Scenario: Verify before tax price button
    Given user opens website
    When user clicks on the Display total before taxes
    Then verify before tax price is displayed correctly

  Scenario: Verify map name on card
    Given user opens website
    When user clicks on the Show map
    And user clicks on the card
    Then verify map card detail with page detail

  Scenario: Verify things to do with what you will do
    Given user opens website
    When user clicks on things to do
    Then user selects destination
    When user search is performed
    And user selects first card
    Then verify content as what you will do is present

  Scenario: Verify things to do with map
    Given user opens website
    When user clicks on things to do
    Then user selects destination
    When user search is performed
    And user selects map options
    Then verify content as what you will do is present with same price in map

  Scenario: Verify Host preview and host in card
    Given user opens website
    When user clicks on where
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects a card with host preview
    Then host details are taken
    When user close the preview
    And user open the same card
    Then verify displayed details with the details in preview
