package Sorin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver = DriverHelper.INSTANCE.driver;

    @BeforeMethod
    public void startChromeSession() {
        DriverHelper.INSTANCE.getUrl();
    }

    @AfterMethod
    public void closeChromeSession() {
        driver.quit();
    }
}
