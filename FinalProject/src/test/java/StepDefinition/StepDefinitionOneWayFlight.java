package StepDefinition;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.globals.Globals;
import project.utilities.TripType;
import project.pages.ConfirmationPage;
import project.pages.FlightBookingPage;
import project.pages.FlightDetailsPage;
import project.pages.PassengersPage;

public class StepDefinitionOneWayFlight {
    FlightBookingPage flightBookingPage = new FlightBookingPage();
    PassengersPage passengersPage = new PassengersPage();

    FlightDetailsPage flightDetailsPage= new FlightDetailsPage();
    ConfirmationPage confirmationPage= new ConfirmationPage();

    @Given("I am on the flight booking website")
    public void iAmOnTheFlightBookingWebsite() {
        flightBookingPage.getUrl(Globals.APP_URL);
    }

    @When("I select {TripType} as the flight type")
    public void iSelectAsTheFlightType(TripType tripType) {
        flightBookingPage.selectTrip(tripType);
    }

    @ParameterType("ONE_WAY|ROUND|MULTI")
    public TripType TripType(String tripType) {
        return TripType.valueOf(tripType);
    }

    @And("I enter {string} as the departure airport and {string} as the arrival airport")
    public void iEnterAsTheDepartureAirportAndAsTheArrivalAirport(String departure, String arrival) {
        flightBookingPage.selectDepartureAndArrival(departure, arrival);
    }

    @And("I select a date in the upcoming month")
    public void iSelectADateInTheUpcomingMonth() {
        flightBookingPage.selectDate("12");
    }

    @And("I select {string} as the number of adults traveling")
    public void iSelectAsTheNumberOfAdultsTraveling(String numAdults) {
        flightBookingPage.selectNumberOfAdults(2);
        System.out.println("I selected " + numAdults);
    }

    @And("I select {string} as the cabin class")
    public void iSelectAsTheCabinClass(String cabin_class) {
        flightBookingPage.selectOnCabinPreference(cabin_class);
        System.out.println("I selected " + cabin_class);
        flightBookingPage.clickOnSearchButton();
    }

    @And("I choose {string} as the economy option")
    public void iChooseAsTheEconomyOption(String economyType) {
        flightDetailsPage.selectOnEconomyOption();
        System.out.println("I selected " + economyType);
        flightDetailsPage.clickOnBookNowBtn();
    }

    @And("I select {string} as the seat preference")
    public void iSelectAsTheSeatPreference(String arg0) {
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
        passengersPage.selectSeat();
    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
        passengersPage.fillCustomField(111);
        passengersPage.clickCheckBox();
        passengersPage.clickConfirmButton();
    }

    @Then("I should see the booking reference number displayed on the page and write down or remember the booking reference number")
    public void iShouldSeeTheBookingReferenceNumberDisplayedOnThePageAndWriteDownOrRememberTheBookingReferenceNumber() {
        confirmationPage.verifyBookingReferenceNumber();
    }
}
