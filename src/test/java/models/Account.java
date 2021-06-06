package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    String accountName, parentAccount, phone, fax, website, type, industry, employees, annualRevenue, description;
    String billingStreet, billingCity, billingState, billingPostalCode, billingCountry;
    String shippingStreet, shippingCity, shippingState, shippingPostalCode, shippingCountry;
}
