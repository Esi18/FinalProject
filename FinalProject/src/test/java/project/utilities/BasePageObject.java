package project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.time.Duration;

public class BasePageObject {
    private final BaseInformation baseInformation;

    private ElementLocatorFactory rootFactory;
    private final Duration defaultDuration = Duration.ofMillis(5000);

    private WaitUtils waitUtils;
    private WebElementUtils webElementUtils;
    private WebDriver driver = BaseInformation.getDriver();


    public BasePageObject(BaseInformation baseInformation) {
        this.baseInformation = baseInformation;
        rootFactory = new DefaultElementLocatorFactory(driver);
        PageFactory.initElements(rootFactory, this);
    }

    public WaitUtils getWaitUtils() {
        if (waitUtils == null) {
            waitUtils = new WaitUtils(getBaseInformation(), defaultDuration);
        }
        return waitUtils;
    }

    public WebElementUtils getWebElementUtils() {
        if (webElementUtils == null) {
            webElementUtils = new WebElementUtils(getBaseInformation(), defaultDuration);
        }
        return webElementUtils;
    }

    public BaseInformation getBaseInformation() {
        return baseInformation;
    }

}
