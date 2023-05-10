package project.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementUtils {

    WebDriver driver = BaseInformation.getDriver();

    private final BaseInformation baseInformation;
    private final WaitUtils waitUtils;

    public WebElementUtils(BaseInformation baseInformation, Duration defaultDuration) {
        this.baseInformation = baseInformation;
        this.waitUtils = new WaitUtils(baseInformation, defaultDuration);
    }

    public void sendKeysToElementWithWait(WebElement element, String value, long millsWait) {
        element.sendKeys(value);

    }

    public WebElement waitForElementVisibleWithCustomTime(long mills, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(mills));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void javaScriptClick(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", webElement);
    }

    public void javaScriptClickScroll() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0,500);");
    }

    public void javaScriptScrollTop() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0,document.body.scrollTop);");
    }

    public void actionClickPerform(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).click().build().perform();
    }


}
