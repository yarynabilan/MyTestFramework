import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;

public class ProfileForm extends BasePage {

    By signOutLocator = By.xpath("//span[contains(text(), 'Sign out')]/parent::a");
    By profileLogoLocator = By.className("avatar circle");
    By yourRepositButtonLocator = By.xpath("//span[contains(text(), \"Your repositories\")]/parent::a");
 //   private final static String TITLE = "Profile form";
    public ProfileForm(WebDriver driver) {
        super(driver);
    }

    public SignOutPage signOutFromGitHub() {
        assertTrue(driver.findElement(signOutLocator).isDisplayed());
        driver.findElement(signOutLocator).click();
        return new SignOutPage(driver);
    }

    public RepositoriesPage goToRepositoriesPage() {
        assertTrue(driver.findElement(yourRepositButtonLocator).isDisplayed());
        driver.findElement(yourRepositButtonLocator).click();
        return new RepositoriesPage(driver);
    }


}
