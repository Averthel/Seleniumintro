package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class FishListPage {

    private WebDriver driver;

    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    WebElement angelfishId;

    public void angelFishMenu(){
        angelfishId.click();
    }

}
