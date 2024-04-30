package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {

    public CommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "span[class='shopping_cart_badge']")
    public WebElement numOfItemsInCart;

    @FindBy(css = "a[class='shopping_cart_link']")
    public WebElement cartButton;
}
