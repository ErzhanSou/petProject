package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMCommonPage {

    public OrangeHRMCommonPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "Admin")
    public WebElement adminTab;
}
