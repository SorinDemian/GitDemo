package Sorin.PageObject;

import Sorin.DriverHelper;
import Sorin.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

    static private By menuBttnId = By.id("menu-toggle");

    WebDriver driver = DriverHelper.INSTANCE.driver;

    public WelcomePage() {
        Helper.INSTANCE.waitForElementVisibility(menuBttnId,5, driver);
    }

    public MenuOverlay openMenuOverlay(){
        Helper.INSTANCE.clickOn(menuBttnId);
        return new MenuOverlay();
    }
}

