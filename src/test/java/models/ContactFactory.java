package models;

import com.github.javafaker.Faker;

public class ContactFactory {
    public static Contact get() {
        Faker faker = new Faker();
        return Contact.builder()
                .salutation("Prof.")
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .accountName("TestAccount")
                .title(faker.name().title())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().cellPhone())
                .email("ilon@scammer.com")
                .reportsTo("Boss")
                .mailingStreet(faker.address().streetName())
                .mailingCity(faker.address().city())
                .mailingState(faker.address().state())
                .mailingPostalCode(faker.address().zipCode())
                .mailingCountry(faker.address().country())
                .otherStreet(faker.address().streetName())
                .otherCity(faker.address().city())
                .otherState(faker.address().state())
                .otherPostalCode(faker.address().zipCode())
                .otherCountry(faker.address().country())
                .fax(faker.phoneNumber().phoneNumber())
                .department("Trading")
                .homePhone(faker.phoneNumber().phoneNumber())
                .leadSource("Word of mouth")
                .otherPhone(faker.phoneNumber().phoneNumber())
                .birthdate("5/1/1941")
                .asstPhone(faker.phoneNumber().phoneNumber())
                .assistant(faker.name().firstName())
                .descriptionInfo("Test Account creation")
                .build();
    }
}
