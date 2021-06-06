package models;

import com.github.javafaker.Faker;

public class LeadFactory {
    public static Lead get() {
        Faker faker = new Faker();
        return Lead.builder()
                .salutation("Prof.")
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .company(faker.company().name())
                .title(faker.name().title())
                .leadStatus("Working")
                .phone(faker.phoneNumber().phoneNumber())
                .email("ilon@scammer.com")
                .rating("Hot")
                .street(faker.address().streetName())
                .city(faker.address().city())
                .state(faker.address().state())
                .postalCode(faker.address().zipCode())
                .country(faker.address().country())
                .website("www.test.by")
                .numberOfEmployees("" + faker.number().numberBetween(1, 100))
                .annualRevenue(faker.number().numberBetween(1, 10) + "," + faker.number().numberBetween(100, 999))
                .leadSource("In-Store")
                .industry("Banking")
                .leadDescription("Dogefather")
                .build();
    }
}
