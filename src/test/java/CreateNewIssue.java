import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewIssue extends BaseTest {

    @Test
    public void testCreateNewIssue() {
        driver.get("https://github.com/yarynabilan/MyTestFramework/issues");

        IssuesPage issuesPage = new IssuesPage(driver);

        issuesPage.clickNewIssueButton();

        issuesPage.enterIssueTitle("Test issue with Page Object patern");

        issuesPage.clickSubmitNewIssueButton();
    }
}




