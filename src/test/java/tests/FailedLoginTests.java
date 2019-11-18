package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.object.LandingPage;
import page.object.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;


public class FailedLoginTests extends TestBase {


    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("fail")
                .typeIntoPasswordField("fail")
                .clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
