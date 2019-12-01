package page.object;

import generic.asseration.AssertWebElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import waits.WaitForElement;

public class FooterPage extends BasePage {

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement bannerAfterLoginLogo;

    @Step("Assert that element dog banner is displayed")
    public FooterPage assertThatDogBannerIsDisplayed() {
        log().info("Checking if dog banner is displayed");
        WaitForElement.waitUntilElementIsVisible(bannerAfterLoginLogo);
        AssertWebElement.assertThat(bannerAfterLoginLogo).isDisplayed();
        return this;
    }
}
