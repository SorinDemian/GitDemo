package Sorin.PageObject;

import Sorin.DriverHelper;
import Sorin.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MenuOverlay {

    static private By menuOverlay = By.id("navigation-box");

    WebDriver driver = DriverHelper.INSTANCE.driver;

    public MenuOverlay() {
        Helper.INSTANCE.waitForElementVisibility(menuOverlay, 5, driver);
    }

    public void verifymenuOverlayIsDisplayed() {
        Assert.assertTrue(driver.findElement(menuOverlay).isDisplayed(), "The menu overlay was not dispayed");
    }
}
