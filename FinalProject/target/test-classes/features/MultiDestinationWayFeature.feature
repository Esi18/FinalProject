Feature: Multi Flight booking

  Scenario Outline: Booking a multi flight with hotel

    Given I am on the flight booking website
    When I select MULTI as the flight type
    And I enter "<departure>" as the departure airport and "<destination1>" as the destination airport for the first leg
    And I select "13" as the departure date
    And I click "Continue" to proceed to the second leg
    And I enter "<destination1>" as the departure airport and "<destination2>" as the destination airport for the second leg when departure date "13"
    And I select "20" as the return date
    And add <adults> adults and <child> child as travelers
    And select "<cabin_class>" as the cabin class
    And I select "Non stop" flights under Advanced options and choose "Austrian" as the preferred airline
    And select any available economy compartment
    And fill in all personal information for the "travelers" with "details"
    And add hotel and search for hotels in "<destination2>" with a maximum price of "$3500/night" and a total maximum price of "$25000" for the dates and location
    And select "Credit Card" as the payment type and enter credit card information
    And I confirm the booking
    Then I verify that the exact phase is displayed on the page with the "booking reference number" and "Please, write down or remember this number"
    And I verify that all the travelers names are displayed as expected at the end of the booking successful page

    Examples:
      | departure | destination1 | destination2  | adults |   child    |  cabin_class
      | Cancun    | Bogota       | Rio Branco    | 3      |     2      |  Economy