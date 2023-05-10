package project.pages;


import org.openqa.selenium.support.PageFactory;
import project.elements.FlightDetailsPageElements;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;

public class FlightDetailsPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());

    FlightDetailsPageElements flightDetailsPageElements = new FlightDetailsPageElements();

    public FlightDetailsPage() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }


    public void selectOnEconomyOption() {
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(8000, flightDetailsPageElements.selectEconomyBtn);
        basePageObject.getWebElementUtils().javaScriptClick(flightDetailsPageElements.selectEconomyBtn);
    }

    public void clickOnBookNowBtn() {
        basePageObject.getWebElementUtils().javaScriptClickScroll();
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(3000, flightDetailsPageElements.clickBookBtn).click();
    }

    public void clickOnBusinessButton() {
        basePageObject.getWebElementUtils().javaScriptClick(flightDetailsPageElements.clickBusinessButton);
        basePageObject.getWebElementUtils().javaScriptClickScroll();
        flightDetailsPageElements.bookBtn.click();

    }

    public void verifyCarrierAirline() {
        String expectedAirline = "Air Austral";
        String actualAirline = flightDetailsPageElements.carrierAirline.getText();
        if (!actualAirline.equals(expectedAirline)) {
            throw new AssertionError("Selected carrier airline is not " + expectedAirline + "!");
        }
    }
}
