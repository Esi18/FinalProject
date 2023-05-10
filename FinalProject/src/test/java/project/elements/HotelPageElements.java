package project.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;

public class HotelPageElements {
    public static final String NUMBER_OF_ROOMS = "select[class='ui dropdown Rooms prefRooms']";
    public static final String NUMBER_OF_ADULTS_CSS = "select[id='adult-counter_1']";
    public static final String ADULT_NUMBER = "select[id='adult-counter_2']";
    public static final String NUMBER_OF_CHILDREN = "select[id='child-counter_2']";
    public static final String CHILD_AGE_1 = "select[id='childage_1_Room2'] ";
    public static final String CHILD_AGE_2 = "select[id='childage_2_Room2']  ";
    public static final String SEARCH_BTN = "div[id='submitBTN']";


    public HotelPageElements() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = NUMBER_OF_ROOMS)
    public WebElement numberOfRooms;
    @FindBy(css = NUMBER_OF_ADULTS_CSS)
    public WebElement numberOfAdults;
    @FindBy(css = ADULT_NUMBER)
    public WebElement adultNumber;
    @FindBy(css = NUMBER_OF_CHILDREN)
    public WebElement numberOfChildren;
    @FindBy(css = CHILD_AGE_1)
    public WebElement childAge1;
    @FindBy(css = CHILD_AGE_2)
    public WebElement childAge2;
    @FindBy(css = SEARCH_BTN)
    public WebElement searchBtn;

}
