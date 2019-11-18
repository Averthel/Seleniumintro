package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.object.*;

import static navigation.ApplicationURLs.LABRADOR_RETRIEVER_CATALOG;
import static org.testng.Assert.assertEquals;


public class ShoppingCartTest extends TestBase {
    
    @Test
    public void asNotLoggedInUserTryProceedToCheckout() {
        LandingPage landingPage = new LandingPage();
        String message = landingPage.clickOnEnterStoreLink()
                .clickOnFishlink()
                .angelFishMenu()
                .addSmallAngelFish()
                .proceedToCheckout()
                .getWarningMessage();

        assertEquals(message, "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }

    @Test
    public void updateCartTest(){
        DriverUtils.navigateToPage(LABRADOR_RETRIEVER_CATALOG);

        LabradorRetrieverCatalog labradorRetrieverCatalog = new LabradorRetrieverCatalog();
        String totalSum = labradorRetrieverCatalog.addAdultMaleLabradorRetriever()
                .changequantity("2")
                .updateCart()
                .totalSum();

        assertEquals(totalSum, "Sub Total: $271.00");

    }

}
