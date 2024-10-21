package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private final String name;
    private final List<PhoneNumber> phoneNumbers;
    private final String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
        this.phoneNumbers = new ArrayList<>();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void removePhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.remove(phoneNumber);
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Phone Numbers:\n");
        for (PhoneNumber phoneNumber : phoneNumbers) {
            sb.append(" - ").append(phoneNumber).append("\n");
        }
        return sb.toString();
    }
}
