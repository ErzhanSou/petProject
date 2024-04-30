package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompletePage {
    public CompletePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "h2[class='complete-header']")
    public WebElement thankYouForYourOrder;

    @FindBy(id = "back-to-products")
    public WebElement backHomeButton;
}
