package project.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import project.globals.Globals;
import project.utilities.TripType;
import project.pages.ConfirmationPage;
import project.pages.FlightBookingPage;
import project.pages.FlightDetailsPage;
import project.pages.PassengersPage;
import project.utilities.BaseInformation;

public class TestOneWayFlight {
    FlightBookingPage flightBookingPage = new FlightBookingPage();
    PassengersPage passengersPage = new PassengersPage();
    FlightDetailsPage flightDetailsPage = new FlightDetailsPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @AfterMethod
    public void after() {
        BaseInformation.getDriver().quit();
    }

    @Test
    public void execute() {
        flightBookingPage.getUrl(Globals.APP_URL);
        flightBookingPage.selectTrip(TripType.ONE_WAY);
        flightBookingPage.selectDepartureAndArrival("Mexico City", "Cancun");
        flightBookingPage.selectDate("12");
        flightBookingPage.selectNumberOfAdults(2);
        System.out.println("I selected 2 adults");
        flightBookingPage.selectOnCabinPreference("Economy");
        System.out.println("I selected Economy cabin");
        flightBookingPage.clickOnSearchButton();
        flightDetailsPage.selectOnEconomyOption();
        flightDetailsPage.clickOnBookNowBtn();

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
        passengersPage.fillCustomField(111);
        passengersPage.clickCheckBox();
        passengersPage.clickConfirmButton();
        confirmationPage.verifyBookingReferenceNumber();

    }
}


