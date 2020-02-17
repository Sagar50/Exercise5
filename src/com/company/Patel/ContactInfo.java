package com.company.Patel;

public class ContactInfo {
    private String personName;
    private String personEmail;

    public ContactInfo(String personName, String personEmail) {
        this.personName = personName;
        this.personEmail = personEmail;
        System.out.println(personName + " " +  personEmail);

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "personName='" + personName + '\'' +
                ", personEmail='" + personEmail + '\'' +
                '}';
    }
}
