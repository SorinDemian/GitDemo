package Sorin.PageObject;

import Sorin.DriverHelper;
import Sorin.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiesOverlay {

    WebDriver driver = DriverHelper.INSTANCE.driver;

    static private By acceptCookiesBttn = By.id("onetrust-accept-btn-handler");

    public CookiesOverlay(){
        Helper.INSTANCE.waitForElementVisibility(acceptCookiesBttn, 15, driver);
    }

    public WelcomePage navigateToWelcomePageByClosingTheCookies(){
        Helper.INSTANCE.clickOn(acceptCookiesBttn);
        return new WelcomePage();
    }
}
