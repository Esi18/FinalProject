package project.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;

public class CreditCardPageElements {

    public static final String CARD_NUMBER_CSS = "input[id='CARcnN_0']";
    public static final String CVC_NUMBER = "input[id='CARcvv_0']";
    public static final String EXPIRES_MONTH_CARD = "select[id='CARexp_m_0']";
    public static final String EXPIRES_YEAR_CARD = "select[id='CARexp_y_0']";
    public static final String NAME_OF_CARD = "input[id='CARcname_0']";
    public static final String BILLING_ADDRESS = "input[id='CARstr_0']";
    public static final String CITY_CSS = "input[id='CARcty_0']";
    public static final String POSTAL_CODE = "input[id='CARzip_0']";
    public static final String AMEX_CARD_NUMBER = "input[id='CUSTOM_FIELD_834-0']";

    public CreditCardPageElements() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = CARD_NUMBER_CSS)
    public WebElement cardNumber;

    @FindBy(css = CVC_NUMBER)
    public WebElement cvcNumber;

    @FindBy(css = EXPIRES_MONTH_CARD)
    public WebElement expiresMonthCard;

    @FindBy(css = EXPIRES_YEAR_CARD)
    public WebElement expiresYearCard;
    @FindBy(css = NAME_OF_CARD)
    public WebElement nameOfCreditCard;

    @FindBy(css = BILLING_ADDRESS)
    public WebElement billingAddress;

    @FindBy(css = CITY_CSS)
    public WebElement city;

    @FindBy(css = POSTAL_CODE)
    public WebElement postalCode;

    @FindBy(css = AMEX_CARD_NUMBER)
    public WebElement amexCardNumber;

}
