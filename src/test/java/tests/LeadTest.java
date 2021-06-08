package tests;

import models.Lead;
import models.LeadFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LeadTest extends BaseTest {
    @Test(description = "Create new lead and validate it")
    public void createNewLead() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        isOpened = loginPage
                .logIn(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        Lead lead = LeadFactory.get();
        leadsPage
                .open()
                .clickNew()
                .create(lead)
                .openDetailsTab()
                .validateLead(lead);
    }
}
