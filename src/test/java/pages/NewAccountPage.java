package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {
    public static final By PHONE_INPUT = By.xpath("//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='Phone']following-sibling::input");


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(PHONE_INPUT);
    }
}