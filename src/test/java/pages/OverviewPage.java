package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OverviewPage {
    public OverviewPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='summary_total_label']")
    public WebElement totalPrice;

    @FindBy(id = "finish")
    public WebElement finishButton;
}
