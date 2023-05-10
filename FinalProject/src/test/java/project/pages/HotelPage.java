package project.pages;


import org.openqa.selenium.support.PageFactory;
import project.elements.HotelPageElements;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;

public class HotelPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    HotelPageElements hotelPageElements = new HotelPageElements();

    public HotelPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void selectNumberOfRooms(int numRooms) {
        basePageObject.getWaitUtils().waitForElementClickable(hotelPageElements.numberOfRooms).sendKeys(String.valueOf(numRooms));
    }

    public void selectNumberOfAdults(int numAdults) {
        basePageObject.getWaitUtils().waitForElementClickable(hotelPageElements.numberOfAdults).sendKeys(String.valueOf(numAdults));
    }

    public void putNumberAdultRoom(int numAdults) {
        basePageObject.getWaitUtils().waitForElementClickable(hotelPageElements.adultNumber).sendKeys(String.valueOf(numAdults));
    }

    public void selectNumberOfChildren(int numChildren) {
        basePageObject.getWaitUtils().waitForElementClickable(hotelPageElements.numberOfChildren).sendKeys(String.valueOf(numChildren));
    }

    public void putAgeChild_1(int age) {
        basePageObject.getWaitUtils().waitForElementClickable(hotelPageElements.childAge1).sendKeys(String.valueOf(age));
    }

    public void putAgeChild_2(int age) {
        basePageObject.getWaitUtils().waitForElementClickable(hotelPageElements.childAge2).sendKeys(String.valueOf(age));
    }


    public void clickOnSearchButtonHotel() {
        basePageObject.getWaitUtils().waitForElementclicableWithCustomTime(3000, hotelPageElements.searchBtn).click();
    }

}

