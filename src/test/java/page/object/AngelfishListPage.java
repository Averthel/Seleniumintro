package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class AngelfishListPage {

    private WebDriver driver;

    public AngelfishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "a.Button[href*='EST-2']")
    WebElement addSmallAngelfish;

    public void addSmallAngelFish(){
        addSmallAngelfish.click();
    }
}

