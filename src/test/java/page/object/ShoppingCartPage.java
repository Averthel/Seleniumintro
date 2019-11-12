package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class ShoppingCartPage {

    private Logger logger = LogManager.getRootLogger();

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//*[@id='Cart']/a")
    private WebElement proceedToCheckout;

    public void proceedToCheckout() {
        WaitForElement.waitUntilElementIsClickable(proceedToCheckout);
        proceedToCheckout.click();
        logger.info("Click on Procced To Checkout button ");

    }
}
