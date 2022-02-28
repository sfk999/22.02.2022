package mantis.tests;
//мой тест
import mantis.pages.MainPage;
import mantis.pages.MantisSite;
import mantis.pages.ReportIssuePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAndDeleteNewIssueTests extends BaseTest {
    private MantisSite mantisSite;

    @Test
    public void createAndDeleteNewIssueTests() throws InterruptedException {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuesPage();
        mantisSite.fillSummary("test1");
        mantisSite.fillDescription("test2");
        mantisSite.clickIssueButton();
        Thread.sleep(5000);


        String currentTestCaseNumber = mantisSite.getReportIssuePage().checkTestCaseNumber();
        Assertions.assertEquals("test1", currentTestCaseNumber);
        Thread.sleep(5000);

    }



    }
