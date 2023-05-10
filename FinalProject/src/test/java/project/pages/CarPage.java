package project.pages;

import org.openqa.selenium.support.PageFactory;
import project.elements.CarPageElements;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;

public class CarPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    CarPageElements carPageElements = new CarPageElements();

    public CarPage() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void searchForCar() {

        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(2000, carPageElements.searchCarBtn).click();
        basePageObject.getWaitUtils().waitForElementclicableWithCustomTime(29000, carPageElements.bookNowCarBtn).click();
    }
}
