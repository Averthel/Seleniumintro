package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class ShoppingCartPage {

    private WebDriver driver;

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//*[@id='Cart']/a")
    WebElement proceedToCheckout;

    public void proceedToCheckout() {
        proceedToCheckout.click();
    }
}
