package page.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelfishListPage {

    private Logger logger = LogManager.getRootLogger();

    private WebDriver driver;

    public AngelfishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "a.Button[href*='EST-2']")
    WebElement addSmallAngelfish;

    public ShoppingCartPage addSmallAngelFish(){
        addSmallAngelfish.click();
        logger.info("Click on addSmallAngelfish button");
        return new ShoppingCartPage();
    }
}

