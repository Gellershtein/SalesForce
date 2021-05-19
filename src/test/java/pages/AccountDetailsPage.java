package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath(BaseLocator + "//*[@id='detailTab__item']");
    String icon = BaseLocator + "//img[@title='%s']";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Account")));
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateAccount(Account account) {
        validateInput("Account Name", account.getAccountName());
        validateInput("Phone", account.getPhone());
        validateInput("Fax", account.getFax());
        validateInput("Website", account.getWebsite());
        validateInput("Employees", account.getEmployees());
//        validateInput("Annual Revenue", "$" + String.format("%,d", account.getAnnualRevenue()); // нужно как-то преобразовать вводимое значение к локали
        validateInput("Annual Revenue", "$" + account.getAnnualRevenue());
        validateInput("Billing Address", String.format("%s\n%s, %s %s\n%s", account.getBillingStreet(), account.getBillingCity(), account.getBillingState(), account.getBillingPostalCode(), account.getBillingCountry()));
        validateInput("Shipping Address", String.format("%s\n%s, %s %s\n%s", account.getShippingStreet(), account.getShippingCity(), account.getShippingState(), account.getShippingPostalCode(), account.getShippingCountry()));
        validateInput("Type", account.getType());
        validateInput("Industry", account.getIndustry());
    }
}