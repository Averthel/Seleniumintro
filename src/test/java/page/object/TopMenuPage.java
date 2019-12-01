package page.object;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class TopMenuPage extends BasePage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signonLink;

    @FindBy(xpath = "//div[@id='QuickLinks']/a[1]")
    WebElement fishLink;

    @FindBy(name = "keyword")
    WebElement searchField;

    @FindBy(name = "searchProducts")
    WebElement searchButton;

    @FindBy(css = "#Content img[src='../images/fish2.gif']")
    WebElement goldfishImg;

    @FindBy(css = "#Content img[src='../images/fish1.gif']")
    WebElement angelfishImg;

    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink() {
        WaitForElement.waitUntilElementIsClickable(signonLink);
        signonLink.click();
        log().info("Click in Sign on link");
        return new LoginPage();
    }

    public FishListPage clickOnFishlink() {
        WaitForElement.waitUntilElementIsClickable(fishLink);
        fishLink.click();
        return new FishListPage();
    }

    public TopMenuPage typeIntoSearchField(String searchContent) {
        WaitForElement.waitUntilElementIsVisible(searchField);
        searchField.clear();
        searchField.sendKeys(searchContent);
        log().info("Type into search field {}", searchContent);
        return this;
    }

    public TopMenuPage clickOnSearchButton() {
        WaitForElement.waitUntilElementIsClickable(searchButton);
        searchButton.click();
        log().info("Click in search button");
        return this;
    }

    public boolean isGoldfishImgDisplayed() {
        WaitForElement.waitUntilElementIsVisible(goldfishImg);
        boolean isDisplayed = goldfishImg.isDisplayed();
        log().info("Goldfish image", isDisplayed);
        return isDisplayed;
    }

    public boolean isAngelfishImgDisplayed() {
        WaitForElement.waitUntilElementIsVisible(angelfishImg);
        boolean isDisplayed = angelfishImg.isDisplayed();
        log().info("Angelfish image", isDisplayed);
        return isDisplayed;
    }

}
