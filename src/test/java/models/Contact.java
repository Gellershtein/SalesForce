package models;

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

    public Contact(
            String salutation, String firstName, String lastName, String accountName, String title, String phone,
            String mobile, String email, String reportsTo, String mailingStreet, String mailingCity, String mailingState,
            String mailingPostalCode, String mailingCountry, String otherStreet, String otherCity, String otherState,
            String otherPostalCode, String otherCountry, String fax, String department, String homePhone, String leadSource,
            String otherPhone, String birthdate, String asstPhone, String assistant, String descriptionInfo) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.title = title;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.reportsTo = reportsTo;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
        this.mailingPostalCode = mailingPostalCode;
        this.mailingCountry = mailingCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherPostalCode = otherPostalCode;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.department = department;
        this.homePhone = homePhone;
        this.leadSource = leadSource;
        this.otherPhone = otherPhone;
        this.birthdate = birthdate;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.descriptionInfo = descriptionInfo;
    }
//GETTERS AND SETTERS

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    public void setOtherPostalCode(String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDescriptionInfo() {
        return descriptionInfo;
    }

    public void setDescriptionInfo(String descriptionInfo) {
        this.descriptionInfo = descriptionInfo;
    }
}
