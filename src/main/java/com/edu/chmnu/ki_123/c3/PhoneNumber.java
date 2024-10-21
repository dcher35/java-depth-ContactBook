package com.edu.chmnu.ki_123.c3;

public class PhoneNumber {
    private String number;
    private String type;

    public PhoneNumber(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + ": " + number;
    }
}