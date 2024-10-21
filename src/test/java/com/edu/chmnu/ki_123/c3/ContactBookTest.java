package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactBookTest {

    private ContactBook contactBook;

    @BeforeEach
    public void setUp() {
        contactBook = new ContactBook();
    }

    // Тест перевіряє, чи контакт успішно додається до книги контактів
    @Test
    public void testAddContact() {
        Contact contact = new Contact("Ivan", "ivan.ivanenko@example.com");
        contactBook.addContact(contact);

        assertEquals(1, contactBook.getContacts().size(), "Contact should be added to the contact book");
        assertEquals("Ivan", contactBook.getContacts().getFirst().getName(), "Contact name should match");
    }

    // Тест перевіряє, чи можна знайти контакт за іменем
    @Test
    public void testSearchContactByName() {
        Contact contact = new Contact("Olga", "olha.petrivna@example.com");
        contactBook.addContact(contact);

        Contact foundContact = contactBook.searchContactByName("Olga");
        assertNotNull(foundContact, "Contact should be found by name");
        assertEquals("Olga", foundContact.getName(), "The name of the found contact should be Olga");
    }

    // Тест перевіряє, чи контакт має правильні номери телефонів
    @Test
    public void testContactPhoneNumbers() {
        Contact contact = new Contact("Andriy", "andriy.andriyenko@example.com");
        contact.addPhoneNumber(new PhoneNumber("050-234-9876", "Mobile Number"));
        contactBook.addContact(contact);

        Contact foundContact = contactBook.searchContactByName("Andriy");
        assertNotNull(foundContact, "Contact should be found");
        assertEquals(1, foundContact.getPhoneNumbers().size(), "Contact should have one phone number");
        assertEquals("050-234-9876", foundContact.getPhoneNumbers().getFirst().getNumber(), "Phone number should match");
    }
}