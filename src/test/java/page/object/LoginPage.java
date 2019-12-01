package page.object;

import generic.asseration.AssertWebElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    @FindBy(css = "#Catalog > form > p:nth-child(1)")
    private WebElement messageBeforeLogin;

    @Step("Type into User Name Field {username}")
    public LoginPage typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        log().info("Type into User Name field {}", username);
        return this;
    }

    @Step("Type into Password Field {password}")
    public LoginPage typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        log().info("Type into password field {}", password);
        return this;
    }

    @Step("Click on Login Button")
    public FooterPage clickOnLoginButton() {
        signOnButton.click();
        log().info("Click on Login button");
        return new FooterPage();
    }

    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningMessage = messageLabel.getText();
        log().info("Returned warning message was: {}", warningMessage);
        return warningMessage;
    }

    @Step("Getting text before login")
    public String isTextBeforeLogin() {
        WaitForElement.waitUntilElementIsVisible(messageBeforeLogin);
        String text = messageBeforeLogin.getText();
        log().info("Get text from Login Page");
        return text;
    }

    @Step("Assert that warning message {warningMessage} is displayed")
    public LoginPage assertThatWarningIsDisplayed(String warningMessage) {
        log().info("Checking if warning message {} is displayed", warningMessage);
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        AssertWebElement.assertThat(messageLabel).isDisplayed().hasText(warningMessage);
        return this;
    }


}
