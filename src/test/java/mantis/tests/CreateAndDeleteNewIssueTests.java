package mantis.tests;
//мой тест
import mantis.pages.MantisSite;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class CreateAndDeleteNewIssueTests extends BaseTest {
    private MantisSite mantisSite;

    @Test
    public void createAndDeleteNewIssueTests() throws InterruptedException {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuesPage();
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(mantisSite.isEnterIssueDetailsBlockIsDisplayed());
        mantisSite.fillSummary("test1");
        mantisSite.fillDescription("test2");
        mantisSite.clickIssueButton();
        Thread.sleep(3000);

        String currentTestCaseSummary = mantisSite.getReportIssuePage().checkTestCaseSummary();
        softAssert.assertThat("123").isEqualTo(currentTestCaseSummary);

        mantisSite.getReportIssuePage().clickInCheckbox();
        ((JavascriptExecutor) driver).executeScript
                ("arguments[0].scrollIntoView(true);", mantisSite.getDropUpField());
        mantisSite.selectDeleteValue();
        mantisSite.clickOkButton();
        softAssert.assertThat(mantisSite.isAreYouSureBlockIsDisplayed());
        mantisSite.clickDeleteIssueButton();
        Thread.sleep(3000);
        softAssert.assertAll();
    }
    }
