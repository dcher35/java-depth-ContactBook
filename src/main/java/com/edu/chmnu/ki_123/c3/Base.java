package com.edu.chmnu.ki_123.c3;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        Contact contact1 = new Contact("Ivan", "ivan@example.com");
        contact1.addPhoneNumber(new PhoneNumber("067-123-4567", "Personal Number"));
        contact1.addPhoneNumber(new PhoneNumber("044-987-6543", "Work Number"));

        Contact contact2 = new Contact("Olha", "olha@example.com");
        contact2.addPhoneNumber(new PhoneNumber("093-555-1234", "Home Number"));

        Contact contact3 = new Contact("Andriy", "andriy@example.com");
        contact3.addPhoneNumber(new PhoneNumber("050-234-9876", "Mobile Number"));

        Contact contact4 = new Contact("Nina", "nina@example.com");
        contact4.addPhoneNumber(new PhoneNumber("067-765-4321", "Personal Number"));

        Contact contact5 = new Contact("Oleksandr", "oleksandr@example.com");
        contact5.addPhoneNumber(new PhoneNumber("093-876-1234", "Work Number"));

        contactBook.addContact(contact1);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);
        contactBook.addContact(contact4);
        contactBook.addContact(contact5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name to search for the contact: ");
        String searchName = scanner.nextLine();

        Contact foundContact = contactBook.searchContactByName(searchName);
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact);
        } else {
            System.out.println("Contact not found");
        }

        System.out.println("All contacts in the book:");
        for (Contact contact : contactBook.getContacts()) {
            System.out.println(contact);
        }

        scanner.close();
    }
}