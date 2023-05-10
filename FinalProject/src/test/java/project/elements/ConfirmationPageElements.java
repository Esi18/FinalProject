package project.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;

import java.util.List;

public class ConfirmationPageElements {

    public static final String BOOKING_REF = "div[class='ref_num_btn']";
    public static final String BOOKING_NUMBER = "input[id='grBookingSuccess']";
    public static final String LIST_OF_TRAVELER = "table[class='ui single line table']";

    public ConfirmationPageElements() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = BOOKING_REF)
    public WebElement bookingReferenceNumber;

    @FindBy(css = BOOKING_NUMBER)
    public WebElement bookingNumElement;

    @FindBy(css = LIST_OF_TRAVELER)
    public List<WebElement> travelerList;


}
