package pages;

import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath(BaseLocator + "//*[@id='detailTab__item']");
    String icon = BaseLocator + "//img[@title='%s']";

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Contact")));
    }

    public ContactDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateContact(Contact contact) {
        validateInput("Name", String.format("%s %s %s", contact.getSalutation(), contact.getFirstName(), contact.getLastName()));
        validateInput("Account Name", String.format("%s\nOpen %s Preview", contact.getAccountName(), contact.getAccountName()));
        validateInput("Title", contact.getTitle());
//        validateInput("Type, contact.getTitle());
        validateInput("Phone", contact.getPhone());
        validateInput("Mobile", contact.getMobile());
        validateInput("Email", contact.getEmail());
        validateInput("Reports To", String.format("%s\nOpen %s Preview", contact.getReportsTo(), contact.getReportsTo()));
        validateInput("Mailing Address", String.format("%s\n%s, %s %s\n%s", contact.getMailingStreet(), contact.getMailingCity(), contact.getMailingState(), contact.getMailingPostalCode(), contact.getMailingCountry()));
        validateInput("Other Address", String.format("%s\n%s, %s %s\n%s", contact.getOtherStreet(), contact.getOtherCity(), contact.getOtherState(), contact.getOtherPostalCode(), contact.getOtherCountry()));
        validateInput("Fax", contact.getFax());
        validateInput("Home Phone", contact.getHomePhone());
        validateInput("Other Phone", contact.getOtherPhone());
        validateInput("Asst. Phone", contact.getAsstPhone());
        validateInput("Assistant", contact.getAssistant());
        validateInput("Description", contact.getDescriptionInfo());
        validateInput("Department", contact.getDepartment());
        validateInput("Lead Source", contact.getLeadSource());
        validateInput("Birthdate", contact.getBirthdate());
    }
}