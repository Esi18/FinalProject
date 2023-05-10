Feature: One-way flight booking

  Scenario Outline: Book a one-way flight from <departure> to <arrival> for <num_adults> adults in <cabin_class> class

    Given I am on the flight booking website
    When I select ONE_WAY as the flight type
    And I enter "<departure>" as the departure airport and "<arrival>" as the arrival airport
    And I select a date in the upcoming month
    And I select "<num_adults>" as the number of adults traveling
    And I select "<cabin_class>" as the cabin class
    And I choose "Light economy" as the economy option
    And I select "22A" as the seat preference
    And I click on the "Confirm Booking" button
    Then I should see the booking reference number displayed on the page and write down or remember the booking reference number


    Examples:
      | departure   | arrival | num_adults | cabin_class |
      | Mexico City | Cancun  | 2          | Economy     |

