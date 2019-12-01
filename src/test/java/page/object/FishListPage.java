package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class FishListPage extends BasePage {

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    private WebElement angelfishId;

    public AngelfishListPage angelFishMenu() {
        WaitForElement.waitUntilElementIsClickable(angelfishId);
        angelfishId.click();
        log().info("Click on Angel Fish Id");
        return new AngelfishListPage();
    }

}
