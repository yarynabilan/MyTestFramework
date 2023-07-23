import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class IssuesPage extends BasePage {

    private By issuesTab = By.xpath("//h1[contains(text(), 'Issues')]");
    private By issuesSearch = By.xpath("//input[@aria-label='Search all issues']");
    private By filterButton = By.xpath("//*[@id=\"filters-select-menu\"]/summary/span[1]/span");
    private By newIssueButton = By.xpath("//div[@id='repo-content-pjax-container']//span[contains(@class, 'd-md-none') and text()='New']");
    private By dismissButton = By.xpath("//button[text()='Dismiss']");
    private By labesButton = By.xpath( "//a[contains(@class, 'js-repo-nav') and text()='Labels']");
    private By milestonesButton = By.xpath( "//a[contains(@class, 'js-repo-nav') and text()='Milestones']");
    private By allOfGitHubLink = By.xpath( "//a[test()='all of GitHub']");
    private By advancedSearch = By.xpath( "//a[text()='Advanced search'] ");
    private By issueNameInput = By.xpath( "//input[@id='issue_title']");
    private By submitNewIssueButton = By.xpath( "//button[@type='submit' and text()='Submit new issue']");
    public IssuesPage(WebDriver driver) {
        super(driver, driver.getTitle());
    }

    public void clickNewIssueButton() {
        driver.findElement(newIssueButton).click();
    }

    public void enterIssueTitle(String issueTitle) {
        driver.findElement(issueNameInput).sendKeys(issueTitle);
    }

    public void clickSubmitNewIssueButton() {
        driver.findElement(submitNewIssueButton).click();
    }
}
