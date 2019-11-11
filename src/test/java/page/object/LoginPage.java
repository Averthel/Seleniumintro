package page.object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class LoginPage {

    @FindBy(name = "username")
    WebElement usernameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(name = "signon")
    WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    WebElement messageLabel;

    private WebDriver driver;

    public LoginPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeIntoUserNameField(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void typeIntoPasswordField(String password){
       passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){
        signOnButton.click();
    }

    public String getWarningMessage(){
        String warningMessage = messageLabel.getText();
        return warningMessage;
    }



}
