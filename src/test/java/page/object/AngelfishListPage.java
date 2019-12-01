package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class AngelfishListPage extends BasePage {

    @FindBy(css = "a.Button[href*='EST-2']")
    private WebElement addSmallAngelfish;

    public ShoppingCartPage addSmallAngelFish() {
        WaitForElement.waitUntilElementIsClickable(addSmallAngelfish);
        addSmallAngelfish.click();
        log().info("Click on addSmallAngelfish button");
        return new ShoppingCartPage();
    }
}

