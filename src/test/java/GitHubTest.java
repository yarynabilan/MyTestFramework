import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GitHubTest extends BaseTest {
//protected Logger logger;
    @Test
    public void checkLogoOnTheLoginPage() {
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().getLogo().isDisplayed(), "Logo is not displayed");
    }

    @Test
    public void checkLoginIsSuccessful() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("yarynabilan3833@gmail.com", "parol3833");
        MainPage mainPage = new MainPage(driver);
        mainPage.getLogoOnTheMainPage();
        assertTrue(mainPage.getLogoOnTheMainPage().isDisplayed());
    }

    @Test
    public void checkFailedLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailed("yarynabilan3833@gmail.com", "failed login");
        loginPage.validateErrorMessage("Incorrect username or password.");
    }

    @Test
    public void checkLogOutFromGitHub() {
        String expectedQuestionText = "Are you sure you want to sign out?";
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("yarynabilan3833@gmail.com", "parol3833");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        assertEquals(expectedQuestionText, profileForm.signOutFromGitHub().getQuestionElement().getText());
    }

    @Test
    public void checkRepositoriesList() {
        List<String> expReposList = new ArrayList<>();
        expReposList.add("test2");
        expReposList.add("test1");
        expReposList.add("test");

        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("yarynabilan3833@gmail.com", "parol3833");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        assertEquals(expReposList, repositoriesPage.getRepositories());
    }
}

