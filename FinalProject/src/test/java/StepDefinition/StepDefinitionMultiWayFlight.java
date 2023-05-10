package StepDefinition;

import io.cucumber.java.en.And;
import project.globals.Globals;
import project.pages.*;


public class StepDefinitionMultiWayFlight {

    FlightBookingPage flightBookingPage = new FlightBookingPage();
    PassengersPage passengersPage = new PassengersPage();
    FlightDetailsPage flightDetailsPage = new FlightDetailsPage();
    HotelPage hotelPage = new HotelPage();
    CreditCardPage creditCardPage = new CreditCardPage();


    @And("I enter {string} as the departure airport and {string} as the destination airport for the first leg")
    public void i_enter_as_the_departure_airport_and_as_the_destination_airport_for_the_first_leg(String departure, String destination1) {
        flightBookingPage.selectDepartureAndArrivalMulti(departure, destination1, 0);
    }

    @And("I select {string} as the departure date")
    public void i_select_date_as_the_departure_date(String date) {
        flightBookingPage.selectDepartureDateMulti(date, 0);
    }

    @And("I click {string} to proceed to the second leg")
    public void i_click_to_proceed_to_the_second_leg(String continueBtn) {
        flightBookingPage.clickOnPlusButton();

    }

    @And("I enter {string} as the departure airport and {string} as the destination airport for the second leg when departure date {string}")
    public void i_enter_as_the_departure_airport_and_as_the_destination_airport_for_the_second_leg(String destination1, String destination2, String date) {
        flightBookingPage.selectDepartureAndArrivalMulti(destination1, destination2, 1);
        flightBookingPage.selectDepartureDateMulti(date, 1);
        flightBookingPage.clickPlusButton();
        flightBookingPage.selectDepartureAndArrivalMulti(destination2, destination1, 2);
    }

    @And("I select {string} as the return date")
    public void iSelectDatesAsTheReturnDate(String date) {
        flightBookingPage.selectDepartureDateMulti(date, 2);
    }

    @And("add {int} adults and {int} child as travelers")
    public void add_adults_and_child_as_travelers(int adults, int child) {
        flightBookingPage.selectNumberOfAdults(3);
        System.out.println("I selected " + adults);
        flightBookingPage.selectNumberOfChildren(2);
        System.out.println("I selected " + child);
    }

    @And("I select {string} flights under Advanced options and choose {string} as the preferred airline")
    public void i_select_flights_under_advanced_options_and_choose_as_the_preferred_airline(String nonStop, String airline) {
        flightBookingPage.clickOnAdvancedOptions("Non stop flights");
        flightBookingPage.choosePreferredAirline("Air Austral");
        flightBookingPage.clickOnSearchButton();
    }

    @And("select any available economy compartment")
    public void select_any_available_economy_compartment() {
        flightDetailsPage.selectOnEconomyOption();
        flightDetailsPage.clickOnBookNowBtn();
    }

    @And("add hotel and search for hotels in {string} with a maximum price of {string} and a total maximum price of {string} for the dates and location")
    public void add_hotel_and_search_for_hotels_in_with_a_maximum_price_of_and_a_total_maximum_price_of_for_the_dates_and_location(String destination2, String maxPriceNight, String totalMaxPrice) {
        passengersPage.clickOnAddHotel();
        hotelPage.selectNumberOfRooms(2);
        hotelPage.selectNumberOfAdults(2);
        hotelPage.putNumberAdultRoom(1);
        hotelPage.selectNumberOfChildren(2);
        hotelPage.putAgeChild_1(7);
        hotelPage.putAgeChild_2(8);
        hotelPage.clickOnSearchButtonHotel();
    }

    @And("fill in all personal information for the {string} with {string}")
    public void fill_in_all_personal_information_for_the_travelers_with_details(String travelers, String details) {
        passengersPage.fieldFirstName(Globals.FIRSTNAME);
        passengersPage.fieldLastName(Globals.LASTNAME);
        passengersPage.fieldMiddleName(Globals.MIDDLE_NAME);
        passengersPage.fieldEmail(Globals.EMAIL);
        passengersPage.fieldConfirmEmail(Globals.CONFIRM_EMAIL);
        passengersPage.fieldPhoneNumber(Globals.PHONE_NUMBER);
        passengersPage.radioButtonGenderClick("0");
        passengersPage.selectDayOfBirth(Globals.BIRTH_DAY);
        passengersPage.selectMonthOfBirth(Globals.BIRTH_MONTH);
        passengersPage.selectYearOfBirth(Globals.BIRTH_YEAR);
        passengersPage.clickOnDropDownIcon();
        passengersPage.fieldFirstN(Globals.F_NAME);
        passengersPage.fieldLastN(Globals.L_NAME);
        passengersPage.clickOnButtonGender("1");
        passengersPage.selectDayBirth(Globals.DAY_OF_BIRTH);
        passengersPage.selectMonthBirth(Globals.MONTH_OF_BIRTH);
        passengersPage.selectYearBirth(Globals.YEAR_OF_BIRTH);
        passengersPage.clickOnDropDownIcon();
    }


    @And("select {string} as the payment type and enter credit card information")
    public void selectAsThePaymentTypeAndEnterCreditCardInformation(String arg0) {
        creditCardPage.putCardNumber(Globals.CARD_NUMBER);
        creditCardPage.putCvcNumber(Globals.CVC_NUMBER);
        creditCardPage.selectMonthOfExpiredCard(Globals.EXPIRES_MONTH_CARD);
        creditCardPage.selectYearOfExpiredCard(Globals.EXPIRES_YEAR_CARD);
        creditCardPage.putNameOfCard(Globals.NAME_OF_CARD);
        creditCardPage.putBillingAddress(Globals.BILLING_ADDRESS);
        creditCardPage.putCity(Globals.CITY_CSS);
        creditCardPage.putPostalCode(Globals.POSTAL_CODE);
        creditCardPage.putAmexCardNumber(Globals.AMEX_CARD_NUMBER);
        passengersPage.clickCheckBox();
    }

    @And("I confirm the booking")
    public void confirmTheBooking() {
        passengersPage.clickConfirmButton();
    }



}