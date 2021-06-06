package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lead {
    String salutation, firstName, lastName, company, title, leadStatus, phone, email, rating;
    //Address Information section
    String street, city, state, postalCode, country, website;
    //Additional Information section
    String numberOfEmployees, annualRevenue, leadSource, industry;
    //Description Information section
    String leadDescription;
}
