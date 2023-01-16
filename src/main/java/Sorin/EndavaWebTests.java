package Sorin;

import Sorin.PageObject.CookiesOverlay;
import Sorin.PageObject.MenuOverlay;
import Sorin.PageObject.WelcomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class EndavaWebTests  extends BaseTest {
//
//    static private By acceptCookiesBttn = By.id("onetrust-accept-btn-handler");
//    static private By menuBttnId = By.id("menu-toggle");
//    static private By menuOverlay = By.id("navigation-box");
//    static private By contatcBttn = By.xpath("//a[text() ='Contact ']");
//    static private By centralEuropeBttn = By.xpath("//h4[contains(text(),'Central Europe')]");
//    static private By clujNapocaField = By.xpath("//a[contains(text(),'Cluj-Napoca')]");
//    static private By links = By.tagName("a");

    @Test
    public void navigateToMenuPage() {
//        Helper.INSTANCE.waitFor(2000);
//        driver.findElement(acceptCookiesBttn).click();
//        Helper.INSTANCE.waitFor(2000);
//        //afisarea tuturor link-urilor=======================================================
//        List<WebElement> allLinks = driver.findElements(links);
//        System.out.println("Total number of links are: " + allLinks.size());
//        for(int i=0;i<allLinks.size();i++) {
//            System.out.println("Links on page are "+ allLinks.get(i).getAttribute("href"));
//        }
//        //===================================================================================
//        driver.findElement(menuBttnId).click();
//        Helper.INSTANCE.waitFor(2000);
//        Assert.assertTrue(driver.findElement(menuOverlay).isDisplayed(), "The menu overlay is not displayd");
//        Helper.INSTANCE.scrollToElement(driver.findElement(contatcBttn), driver);
//        driver.findElement(contatcBttn).click();
//        Helper.INSTANCE.scrollToElement(driver.findElement(centralEuropeBttn),driver);
//        driver.findElement(centralEuropeBttn).click();
//        Helper.INSTANCE.scrollToElement(driver.findElement(clujNapocaField),driver);
//        Assert.assertEquals(driver.findElement(clujNapocaField).getText(), "Cluj-Napoca");

        //Helper.INSTANCE.waitFor(2000);
        CookiesOverlay cookiesOverlay = new CookiesOverlay();
        WelcomePage welcomePage = cookiesOverlay.navigateToWelcomePageByClosingTheCookies();
        MenuOverlay menuOverlay = welcomePage.openMenuOverlay();
        menuOverlay.verifymenuOverlayIsDisplayed();
        Helper.INSTANCE.waitFor(3000);
    }
}
