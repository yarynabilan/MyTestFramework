import helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import static helpers.ColorPrinter.ptintColorMessage;
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
  //  protected Logger logger;
    private String title;
    public BasePage(WebDriver driver){
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 3);
        this.title = title;
 //       this.logger = (Logger) LogManager.getLogger(this.title);
//        ptintColorMessage("Page object of " + title + this.getClass().getName(), (org.apache.logging.log4j.Logger) logger, Level.DEBUG);
    }
}
