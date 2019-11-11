package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {

    private WebDriver driver;

    public TopMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    public void clickOnSignInLink(){
        signInLink.click();

    }
}
