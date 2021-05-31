package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public static final By TITLE_SALES = By.xpath("//*[@title='Sales']");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public HomePage open() {
        driver.get(URL + "/lightning/page/home");
        return this;
    }

    @Override
    public boolean isPageOpened() {
        return isExist(TITLE_SALES);
    }
}
