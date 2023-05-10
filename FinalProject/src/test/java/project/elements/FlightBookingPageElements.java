package project.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;
import java.util.List;


public class FlightBookingPageElements {

    public static final String ONE_WAY_TRIP_CSS = "li[id='OneWay']";
    public static final String ROUND_TRIP_CSS = "li[id='RoundTrip']";
    public static final String MULTI_TRIP_CSS = "li[id='MultiDestination']";
    public static final String DEPARTURE_FIELD_CSS = "#departure_city";
    public static final String SEARCH_RESULTS_XPATH = "//span[normalize-space()='#text#']";
    public static final String SEARCH_RESULTS_MULTI_XPATH = "//div[11]//a";
    public static final String ARRIVAL_FIELD_CSS = "#destination_city";
    public static final String DEPARTURE_FIELD_MULTI = "departure_city_%";
    public static final String ARRIVAL_FIELD_MULTI = "destination_city_%";
    public static final String DEPARTURE_DATE_MULTI = "//input[@id='departure_date_%']/following-sibling::i";
    public static final String DEPARTURE_DATE_CSS = "#departure_date";
    public static final String SELECT_MONTH_FROM_CALENDAR = "span[class='ui-icon ui-icon-circle-triangle-e']";
    public static final String SELECT_DAY_FROM_CALENDAR = "table[class='ui-datepicker-calendar'] td";
    public static final String ADULT_FIELD_CSS = "select[id='adult-counter']";
    public static final String CABIN_PREFERENCE_CSS = "select[id='pref_class']";
    public static final String SEARCH_BTN_CSS = "#submitBTN";
    public static final String RETURN_DATE_CSS = "#return_date";
    public static final String SELECT_RETURN_DAY_FROM_CALENDAR = "table[class='ui-datepicker-calendar'] td";
    public static final String INFANT_FIELD_CSS = "select[id='infant-counter']";
    public static final String ADVANCED_OPTIONS_CSS = "div[class='ui container search-form'] i[class='dropdown icon']";
    public static final String FLIGHT_TYPE_CSS = "select[id='non_stop_flights']";
    public static final String PREFERRED_AIRLINE= "input[name='pref_airline']";
    public static final String PLUS_BUTTON = "a[id='addLeg_0'] i[class='plus icon']";
    public static final String PLUS_BUTTON_CSS = "a[id='addLeg_1'] i[class='plus icon']";
    public static final String CHILD_FIELD_CSS ="select[id='child-counter']";

    public FlightBookingPageElements() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = ONE_WAY_TRIP_CSS)
    public WebElement selectOneWayTrip;
    @FindBy(css = ROUND_TRIP_CSS)
    public WebElement selectRoundTrip;
    @FindBy(css = MULTI_TRIP_CSS)
    public WebElement selectMultiTrip;
    @FindBy(css = DEPARTURE_FIELD_CSS)
    public WebElement selectDeparture;
    @FindBy(css = ARRIVAL_FIELD_CSS)
    public WebElement selectArrival;
    @FindBy(css = DEPARTURE_DATE_CSS)
    public WebElement selectDepartureDate;
    @FindBy(css = SELECT_MONTH_FROM_CALENDAR)
    public WebElement selectMonth;
    @FindBy(css = SELECT_DAY_FROM_CALENDAR)
    public List<WebElement> selectDay;
    @FindBy(css = ADULT_FIELD_CSS)
    public WebElement selectNumberOfAdult;
    @FindBy(css = CABIN_PREFERENCE_CSS)
    public WebElement selectCabinPreference;
    @FindBy(css = SEARCH_BTN_CSS)
    public WebElement clickSearchButton;
    @FindBy(css = RETURN_DATE_CSS)
    public WebElement selectReturnDate;
    @FindBy(css = SELECT_DAY_FROM_CALENDAR)
    public List<WebElement> selectDepartureDay;
    @FindBy(css = SELECT_RETURN_DAY_FROM_CALENDAR)
    public List<WebElement> selectReturnDay;
    @FindBy(css = INFANT_FIELD_CSS)
    public WebElement selectNumberOfInfant;
    @FindBy(css = ADVANCED_OPTIONS_CSS)
    public WebElement clickAdvancedOptions;
    @FindBy(css = FLIGHT_TYPE_CSS)
    public WebElement chooseFlightType;
    @FindBy(css = PREFERRED_AIRLINE)
    public WebElement preferredAirline;
    @FindBy(css = PLUS_BUTTON)
    public WebElement plusButton;
    @FindBy(css = PLUS_BUTTON_CSS)
    public WebElement plusButton1;
    @FindBy(css = CHILD_FIELD_CSS)
    public WebElement selectNumberOfChild;


}
