package page.object;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

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

    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage typeIntoUserNameField(String username){
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Type into User Name field {}",username);
        return this;
    }

    public LoginPage typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Type into password field {}", password);
        return this;
    }

    public FooterPage clickOnLoginButton(){
        signOnButton.click();
        logger.info("Click on Login button");
        return new FooterPage();
    }

    public String getWarningMessage(){
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningMessage = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningMessage);
        return warningMessage;
    }

    public String isTextBeforeLogin(){
        WaitForElement.waitUntilElementIsVisible(messageBeforeLogin);
        String text = messageBeforeLogin.getText();
        logger.info("Get text from Login Page");
        return text;
    }



}
