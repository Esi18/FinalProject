package project.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;



public class FlightDetailsPageElements {

    public static final String ECONOMY_BTN_CSS= "div[class='ui mini light-blue ff-price-padding button']";
    public static final String BOOK_NOW_BTN_CSS= "div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > button:nth-child(3)";
    public static final String BUSINESS_BTN="//div[@class='ui grid container']//div[3]//div[3]//div[1]//a[1]//span[1]//div[1]";
    public static final String BOOK_BTN="//div[contains(@class,'ui equal width grid')]//div[1]//div[2]//div[1]//button[1]";
    public static final String CARRIER_AIRLINE ="//span[text()='Air Austral']";
    public FlightDetailsPageElements () {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = ECONOMY_BTN_CSS)
    public WebElement selectEconomyBtn;
    @FindBy(css = BOOK_NOW_BTN_CSS)
    public WebElement clickBookBtn;
    @FindBy(xpath = BUSINESS_BTN)
    public WebElement clickBusinessButton;
    @FindBy(xpath = BOOK_BTN)
    public WebElement bookBtn;
    @FindBy(xpath = CARRIER_AIRLINE)
    public WebElement carrierAirline;
}
