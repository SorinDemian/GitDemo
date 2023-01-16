package Sorin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;

public enum Helper {

    INSTANCE;

    public void waitFor(int intervalMs){
        try {
            Thread.sleep(intervalMs);
        }catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public Wait<WebDriver> newWait(WebDriver driver, int timeout) {
        return new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(500)).ignoring(StaleElementReferenceException.class);
    }

    private void waitForElement(ExpectedCondition<?> condition, int timeout, WebDriver driver) {
        try {
            newWait(driver, timeout).until(condition);
        } catch (TimeoutException e) {
            throw e;
        }
    }

    public void waitForElementVisibility(By by, int timeout, WebDriver driver) {
        waitForElement(ExpectedConditions.visibilityOfElementLocated(by), timeout, driver);
    }
    public void scrollToElement(WebElement webElement, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", webElement);
    }

    public void clickOn(By by){
        waitForElementVisibility(by,5, DriverHelper.INSTANCE.driver);
        DriverHelper.INSTANCE.driver.findElement(by).click();
    }
}
