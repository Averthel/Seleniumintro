package waits;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.manager.DriverManager;

public class WaitForElement {

    private static WebDriverWait getWebDriverWait(){
        return new  WebDriverWait(DriverManager.getWebDriver(), 10);
    }

    public static void waitUntilElementIsVisible(WebElement webElement){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitUntilElementIsClickable(WebElement webElement){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}
