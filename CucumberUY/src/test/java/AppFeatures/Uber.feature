Feature: Uber Booking Feature

  Scenario: Booking Cab
    Given user wants to select a car type "sedan" from uber app
    When user select car "sedan" and pick up point "Banglore" and drop location "pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then user pays 1000 USD
