Feature: Definir

  @Shop
  Scenario: HomePage - Arrivals Image
    Given The user is in automation practice web
    When The client tap on Shop menu
    When The client can see only three Arrivals Only
    Then The client Click on the Arrivals Image has redirect to the next page
    Then The description regrading the clicked book
