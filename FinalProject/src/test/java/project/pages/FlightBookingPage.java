package project.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.elements.FlightBookingPageElements;
import project.utilities.TripType;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;


public class FlightBookingPage {

    private int multiSearch = 11;

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());

    FlightBookingPageElements flightBookingPageElements = new FlightBookingPageElements();

    public FlightBookingPage() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void getUrl(String url) {
        BaseInformation.getDriver().get(url);
    }

    public void selectTrip(TripType type) {
        switch (type) {
            case ROUND -> flightBookingPageElements.selectRoundTrip.click();
            case MULTI -> flightBookingPageElements.selectMultiTrip.click();
            case ONE_WAY -> flightBookingPageElements.selectOneWayTrip.click();
        }
    }

    private WebElement searchResult(String text) {
        String flightSearchXpath = FlightBookingPageElements.SEARCH_RESULTS_XPATH;
        flightSearchXpath = flightSearchXpath.replace("#text#", text);
        return basePageObject.getWebElementUtils().waitForElementVisible(By.xpath(flightSearchXpath));
    }

    public void selectDepartureAndArrival(String from, String to) {

        flightBookingPageElements.selectDeparture.sendKeys(from);
        WebElement searchResult = searchResult(from);
        basePageObject.getWebElementUtils().javaScriptClick(searchResult);
        flightBookingPageElements.selectDeparture.click();

        flightBookingPageElements.selectArrival.sendKeys(to);
        searchResult = searchResult(to);
        basePageObject.getWebElementUtils().javaScriptClick(searchResult);
        flightBookingPageElements.selectArrival.click();

    }

    public void selectDate(String day) {
        flightBookingPageElements.selectDepartureDate.click();
        flightBookingPageElements.selectMonth.click();
        for (WebElement element : flightBookingPageElements.selectDay) {
            String date = element.getText();
            if (date.equalsIgnoreCase(day)) {
                element.click();
                break;
            }
        }
    }

    public void selectNumberOfAdults(int numAdults) {
        basePageObject.getWaitUtils().waitForElementClickable(flightBookingPageElements.selectNumberOfAdult).sendKeys(String.valueOf(numAdults));
    }

    public void selectOnCabinPreference(String cabin) {
        basePageObject.getWaitUtils().waitForElementVisible(flightBookingPageElements.selectCabinPreference).sendKeys(cabin);
    }

    public void clickOnSearchButton() {
        flightBookingPageElements.clickSearchButton.click();
    }

    public void selectDepartureDate(String day) {
        flightBookingPageElements.selectDepartureDate.click();
        for (WebElement element : flightBookingPageElements.selectDepartureDay) {
            String date = element.getText();
            if (date.equalsIgnoreCase(day)) {
                element.click();
                break;
            }
        }
    }
    public void selectOnReturnDate(String day) {
        flightBookingPageElements.selectReturnDate.click();
        flightBookingPageElements.selectMonth.click();
        for (WebElement el : flightBookingPageElements.selectReturnDay) {
            String date = el.getText();
            if (date.equalsIgnoreCase(day)) {
                el.click();
                break;
            }
        }
    }

    public void verifyRoute(String expectedDeparture, String expectedArrival) {
        String actualDeparture = basePageObject.getWaitUtils().waitForElementVisible(flightBookingPageElements.selectDeparture).getAttribute("value");
        String actualArrival = basePageObject.getWaitUtils().waitForElementVisible(flightBookingPageElements.selectArrival).getAttribute("value");
        Assert.assertTrue("Expected departure city: " + expectedDeparture + ", Actual departure city: " + actualDeparture, actualDeparture.contains(expectedDeparture));
        Assert.assertTrue("Expected arrival city: " + expectedArrival + ", Actual arrival city: " + actualArrival, actualArrival.contains(expectedArrival));
    }

    public void selectDepartureAndArrivalMulti(String from, String to, int segmentNumber) {

        String fromId = FlightBookingPageElements.DEPARTURE_FIELD_MULTI.replace("%", String.valueOf(segmentNumber));
        basePageObject.getWebElementUtils().waitForElementVisible(By.id(fromId)).sendKeys(from);
        WebElement searchResult = searchResultMulti();
        basePageObject.getWebElementUtils().javaScriptClick(searchResult);
        basePageObject.getWebElementUtils().waitForElementVisible(By.id(fromId)).click();

        String toId = FlightBookingPageElements.ARRIVAL_FIELD_MULTI.replace("%", String.valueOf(segmentNumber));
        basePageObject.getWebElementUtils().waitForElementVisible(By.id(toId)).sendKeys(to);
        searchResult = searchResultMulti();
        basePageObject.getWebElementUtils().javaScriptClick(searchResult);
        basePageObject.getWebElementUtils().waitForElementVisible(By.id(toId)).click();

    }

    private WebElement searchResultMulti() {
        String flightSearchXpath = FlightBookingPageElements.SEARCH_RESULTS_MULTI_XPATH;
        flightSearchXpath = flightSearchXpath.replace("11", String.valueOf(multiSearch));
        multiSearch++;
        return basePageObject.getWebElementUtils().waitForElementVisible(By.xpath(flightSearchXpath));
    }

    public void clickOnPlusButton() {
        basePageObject.getWaitUtils().waitForElementclicableWithCustomTime(2000,flightBookingPageElements.plusButton).click();
    }
    public void clickPlusButton() {
        basePageObject.getWaitUtils().waitForElementclicableWithCustomTime(2000,flightBookingPageElements.plusButton1).click();
    }

    public void selectDepartureDateMulti(String day, int segmentNumber) {
        String xpath = FlightBookingPageElements.DEPARTURE_DATE_MULTI.replace("%", String.valueOf(segmentNumber));
        WebElement departureDateFiled = basePageObject.getWebElementUtils().waitForElementVisible(By.xpath(xpath));
        basePageObject.getWebElementUtils().actionClickPerform(departureDateFiled);
        for (WebElement element : flightBookingPageElements.selectDepartureDay) {
            String date = element.getText();
            if (date.equalsIgnoreCase(day)) {
                element.click();
                break;
            }
        }
    }

    public void selectNumberOfInfants(int numInfant) {
        basePageObject.getWaitUtils().waitForElementClickable(flightBookingPageElements.selectNumberOfInfant).sendKeys(String.valueOf(numInfant));
    }

    public void selectNumberOfChildren(int numChildren) {
        basePageObject.getWaitUtils().waitForElementClickable(flightBookingPageElements.selectNumberOfChild).sendKeys(String.valueOf(numChildren));
    }

    public void clickOnAdvancedOptions(String type) {
        basePageObject.getWaitUtils().waitForElementClickable(flightBookingPageElements.clickAdvancedOptions).click();
        flightBookingPageElements.chooseFlightType.sendKeys(type);
    }

    public void choosePreferredAirline(String airline){
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(2000, flightBookingPageElements.preferredAirline).sendKeys(airline);
    }

}






