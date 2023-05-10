package project.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import project.elements.CreditCardPageElements;
import project.utilities.BaseInformation;
import project.utilities.BasePageObject;



public class CreditCardPage {

    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());

    CreditCardPageElements creditCardPageElements= new CreditCardPageElements();

    public  CreditCardPage (){

        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    public void putCardNumber(String value){
        basePageObject.getWebElementUtils().sendKeysToElementWithWait(creditCardPageElements.cardNumber, value, 2000);

    }

    public void putCvcNumber(String value){
        creditCardPageElements.cvcNumber.sendKeys(String.valueOf(value));
    }
    public void selectMonthOfExpiredCard(final String valueMonth){
        final Select day= new Select(creditCardPageElements.expiresMonthCard);
        day.selectByVisibleText(valueMonth);
    }

    public void selectYearOfExpiredCard(final String valueYear){
        final Select day= new Select(creditCardPageElements.expiresYearCard);
        day.selectByVisibleText(valueYear);
    }

    public void putNameOfCard(String value){
        basePageObject.getWebElementUtils().sendKeysToElementWithWait(creditCardPageElements.nameOfCreditCard,value,1000);

    }

    public void putBillingAddress(String value){
        creditCardPageElements.billingAddress.sendKeys(value);
    }

    public void putCity(String value){
        creditCardPageElements.city.sendKeys(value);
    }
    public void putPostalCode(String value){
        basePageObject.getWebElementUtils().sendKeysToElementWithWait(creditCardPageElements.postalCode, value,1000);
    }
    public void putAmexCardNumber(String value){
        basePageObject.getWebElementUtils().sendKeysToElementWithWait(creditCardPageElements.amexCardNumber,value, 500);

    }
}
