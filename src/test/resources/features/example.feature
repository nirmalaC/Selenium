Feature: As a User I want to be able to navigate to google and search for something

  Scenario: A user can search for something on google
    Given that I have launched a browser
    When I perform a search for something
    Then the search results are returned