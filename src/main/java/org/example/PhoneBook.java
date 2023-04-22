package org.example;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public Map<String, UserInfo> contacts;
    public Map<CallHistory, Date> callMap;
    public Map<String, MessageHistory> messageContacts;

    public PhoneBook() {
        contacts = new HashMap<>();
        callMap= new HashMap<>();
        messageContacts = new HashMap<>();
    }

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

    public void addCall(CallHistory callHistory) {
        Date dateNow = new Date();
        callMap.put(callHistory, dateNow);
    }

    public void printCallHistory() {
        if (callMap.isEmpty()) {
            System.out.println("История пуста");
        } else {
            System.out.println("История звонков: ");
            for (Map.Entry<CallHistory, Date> entry : callMap.entrySet()) {
                System.out.println("Кому звонили: " + entry.getKey() + " Когда звонили: " + entry.getValue());
            }
        }
    }

    public void addMessage(MessageHistory messageHistory) {
        messageContacts.put(messageHistory.textMessages, messageHistory);
    }

    public void printMessageHistory() {
        if (messageContacts.isEmpty()) {
            System.out.println("История сообщений пуста.");
        } else {
            System.out.println("История сообщений:");
            for (Map.Entry<String, MessageHistory> entry : messageContacts.entrySet()) {
                //System.out.println(entry.getKey());
                System.out.println(entry.getValue());

            }
        }
    }
    public void contactsCallHistory(String number){
        for (Map.Entry<CallHistory, Date> entry : callMap.entrySet()){
            CallHistory callHistory = entry.getKey();
            Date date = entry.getValue();
            if (callHistory.unknownNumber.equals(number)){
                System.out.println("Номер: "+callHistory.unknownNumber + "  Дата звонка: "+date);
            }
        }
    }
    public void contactsMessageHistory(String number){
        for (Map.Entry<String, MessageHistory> entry : messageContacts.entrySet()){
            //String messageSendingNumber = entry.getKey();
            MessageHistory messageHistory = entry.getValue();
            if (messageHistory.messageSendingNumber.equals(number)){
                System.out.println("Номер: "+messageHistory.messageSendingNumber + "  Текст сообщения: "+ messageHistory.textMessages+"   Дата отправки сообщения: "+messageHistory.dateNowMessage);
            }
        }
    }
}