package pages;

import elements.LGDropDown;
import elements.LGInput;
import elements.LGTextArea;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BaseModal;

@Log4j2
public class LeadModal extends BaseModal {

    public LeadModal(WebDriver driver) {
        super(driver);
    }


    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(modalTitle, "New Lead")));
    }

    @Step("Fill in form for new Lead")
    public LeadDetailsPage create(Lead lead) {
        log.info("Filling in form for new Lead");
        new LGDropDown(driver, "Salutation").select(lead.getSalutation());
        new LGInput(driver, "First Name").write(lead.getFirstName());
        new LGInput(driver, "Last Name").write(lead.getLastName());
        new LGDropDown(driver, "Lead Status").select(lead.getLeadStatus());
        new LGInput(driver, "Phone").write(lead.getPhone());
        new LGInput(driver, "Company").write(lead.getCompany());
        new LGInput(driver, "Title").write(lead.getTitle());
        new LGInput(driver, "Email").write(lead.getEmail());
        new LGDropDown(driver, "Rating").select(lead.getRating());
        new LGTextArea(driver, "Street").write(lead.getStreet());
        new LGInput(driver, "Website").write(lead.getWebsite());
        new LGInput(driver, "City").write(lead.getCity());
        new LGInput(driver, "State/Province").write(lead.getState());
        new LGInput(driver, "Zip/Postal Code").write(lead.getPostalCode());
        new LGInput(driver, "Country").write(lead.getCountry());
        new LGInput(driver, "No. of Employees").write(lead.getNumberOfEmployees());
        new LGInput(driver, "Annual Revenue").write(lead.getAnnualRevenue());
        new LGDropDown(driver, "Lead Source").select(lead.getLeadSource());
        new LGDropDown(driver, "Industry").select(lead.getIndustry());
        new LGDropDown(driver, "Lead Source").select(lead.getLeadSource());
        new LGTextArea(driver, "Description").write(lead.getLeadDescription());
        save();
        return new LeadDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }

}
