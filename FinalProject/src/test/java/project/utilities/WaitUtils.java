package project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private BaseInformation baseInformation;
    private Duration defaultDuration;

    private WebDriver driver = BaseInformation.getDriver();
    public WaitUtils(BaseInformation baseInformation, Duration defaultDuration) {
        this.baseInformation = baseInformation;
        this.defaultDuration = defaultDuration;
    }

    public WebElement waitForElementVisibleWithCustomTime(long mills, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(mills));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementclicableWithCustomTime(long mills, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(mills));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public WebElement waitForElementClickable(WebElement element) {
        return waitForElementclicableWithCustomTime(defaultDuration.toMillis(), element);
    }
    public WebElement waitForElementVisible(WebElement element) {
        return waitForElementVisibleWithCustomTime(defaultDuration.toMillis(), element);
    }
}
