Feature: Test login functionality

  Scenario Outline: Check login is succesfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters  <username> and <password>
    When user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |