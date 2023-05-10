Feature: Round-way flight booking

  Scenario Outline: Build a Return Flight with Car Rental

    Given I am on the flight booking website
    When I select ROUND as the flight type
    And I enter "<departure>" as the departure airport and "<arrival>" as the arrival airport
    And choose the current date as the departure date
    And select the next month's date as the return date
    And add <adults> adults and <infant> infant as travelers
    And select "<cabin_class>" as the cabin class
    And choose "Non-stop" flights under Advanced options
    And select any available business compartment
    And fill in all personal information for the travelers
    And add a car rental for the dates and location
    And select "Credit Card" as the payment type
    And confirm the booking
    Then I verify that the exact phase is displayed on the page with the "booking reference number" and "Please, write down or remember this number"
    And I verify that all the travelers names are displayed as expected at the end of the booking successful page

   Examples:
     | departure | arrival    | adults | infant | cabin_class |
     | Cancun    | Mexico City| 2      | 1      | Business    |