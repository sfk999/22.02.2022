package mantis.pages;
// мой пейдж
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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







    public void fillSummary (String summary) {

        summaryField.sendKeys(summary);
    }



    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }







}
