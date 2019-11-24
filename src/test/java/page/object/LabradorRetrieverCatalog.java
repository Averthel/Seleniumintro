package page.object;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LabradorRetrieverCatalog {


    private Logger logger = LogManager.getLogger(LabradorRetrieverCatalog.class);

    public LabradorRetrieverCatalog(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "a.Button[href*='EST-22']")
    WebElement addAdultMaleLabradorRetriever;

    public ShoppingCartPage addAdultMaleLabradorRetriever(){
        WaitForElement.waitUntilElementIsClickable(addAdultMaleLabradorRetriever);
        addAdultMaleLabradorRetriever.click();
        logger.info("Clicked on Add to Cart button");
        return new ShoppingCartPage();
    }


}
