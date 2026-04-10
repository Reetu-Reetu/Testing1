Feature: Login functionality test
  Scenario: Check login with valid credentials
    Given user is on login Page
    When user enter valid username and password
    And Clicks on login button
    Then user is navigated to the home page
  @smoke
  Scenario: Check login with invalid credentials
    Given user is on login Page
    When user enter invalid username and password
    And Clicks on login button
    Then error message is displayed-Invalid Credentials

