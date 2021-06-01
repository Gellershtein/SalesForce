package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BaseDetailsPage;

@Log4j2
public class AccountDetailsPage extends BaseDetailsPage {


    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Account")));
    }

    @Step("Open details tab on Accounts page")
    public AccountDetailsPage openDetailsTab() {
        log.info("Opened the details tab on the Accounts page");
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    @Step("Validating new Account from Details page")
    public void validateAccount(Account account) {
        log.info(String.format("Started validation new Account: %s from the Details page", account.getAccountName()));
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