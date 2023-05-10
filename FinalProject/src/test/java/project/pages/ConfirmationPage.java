package project.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import project.elements.ConfirmationPageElements;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;

public class ConfirmationPage {
    private static final String REGEX_BOOKING_TEXT = "booking reference number\\n.*\\nPlease, write down or remember this number";
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    ConfirmationPageElements confirmationPageElements= new ConfirmationPageElements();
    public ConfirmationPage() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void verifyBookingReferenceNumber() {
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(20000, confirmationPageElements.bookingReferenceNumber);
        String bookingRefNumText = confirmationPageElements.bookingReferenceNumber.getText();
        Assert.assertTrue("Booking Reference Number is not displayed correctly",
                bookingRefNumText.matches(REGEX_BOOKING_TEXT));
        // Get the booking number
        String bookingNum = confirmationPageElements.bookingNumElement.getAttribute("value");
        Assert.assertNotNull("Booking number is null or empty", bookingNum);
        System.out.println("Booking number: " + bookingNum);
    }

    public void verifyTravelerNames() {
        for (WebElement travelerNameElement : confirmationPageElements.travelerList) {
            String travelerName = travelerNameElement.getText();
            System.out.println("Traveler Name: " + travelerName);
        }
    }
}
