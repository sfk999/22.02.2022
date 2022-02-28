package mantis.pages;
// мой
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class ReportIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(id = "summary")
    private WebElement summaryField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(css = "input[tabindex='18']")
    private WebElement submitIssueButton;

    @FindBy(css = "#buglist > tbody > tr:nth-child(1) > td.column-summary")
    private WebElement testCaseSummary;

    @FindBy(css = "#buglist > tbody > tr:nth-child(1) > td.column-selection > div > label > span")
    private WebElement checkbox;

    @FindBy(name = "action")
    private WebElement dropUpField;

    @FindBy(css = "[type='submit'][value='OK']")
    private WebElement okButton;

    @FindBy(css = "[value='Delete Issues']")
    private WebElement deleteIssuesButton;

    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void fillSummary (String summary) {
        summaryField.sendKeys(summary);
    }
    public void fillDescription (String description) {
        descriptionField.sendKeys(description);
    }
    public void clickIssueButton () {
        submitIssueButton.click();
    }
    public String checkTestCaseNumber() {return testCaseSummary.getText();}
    public void clickInCheckbox () {checkbox.click();}
    public WebElement getDropUpField () { return dropUpField; }
    public void selectDeleteValue() {
        Select selectDropUpField = new Select(dropUpField);
        selectDropUpField.selectByIndex(4);
    }
    public void clickOkButton() {okButton.click();}
    public void clickDeleteIssueButton() {deleteIssuesButton.click();}
    }






