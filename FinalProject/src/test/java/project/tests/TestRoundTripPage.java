package project.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import project.globals.Globals;
import project.utilities.TripType;
import project.pages.*;
import project.utilities.BaseInformation;


public class TestRoundTripPage {

    FlightBookingPage flightBookingPage = new FlightBookingPage();
    FlightDetailsPage flightDetailsPage = new FlightDetailsPage();
    PassengersPage passengersPage = new PassengersPage();
    CarPage carPage = new CarPage();
    CreditCardPage creditCardPage = new CreditCardPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();


    @AfterMethod
    public void after() {
        BaseInformation.getDriver().quit();
    }

    @Test
    public void execute() {
        flightBookingPage.getUrl(Globals.APP_URL);
        flightBookingPage.selectTrip(TripType.ROUND);
        flightBookingPage.selectDepartureAndArrival("Mexico City", "Cancun");
        flightBookingPage.verifyRoute("Mexico City", "Cancun");

        flightBookingPage.selectDepartureDate("12");
        flightBookingPage.selectOnReturnDate("6");
        flightBookingPage.selectNumberOfAdults(2);
        System.out.println("I selected 2 adults");
        flightBookingPage.selectNumberOfInfants(1);
        System.out.println("I selected 1 infant");
        flightBookingPage.selectOnCabinPreference("Business");
        System.out.println("I selected Business cabin");
        flightBookingPage.clickOnAdvancedOptions("Non stop flights");
        System.out.println("I selected Non stop flights");
        flightBookingPage.clickOnSearchButton();
        flightDetailsPage.clickOnBusinessButton();

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
        passengersPage.clickOnAddCar();
        carPage.searchForCar();
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
        creditCardPage.putAmexCardNumber(Globals.AMEX_CARD_NUMBER);
        passengersPage.clickCheckBox();
        passengersPage.clickConfirmButton();
        confirmationPage.verifyBookingReferenceNumber();
        confirmationPage.verifyTravelerNames();
    }
}

