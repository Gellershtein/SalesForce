package tests;

import models.Lead;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LeadTest extends BaseTest {
    @Test(description = "Create new lead and validate it")
    public void createNewCLead() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        isOpened = loginPage
                .logIn(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        Lead lead = new Lead("Dr.", "Ilon", "Mask", "Tesla", "Scammer",
                "Working", "+33123", "ilon@scammer.com", "Hot", "test malling street", "Minsk",
                "Frunz", "12345", "BY", "123321", "1,000", "1,000",
                "In-Store", "Banking", "Dogefather");
        leadsPage
                .open()
                .clickNew()
                .create(lead)
                .openDetailsTab()
                .validateLead(lead);
    }
}
