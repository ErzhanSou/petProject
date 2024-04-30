package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    public WebElement itemSauceLabsBackpack;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;
}
