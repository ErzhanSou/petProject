package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrangeHRMAdminPage {

    public OrangeHRMAdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='oxd-table-card'][1]/div/div/div/button)[2]")
    public WebElement firstEmployeeEditButton;

    @FindBy(xpath = "//label[text()='Employee Name']/../following-sibling::div/div/div/input")
    public WebElement employeeNameInputField;

    @FindBy(xpath = "//div[@class='oxd-autocomplete-option']")
    public List<WebElement> listOfEmployeeNames;

    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveButton;

    @FindBy(xpath = "//h6[text()='Admin']")
    public WebElement adminTitle;

    @FindBy(xpath = "//h6[text()='User Management']")
    public WebElement userManagementTitle;




}
