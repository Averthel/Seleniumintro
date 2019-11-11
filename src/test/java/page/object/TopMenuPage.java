package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class TopMenuPage {

    private Logger logger = LogManager.getRootLogger();

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signonLink;

    @FindBy(xpath = "//div[@id='QuickLinks']/a[1]")
    WebElement fishLink;

    public LoginPage clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signonLink);
        signonLink.click();
        logger.info("Click in Sign on link");
        return new LoginPage();
    }

    public FishListPage clickOnFishlink(){
        WaitForElement.waitUntilElementIsClickable(fishLink);
        fishLink.click();
        return new FishListPage();
    }
}
