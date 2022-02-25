package mantis.tests;
//мой тест
import mantis.pages.MantisSite;
import mantis.pages.ReportIssuePage;
import org.junit.jupiter.api.Test;

public class CreateAndDeleteNewIssueTests extends BaseTest {
    private ReportIssuePage reportIssuePage;

    @Test
    public void createAndDeleteNewIssueTests() {
        reportIssuePage = new ReportIssuePage(driver);
        reportIssuePage.goToReportIssuesPage();
        reportIssuePage.fillSummary("Test 25 005 2022");

    }







    }
