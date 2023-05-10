package project.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.elements.PassengersPageElements;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;

public class PassengersPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());

    PassengersPageElements passengersPageElements = new PassengersPageElements();

    public PassengersPage() {

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void fieldFirstName(String value) {
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(13000, passengersPageElements.firstNameField);
        passengersPageElements.firstNameField.sendKeys(value);
    }

    public void fieldMiddleName(String value) {
        passengersPageElements.middleNameField.sendKeys(value);
    }

    public void fieldLastName(String value) {
        passengersPageElements.lastNameField.sendKeys(value);
    }

    public void fieldEmail(String value) {
        passengersPageElements.emailField.sendKeys(value);
    }

    public void fieldConfirmEmail(String value) {
        passengersPageElements.confirmEmailField.sendKeys(value);
    }

    public void fieldPhoneNumber(String value) {
        passengersPageElements.phoneNumberField.sendKeys(value);
    }

    public void radioButtonGenderClick(String index) {
        passengersPageElements.genderOptions.get(0).click();
    }


    public void selectDayOfBirth(final String valueDay) {
        final Select day = new Select(passengersPageElements.dateOfBirth);
        day.selectByVisibleText(valueDay);
    }

    public void selectMonthOfBirth(final String valueMonth) {
        final Select month = new Select(passengersPageElements.monthOfBirth);
        month.selectByVisibleText(valueMonth);
    }

    public void selectYearOfBirth(final String valueYear) {
        final Select year = new Select(passengersPageElements.yearOfBirth);
        year.selectByVisibleText(valueYear);
    }

    public void clickOnDropDownIcon() {
        basePageObject.getWaitUtils().waitForElementClickable(passengersPageElements.clickOnDropDownIcon).click();
    }

    public void fieldFirstN(String value) {
        passengersPageElements.fieldFirstN.sendKeys(value);
    }

    public void fieldLastN(String value) {
        passengersPageElements.fieldLastN.sendKeys(value);
    }

    public void clickOnButtonGender(String index) {
        passengersPageElements.genderOnOptions.get(1).click();
    }


    public void selectDayBirth(final String valueDay) {
        final Select day = new Select(passengersPageElements.dateBirth);
        day.selectByVisibleText(valueDay);
    }

    public void selectMonthBirth(final String valueMonth) {
        final Select month = new Select(passengersPageElements.monthBirth);
        month.selectByVisibleText(valueMonth);
    }

    public void selectYearBirth(final String valueYear) {
        final Select year = new Select(passengersPageElements.yearBirth);
        year.selectByVisibleText(valueYear);
    }


    public void fieldFirstNameInfant(String value) {
        passengersPageElements.firstNameInfant.sendKeys(value);
    }

    public void fieldLastNameInfant(String value) {
        passengersPageElements.lastNameInfant.sendKeys(value);
    }

    public void clickGenderInfant(String index) {
        passengersPageElements.genderInfant.get(1).click();
    }


    public void selectDayBirthInfant(final String valueDay) {
        final Select day = new Select(passengersPageElements.dateOfBirthInfant);
        day.selectByVisibleText(valueDay);
    }

    public void selectMonthBirthInfant(final String valueMonth) {
        final Select month = new Select(passengersPageElements.monthOfBirthInfant);
        month.selectByVisibleText(valueMonth);
    }

    public void selectYearBirthInfant(final String valueYear) {
        final Select year = new Select(passengersPageElements.yearOfBirthInfant);
        year.selectByVisibleText(valueYear);
    }

    private WebElement getSeat(String seatNumber) {
        String seatXpath = PassengersPageElements.FIRST_SELECTION_SEAT;
        seatXpath = seatXpath.replace("#seat#", seatNumber);
        return basePageObject.getWebElementUtils().waitForElementVisibleWithCustomTime(5000, By.xpath(seatXpath));
    }

    public void selectSeat() {
        // Try to select seat 22A
        passengersPageElements.seatButton.click();
        WebElement seat22A = getSeat("22A");
        String seat22AStatus = seat22A.getAttribute("class");
        if (!seat22AStatus.equals("seat seat--unavailable")) {
            seat22A.click();
        } else {
            for (WebElement seatRow : passengersPageElements.seatRows) {
                WebElement seat = getSeat(seatRow.getText() + "A");
                String seatValue = seat.getAttribute("class");
                if (!seatValue.equals("seat seat--unavailable")) {
                    seat.click();
                }
            }
        }
        passengersPageElements.saveButton.click();
    }

    public void fillCustomField(int number) {
        basePageObject.getWebElementUtils().javaScriptClickScroll();
        basePageObject.getWaitUtils().waitForElementVisibleWithCustomTime(5000, passengersPageElements.customField).sendKeys(String.valueOf(number));
    }

    public void clickCheckBox() {
        if (!passengersPageElements.checkBox.isSelected()) {
            passengersPageElements.checkBox.click();
        }
    }

    public void clickConfirmButton() {
        basePageObject.getWaitUtils().waitForElementClickable(passengersPageElements.confirmButton).click();
    }

    public void clickOnAddCar() {
        basePageObject.getWebElementUtils().javaScriptScrollTop();
        passengersPageElements.addCarBtn.click();
    }

    public void clickOnAddHotel() {
        basePageObject.getWebElementUtils().javaScriptScrollTop();
        passengersPageElements.addHotelBtn.click();
    }

}

