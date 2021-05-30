package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath(BaseLocator + "//*[@id='detailTab__item']");
    protected String icon = BaseLocator + "//img[@title='%s']";

    public BaseDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
