package project.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.BaseInformation;

public class CarPageElements {

    public static final String SEARCH_CAR_BTN = "div[id='submitBTN']";
    public static final String BOOK_NOW_CAR = "//div[3]/div[1]/div[1]/div[4]/button[1]/span[1]";

    public CarPageElements() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = SEARCH_CAR_BTN)
    public WebElement searchCarBtn;

    @FindBy(xpath = BOOK_NOW_CAR)
    public WebElement bookNowCarBtn;

}
