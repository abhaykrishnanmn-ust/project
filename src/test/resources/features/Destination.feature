Feature: Validate stays functionalities

  Scenario: Verify searching destination for stays functionality
    Given user opens website
    And verify user is on homepage
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
    And verify user is on homepage
    When user clicks on experiences
    And user clicks on where
    Then user selects destination by "region"
    And select dates
    And select number of people
    When user click on search button
    Then verify experience page is displayed
    When user selects first card on experience page
    Then verify displayed details on experience page with the input details

  Scenario: Verify farm option has farm in description
    Given user opens website
    And verify user is on homepage
    When user click on "farm"
    Then user selects first card
    Then verify farm description contains "farm" in it

  Scenario: Verify Price of stays
    Given user opens website
    And verify user is on homepage
    When user clicks on where
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects first card
    Then verify price and total price is displayed correctly

  Scenario: Verify before tax price button
    Given user opens website
    And verify user is on homepage
    When user click on "Beachfront"
    When user clicks on the Display total before taxes
    Then verify total before price is displayed in the page

  Scenario: Verify map name on card
    Given user opens website
    And verify user is on homepage
    When user click on "Beachfront"
    And user clicks on the Show map
    Then verify map page is displayed
    When user click on one of the price tag displayed
    Then verify details card is displayed
    When user clicks on the details card
    Then verify map card detail with page detail

  Scenario: Verify things to do with map
    Given user opens website
    And verify user is on homepage
    When user clicks on things to do
    Then user selects destination
    When user search is performed
    And user selects map options
    Then verify content as what you will do is present with same price in map

  Scenario: Verify Host preview and host in card
    Given user opens website
    And verify user is on homepage
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
    Then verify displayed host details with the details in preview

  Scenario: Verify typing destination for Experiences
    Given user opens website
    And verify user is on homepage
    When user clicks on experiences
    Then user types location "bali" in the search destination field
    When user clicks on destination
    And select dates
    And select number of people
    When user click on search button
    Then verify experience page is displayed
    When user selects first card on experience page
    Then verify displayed details on experience page with the input details

  Scenario: Verify date change for Experiences
    Given user opens website
    And verify user is on homepage
    When user clicks on experiences
    Then user types location "bali" in the search destination field
    When user clicks on destination
    And select dates
    And select number of people
    When user click on search button
    Then verify experience page is displayed
    When user selects first card on experience page
    And user click on dates
    When user changes dates
    And user click on save
    Then verify displayed dates are different from previous dates

  Scenario: Verify card traversal for Experiences
    Given user opens website
    And verify user is on homepage
    When user clicks on experiences
    Then user types location "bali" in the search destination field
    When user clicks on destination
    And select dates
    And select number of people
    When user click on search button
    Then verify experience page is displayed
    When user selects first card on experience page
    Then user scrolls through the page till similar experiences
    When user clicks on the card on similar experiences
    Then verify displayed details with the details on card

  Scenario: Verify distribution and total price
    Given user opens website
    And verify user is on homepage
    When user clicks on where
    Then user selects destination by "region"
    And select check in and check out date
    And select number of people
    When user click on search button
    Then verify searched page is displayed
    When user selects any card
    Then verify the price distribution is equals total price