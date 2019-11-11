package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    private WebDriver driver;

    public FishListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    WebElement angelfishId;

    public void angelFishMenu(){
        angelfishId.click();
    }

}
