Feature: Amazon Search

  Scenario: Search a product
  
    Given: i have a search field on amazon page
    When i search for a product with name "Apple macbook pro" and price 1000
    Then Product with name "Mackbook pro" should be displayed
