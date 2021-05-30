package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import pages.AccountsListPage;
import pages.ContactsPage;
import pages.LeadsPage;
import pages.LoginPage;
import utils.AllureUtils;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {
    WebDriver driver;
    protected LoginPage loginPage;
    protected AccountsListPage accountsListPage;
    protected ContactsPage contactsPage;
    protected LeadsPage leadsPage;
    //    HomePage homePage;
    public static String USER = "sergei.zayats1992-b3sh@force.com";
    public static String PASSWORD = "pswrd123";

    @BeforeMethod(description = "Open browser")
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {
        System.out.println(browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
//           options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        accountsListPage = new AccountsListPage(driver);
        contactsPage = new ContactsPage(driver);
        leadsPage = new LeadsPage(driver);
//        homePage = new HomePage(driver);
    }

    @AfterMethod(alwaysRun = true, description = "Close browser")
    public void tearDown() {
        AllureUtils.takeScreenshot(driver);
        driver.quit();
    }
}

