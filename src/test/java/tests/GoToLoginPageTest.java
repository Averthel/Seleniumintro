package tests;

import org.testng.annotations.Test;
import page.object.LandingPage;

import static org.testng.Assert.assertEquals;

public class GoToLoginPageTest extends TestBase {

    @Test
    public void GoToLoginPageFromMainPage() {

        LandingPage landingPage = new LandingPage();
        String messageLabel = landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink().
                        isTextBeforeLogin();

        assertEquals(messageLabel, "Pleas enter your username and password.");

    }
}
