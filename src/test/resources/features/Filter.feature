Feature: Validate Filter Functionality
  Scenario: Verify filter option
    Given user opens website
    And verify user is on homepage
    When user click on "farm"
    When user clicks on filter
    Then user selects filter by Entire home
    And user enters minimum price "filter.minimum.price" and maximum price "filter.maximum.price"
    And user selects "filter.bedroom.count" bedrooms and "filter.bed.count" beds
    And user selects Wifi in Amenities
    And user selects Instant Book in Booking options
    And user selects guest favourites in Top-tier stays
    And user selects Hotel Property type
    And user selects filter by Accessibility features
    And user selects language English in filter
    Then user clicks on show
    When user selects first card
    Then verify displayed details with the user interest