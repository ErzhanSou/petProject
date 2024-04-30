package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartBtnSauceLabsBackpack;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBtnSauceLabsBackpack;




}
