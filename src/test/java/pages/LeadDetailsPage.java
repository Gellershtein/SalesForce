package pages;

import io.qameta.allure.Step;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BaseDetailsPage;

public class LeadDetailsPage extends BaseDetailsPage {

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Leads")));
    }

    @Step("Open details tab on Lead page")
    public LeadDetailsPage openDetailsTab() {
        wait = new WebDriverWait(driver, 20);
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    @Step("Validating new Lead from Details page")
    public void validateLead(Lead lead) {
        validateInput("Name", String.format("%s %s %s", lead.getSalutation(), lead.getFirstName(), lead.getLastName()));
        validateInput("Company", lead.getCompany());
        validateInput("Title", lead.getTitle());
        validateInput("Lead Status", lead.getLeadStatus());
        validateInput("Email", lead.getEmail());
        validateInput("Phone", lead.getPhone());
        validateInput("Rating", lead.getRating());
        validateInput("Address", String.format("%s\n%s, %s %s\n%s", lead.getStreet(), lead.getCity(), lead.getState(), lead.getPostalCode(), lead.getCountry()));
        validateInput("Website", lead.getWebsite());
        validateInput("No. of Employees", lead.getNumberOfEmployees());
        validateInput("Annual Revenue", "$" + lead.getAnnualRevenue());
        validateInput("Description", lead.getLeadDescription());
        validateInput("Lead Source", lead.getLeadSource());
        validateInput("Industry", lead.getIndustry());
    }
}
