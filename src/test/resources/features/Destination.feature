Feature: Validate stays functionalities

  Scenario: Verify searching destination functionality
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

  Scenario: Verify filter option
    Given user opens website
    And verify user is on homepage
    When user click on "farm"
    When user clicks on filter
    Then user selects filter by Entire home
    And user enters minimum price "1000" and maximum price "10000"
    And user selects "2" bedrooms and "2" beds
    And user selects Wifi in Amenities
    And user selects Instant Book in Booking options
    And user selects guest favourites in Top-tier stays
    And user selects Hotel Property type
    And user selects filter by Accessibility features
    And user selects language English in filter
    Then user clicks on show
    When user selects first card
    Then verify displayed details with the user interest

  Scenario: Verify hosting
    Given user opens website
    And verify user is on homepage
    When user clicks on Airbnb your home
    Then verify Airbnb your home is displayed with text
      |You could earn|

  Scenario: Verify language option
    Given user opens website
    And verify user is on homepage
    When user clicks on global icon
    Then verify language options are displayed
    When user clicks on language
    Then verify user is on homepage
    When user clicks on global icon
    Then verify language is changed to the selected language

  Scenario: Verify currency
    Given user opens website
    And verify user is on homepage
    When user clicks on global icon
    And user selects currency
    Then verify currency options are displayed
    And select the currency
    Then verify currency is changed to the selected currency

  Scenario: Verify image sliding functionality
    Given user opens website
    When user click on "Amazing views"
    Then verify user is on homepage
    When user clicks on the next in card image
    Then verify image displayed is second-"2"

  Scenario: Verify user is getting the correct host information
    Given user opens website
    And verify user is on homepage
    When user click on "Amazing views"
    And user selects first card
    And user selects Meet your Host option
    Then verify displayed details with the host details

  Scenario: Verify user is able to use help centre option
    Given user opens website
    And verify user is on homepage
    And user clicks on profile icon
    When user clicks on the help centre option
    Then verify help centre page is displayed with text
        |Hi, how can we help|

  Scenario: Verify Price of Experience
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
    And get price and total price
    Then verify price is displayed correctly

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

  Scenario: Verify things to do with what you will do
    Given user opens website
    And verify user is on homepage
    When user clicks on things to do
    Then user selects destination
    When user search is performed
    And user selects first card
    Then verify displayed details with the text
      |What you'll do|

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

  Scenario: Verify hosting page price slider
    Given user opens website
    And verify user is on homepage
    When user clicks on Airbnb your home
    Then verify Airbnb your home is displayed with text
      |You could earn|
    When user uses slider
    Then verify the price is changing