package project.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import project.globals.Globals;

import java.time.Duration;


public class BaseInformation {


    public static BaseInformation getBaseInformation() {
        return new BaseInformation();
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            String browserType= Globals.driverType;
            switch (browserType) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    System.setProperty("", "");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
                    break;
                case "internetexplorer":
                    System.setProperty("", "");
                    driver = new InternetExplorerDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
                    break;
            }
        }

        return driver;
    }


}


