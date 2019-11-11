package page.object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class TopMenuPage {

    private WebDriver driver;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    @FindBy(xpath = "//div[@id='QuickLinks']/a[1]")
    WebElement fishLink;

    public void clickOnSignInLink(){
        signInLink.click();
    }

    public void clickOnFishlink(){
        fishLink.click();
    }
}
