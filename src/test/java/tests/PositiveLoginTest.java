package tests;

import org.testng.annotations.Test;
import page.object.FooterPage;
import page.object.LandingPage;
import page.object.LoginPage;
import page.object.TopMenuPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();
        FooterPage footerPage = new FooterPage(driver);

        assertTrue(footerPage.isBannerAfterLoginDisplayed());

    }
}
