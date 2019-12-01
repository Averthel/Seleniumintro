package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class ShoppingCartPage extends BasePage {


    @FindBy(xpath = "//*[@id='Cart']/a")
    private WebElement proceedToCheckout;

    @FindBy(css = "input[value='Update Cart']")
    private WebElement updateCart;

    @FindBy(css = "input[name = 'EST-22']")
    WebElement quantity;

    @FindBy(xpath = "//*[@id='Cart']/form/table/tbody/tr[3]/td[1]")
    WebElement totalSum;


    public LoginPage proceedToCheckout() {
        WaitForElement.waitUntilElementIsClickable(proceedToCheckout);
        proceedToCheckout.click();
        log().info("Click on Procced To Checkout button ");
        return new LoginPage();
    }

    public ShoppingCartPage changequantity(String newQuantity) {
        WaitForElement.waitUntilElementIsClickable(quantity);
        quantity.clear();
        quantity.sendKeys(newQuantity);
        log().info("Quantity Changed");
        return this;
    }

    public ShoppingCartPage updateCart() {
        updateCart.click();
        log().info("Click on Update Cart button");
        return this;
    }

    public String totalSum() {
        String sum = totalSum.getText();
        log().info("Returned total sum" + totalSum.getText());
        return sum;
    }
}
