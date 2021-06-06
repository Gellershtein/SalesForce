package models;

import com.github.javafaker.Faker;

public class AccountFactory {
    public static Account get() {
        Faker faker = new Faker();
        return Account.builder()
                .accountName(faker.name().name())
                .parentAccount("SZ")
                .phone(faker.phoneNumber().phoneNumber())
                .fax(faker.phoneNumber().phoneNumber())
                .website("www.test.by")
                .type("Analyst")
                .industry("Banking")
                .employees("" + faker.number().numberBetween(1, 100))
                .annualRevenue(faker.number().numberBetween(1, 10) + "," + faker.number().numberBetween(100, 999))
                .description("Test Account creation")
                .billingStreet(faker.address().streetName())
                .billingCity(faker.address().city())
                .billingState(faker.address().state())
                .billingPostalCode(faker.address().zipCode())
                .billingCountry(faker.address().country())
                .shippingStreet(faker.address().streetName())
                .shippingCity(faker.address().city())
                .shippingState(faker.address().state())
                .shippingPostalCode(faker.address().zipCode())
                .shippingCountry(faker.address().country())
                .build();
    }
}
