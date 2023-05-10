package project.elements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;

import java.util.List;

public class PassengersPageElements {

    public static final String FIRSTNAME_FIELD_CSS = "#fname_0";
    public static final String MIDDLE_NAME_FIELD_CSS = "#mname_0";
    public static final String LASTNAME_FIELD_CSS = "#lname_0";
    public static final String EMAIL_FIELD = "#email_0";
    public static final String CONFIRM_EMAIL_FIELD = "#email_c_0";
    public static final String PHONE_NUMBER_FIELD = "#phone_0";
    public static final String GENDER_BTN_CSS = "input[class='grcheck grgender gender_0']";
    public static final String DATE_OF_BIRTH = "#bdate_d_0";
    public static final String MONTH_CSS = "#bdate_m_0";
    public static final String YEAR_CSS = "#bdate_y_0";
    public static final String DROPDOWN_ICON_CSS = "div[class=' title'] i[class='dropdown icon']";
    public static final String FN_FIELD_CSS = "#fname_1";
    public static final String LN_FIELD_CSS = "#lname_1";
    public static final String GENDER_BTN = "input[class='grcheck grgender gender_1']";
    public static final String DATE_BIRTH = "#bdate_d_1";
    public static final String MONTH_BIRTH = "#bdate_m_1";
    public static final String YEAR_BIRTH = "#bdate_y_1";
    public static final String FIRSTNAME_INFANT_CSS = "#fname_2";
    public static final String LASTNAME_INFANT_CSS = "#lname_2";
    public static final String GENDER_INFANT = "input[class='grcheck grgender gender_2']";
    public static final String DATE_OF_BIRTH_INFANT = "#bdate_d_2";
    public static final String MONTH_OF_BIRTH_INFANT = "#bdate_m_2";
    public static final String YEAR_OF_BIRTH_INFANT = "#bdate_y_2";
    public static final String SEAT_BTN_CSS = "button[id='seatSelectionBtn']";
    public static final String FIRST_SELECTION_SEAT = "//span[@data-code='#seat#']";
    public static final String SAVE_SEAT_BUTTON = ".ui.blue.button.save-seats ";
    public static final String SEAT_ROWS = "//b[@class='seat-row-number']";
    public static final String CUSTOM_FIELDS = "#CUSTOM_FIELD_834-0";
    public static final String CHECK_BOX_CSS = "input[id='cbRules']";
    public static final String CONFIRM_BUTTON = "a[id='btnCreateBooking']";
    public static final String ADD_CAR_BTN = "div[id='addCarTravelTypeDiv'] button[class='ui light-blue button']";
    public static final String ADD_HOTEL_BTN = "div[id='addHotelTravelTypeDiv'] button[class='ui light-blue button']";

    public PassengersPageElements() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = FIRSTNAME_FIELD_CSS)
    public WebElement firstNameField;
    @FindBy(css = MIDDLE_NAME_FIELD_CSS)
    public WebElement middleNameField;
    @FindBy(css = LASTNAME_FIELD_CSS)
    public WebElement lastNameField;
    @FindBy(css = EMAIL_FIELD)
    public WebElement emailField;
    @FindBy(css = CONFIRM_EMAIL_FIELD)
    public WebElement confirmEmailField;
    @FindBy(css = PHONE_NUMBER_FIELD)
    public WebElement phoneNumberField;
    @FindBy(css = GENDER_BTN_CSS)
    public List<WebElement> genderOptions;
    @FindBy(css = DATE_OF_BIRTH)
    public WebElement dateOfBirth;
    @FindBy(css = MONTH_CSS)
    public WebElement monthOfBirth;
    @FindBy(css = YEAR_CSS)
    public WebElement yearOfBirth;
    @FindBy(css = DROPDOWN_ICON_CSS)
    public WebElement clickOnDropDownIcon;
    @FindBy(css = FN_FIELD_CSS)
    public WebElement fieldFirstN;
    @FindBy(css = LN_FIELD_CSS)
    public WebElement fieldLastN;
    @FindBy(css = GENDER_BTN)
    public List<WebElement> genderOnOptions;
    @FindBy(css = DATE_BIRTH)
    public WebElement dateBirth;
    @FindBy(css = MONTH_BIRTH)
    public WebElement monthBirth;
    @FindBy(css = YEAR_BIRTH)
    public WebElement yearBirth;
    @FindBy(css = FIRSTNAME_INFANT_CSS)
    public WebElement firstNameInfant;
    @FindBy(css = LASTNAME_INFANT_CSS)
    public WebElement lastNameInfant;
    @FindBy(css = GENDER_INFANT)
    public List<WebElement> genderInfant;
    @FindBy(css = DATE_OF_BIRTH_INFANT)
    public WebElement dateOfBirthInfant;
    @FindBy(css = MONTH_OF_BIRTH_INFANT)
    public WebElement monthOfBirthInfant;
    @FindBy(css = YEAR_OF_BIRTH_INFANT)
    public WebElement yearOfBirthInfant;
    @FindBy(css = SEAT_BTN_CSS)
    public WebElement seatButton;
    @FindBy(xpath = SEAT_ROWS)
    public List<WebElement> seatRows;
    @FindBy(css = SAVE_SEAT_BUTTON)
    public WebElement saveButton;
    @FindBy(css = CUSTOM_FIELDS)
    public WebElement customField;
    @FindBy(css = CHECK_BOX_CSS)
    public WebElement checkBox;
    @FindBy(css = CONFIRM_BUTTON)
    public WebElement confirmButton;
    @FindBy(css = ADD_CAR_BTN)
    public WebElement addCarBtn;
    @FindBy(css = ADD_HOTEL_BTN)
    public WebElement addHotelBtn;
}
