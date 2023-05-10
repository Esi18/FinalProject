package project.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import project.globals.Globals;
import project.utilities.TripType;
import project.pages.*;
import project.utilities.BaseInformation;


public class TestMultiDestinationsPage {

    FlightBookingPage flightBookingPage = new FlightBookingPage();
    FlightDetailsPage flightDetailsPage = new FlightDetailsPage();
    HotelPage hotelPage = new HotelPage();
    PassengersPage passengersPage = new PassengersPage();
    CreditCardPage creditCardPage = new CreditCardPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();


    @AfterMethod
    public void after() {
        BaseInformation.getDriver().quit();
    }

    @Test
    public void execute() {
        flightBookingPage.getUrl(Globals.APP_URL);
        flightBookingPage.selectTrip(TripType.MULTI);
        flightBookingPage.selectDepartureAndArrivalMulti("Cancun", "Bogota", 0);
        flightBookingPage.selectDepartureDateMulti("13", 0);
        flightBookingPage.clickOnPlusButton();
        flightBookingPage.selectDepartureAndArrivalMulti("Bogota", "Rio Branco", 1);
        flightBookingPage.selectDepartureDateMulti("13", 1);
        flightBookingPage.clickPlusButton();
        flightBookingPage.selectDepartureAndArrivalMulti("Rio Branco", "Bogota", 2);
        flightBookingPage.selectDepartureDateMulti("20", 2);
        flightBookingPage.selectNumberOfAdults(3);
        System.out.println("I selected 3 adults");
        flightBookingPage.selectNumberOfChildren(2);
        System.out.println("I selected 2 children");
        flightBookingPage.selectOnCabinPreference("Economy");
        flightBookingPage.clickOnAdvancedOptions("Non stop flights");
        flightBookingPage.choosePreferredAirline("Air Austral");
        flightBookingPage.clickOnSearchButton();
        flightDetailsPage.verifyCarrierAirline();
        flightDetailsPage.selectOnEconomyOption();
        flightDetailsPage.clickOnBookNowBtn();

        passengersPage.clickOnAddHotel();
        hotelPage.selectNumberOfRooms(2);
        hotelPage.selectNumberOfAdults(2);
        hotelPage.putNumberAdultRoom(1);
        hotelPage.selectNumberOfChildren(2);
        hotelPage.putAgeChild_1(7);
        hotelPage.putAgeChild_2(8);
        hotelPage.clickOnSearchButtonHotel();

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

