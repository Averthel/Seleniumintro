package tests;


import org.testng.annotations.Test;
import page.object.LandingPage;
import page.object.LoginPage;
import page.object.TopMenuPage;

import static org.testng.Assert.assertEquals;


public class FailedLoginTests extends TestBase {


    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("fail");
        loginPage.typeIntoPasswordField("fail");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");


    }
}
