package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, UserInfo> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }
//метод для поиска
//    public void newCall(String value)
//    {
//        for (Map.Entry<String, UserInfo> entry : contacts.entrySet()) {
//            String key = entry.getKey();
//            if (key.equals(value)){
//                System.out.println("Ehddddddddd");
//            }
//        }
//    }
    public void addContact(String fullName, String phoneNumber, String email, String address, String organizationPhoneNumber, String organization) {
        UserInfo newContact = new UserInfo(fullName, phoneNumber, email, address, organizationPhoneNumber, organization);
        contacts.put(fullName, newContact);
    }

    public void removeContact(String fullName) {
        if (contacts.containsKey(fullName)) {
            contacts.remove(fullName);
            System.out.println("Контакт успешно удален.");
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
        } else {
            System.out.println("Телефонная книга:");
            for (UserInfo contact : contacts.values()) {
                System.out.println(contact);
            }
        }
    }


}