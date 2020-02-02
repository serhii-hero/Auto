package com.it.driver;

import com.it.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_IMPLICITLY_WAIT;
import static com.it.common.Constants.BASE_URL;

public class DriverFactory {
    public static WebDriver getDriver() {
        WebDriver driver;
        String driverSysProperty = System.getProperty("driver");
        if ("firefox".equals(driverSysProperty)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(BASE_IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return driver;
    }
}
