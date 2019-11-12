package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class FishListPage {

    private Logger logger = LogManager.getRootLogger();

    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    private WebElement angelfishId;

    public AngelfishListPage angelFishMenu(){
        WaitForElement.waitUntilElementIsClickable(angelfishId);
        angelfishId.click();
        logger.info("Click on Angel Fish Id");
        return new AngelfishListPage();
    }

}
