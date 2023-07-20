import helpers.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import static helpers.ColorPrinter.ptintColorMessage;
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Logger logger;
    private String title;
    public BasePage(WebDriver driver, String title){
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 3);
        this.title = title;
        this.logger = LogManager.getLogManager().getLogger(this.title);
        ptintColorMessage("Page object of " + title + this.getClass().getName(), (org.apache.logging.log4j.Logger) logger, Level.DEBUG);
    }
}
