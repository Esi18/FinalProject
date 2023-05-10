package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import project.globals.Globals;
import project.pages.*;

public class StepDefinitionRoundWayFlight {

    FlightBookingPage flightBookingPage = new FlightBookingPage();
    PassengersPage passengersPage = new PassengersPage();
    FlightDetailsPage flightDetailsPage= new FlightDetailsPage();
    CarPage carPage = new CarPage();
    CreditCardPage creditCardPage = new CreditCardPage();
    ConfirmationPage confirmationPage= new ConfirmationPage();

    @And("choose the current date as the departure date")
    public void chooseTheCurrentDateAsTheDepartureDate() {
        flightBookingPage.selectDepartureDate("12");

    }

    @And("select the next month's date as the return date")
    public void selectTheNextMonthSDateAsTheReturnDate() {
        flightBookingPage.selectOnReturnDate("6");
    }

    @And("add {int} adults and {int} infant as travelers")
    public void addAdultsAndInfantAsTravelers(int numberOfAdults, int numberOfInfants) {
        flightBookingPage.selectNumberOfAdults(2);
        System.out.println("I selected " + numberOfAdults);
        flightBookingPage.selectNumberOfInfants(1);
        System.out.println("I selected " + numberOfInfants);
    }

    @And("select {string} as the cabin class")
    public void select_as_the_cabin_class(String cabin_class) {
        flightBookingPage.selectOnCabinPreference(cabin_class);
        System.out.println("I selected " + cabin_class);
    }

    @And("choose {string} flights under Advanced options")
    public void chooseFlightsUnder(String flightType) {
        flightBookingPage.clickOnAdvancedOptions("Non stop flights");
        System.out.println("I selected " + flightType);
        flightBookingPage.clickOnSearchButton();
    }

    @And("select any available business compartment")
    public void selectAnyAvailableBusinessCompartment() {
        flightDetailsPage.clickOnBusinessButton();
    }

    @And("fill in all personal information for the travelers")
    public void fillInAllPersonalInformationForTheTravelers() {
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
        passengersPage.fieldFirstNameInfant(Globals.FIRSTNAME_INFANT);
        passengersPage.fieldLastNameInfant(Globals.LASTNAME_INFANT);
        passengersPage.clickGenderInfant("1");
        passengersPage.selectDayBirthInfant(Globals.DATE_OF_BIRTH_INFANT);
        passengersPage.selectMonthBirthInfant(Globals.MONTH_OF_BIRTH_INFANT);
        passengersPage.selectYearBirthInfant(Globals.YEAR_OF_BIRTH_INFANT);
    }

    @And("add a car rental for the dates and location")
    public void addACarRentalForTheDatesAndLocation() {
        passengersPage.clickOnAddCar();
        carPage.searchForCar();
    }

    @And("select {string} as the payment type")
    public void selectAsThePaymentType(String paymentType) {
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
        passengersPage.fieldFirstNameInfant(Globals.FIRSTNAME_INFANT);
        passengersPage.fieldLastNameInfant(Globals.LASTNAME_INFANT);
        passengersPage.clickGenderInfant("1");
        passengersPage.selectDayBirthInfant(Globals.DATE_OF_BIRTH_INFANT);
        passengersPage.selectMonthBirthInfant(Globals.MONTH_OF_BIRTH_INFANT);
        passengersPage.selectYearBirthInfant(Globals.YEAR_OF_BIRTH_INFANT);

        creditCardPage.putCardNumber(Globals.CARD_NUMBER);
        creditCardPage.putCvcNumber(Globals.CVC_NUMBER);
        creditCardPage.selectMonthOfExpiredCard(Globals.EXPIRES_MONTH_CARD);
        creditCardPage.selectYearOfExpiredCard(Globals.EXPIRES_YEAR_CARD);
        creditCardPage.putNameOfCard(Globals.NAME_OF_CARD);
        creditCardPage.putBillingAddress(Globals.BILLING_ADDRESS);
        creditCardPage.putCity(Globals.CITY_CSS);
        creditCardPage.putPostalCode(Globals.POSTAL_CODE);
        System.out.println("I selected " + paymentType);
        creditCardPage.putAmexCardNumber(Globals.AMEX_CARD_NUMBER);
        passengersPage.clickCheckBox();
    }

    @And("confirm the booking")
    public void confirmTheBooking() {
        passengersPage.clickConfirmButton();
    }

    @Then("I verify that the exact phase is displayed on the page with the {string} and {string}")
    public void iVerifyThatTheExactPhaseIsDisplayedOnThePageWithTheAnd(String arg0, String arg1) {
        confirmationPage.verifyBookingReferenceNumber();
    }

    @And("I verify that all the travelers names are displayed as expected at the end of the booking successful page")
    public void iVerifyThatAllTheTravelersNamesAreDisplayedAsExpectedAtTheEndOfTheBookingSuccessfulPage() {
        confirmationPage.verifyTravelerNames();
    }
}
