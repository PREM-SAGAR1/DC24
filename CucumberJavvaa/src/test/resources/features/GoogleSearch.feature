Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search engine
    When user enter a text in seatch box
    And hits enter
    Then user is navigated to search results
