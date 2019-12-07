package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class LabradorRetrieverCatalog extends BasePage {

    @FindBy(css = "a.Button[href*='EST-22']")
    private WebElement addAdultMaleLabradorRetriever;

    public ShoppingCartPage addAdultMaleLabradorRetriever() {
        WaitForElement.waitUntilElementIsClickable(addAdultMaleLabradorRetriever);
        addAdultMaleLabradorRetriever.click();
        log().info("Clicked on Add to Cart button");
        return new ShoppingCartPage();
    }


}
