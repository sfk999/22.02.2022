package mantis.tests;
//мой тест
import mantis.pages.MainPage;
import mantis.pages.MantisSite;
import mantis.pages.ReportIssuePage;
import org.junit.jupiter.api.Test;

public class CreateAndDeleteNewIssueTests extends BaseTest {
    private MantisSite mantisSite;

    @Test
    public void createAndDeleteNewIssueTests() throws InterruptedException {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuesPage();
        mantisSite.fillSummary("");
//        reportIssuePage.fillSummary("Test 25 005 2022");
        Thread.sleep(5000);
    }



    }
