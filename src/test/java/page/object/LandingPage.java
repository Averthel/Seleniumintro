package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class LandingPage {

    @FindBy(css = "#Content a")
    WebElement enterStoreLink;

    private WebDriver driver;

    public LandingPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterStoreLink(){
        enterStoreLink.click();

    }
}
