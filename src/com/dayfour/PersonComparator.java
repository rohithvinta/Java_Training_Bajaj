package com.dayfour;

class PersonComparator {
    private String firstName;
    private String lastName;
    public PersonComparator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}