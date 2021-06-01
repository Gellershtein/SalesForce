package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {
    //Contact Information section
    String salutation, firstName, lastName, accountName, title, phone, mobile, email, reportsTo;
    //Address Information section
    String mailingStreet, mailingCity, mailingState, mailingPostalCode, mailingCountry;
    String otherStreet, otherCity, otherState, otherPostalCode, otherCountry;
    //Additional Information section
    String fax, department, homePhone, leadSource, otherPhone, birthdate, asstPhone, assistant;
    //Description Information section
    String descriptionInfo;
}
