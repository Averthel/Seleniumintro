package tests;


import org.testng.annotations.Test;
import page.object.LandingPage;
import page.object.LoginPage;

import static org.testng.Assert.assertEquals;


public class FailedLoginTests extends TestBase {


    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("fail")
                .typeIntoPasswordField("fail")
                .clickOnLoginButton();
        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
