package org.example;

import java.util.*;

public class PhoneBook extends Users{
    MessageHistory messageHistory = new MessageHistory();
    CallHistory callHistory = new CallHistory();

    public void addContact(String fullName, String phoneNumber, String email, String address, String organizationPhoneNumber, String organization) {
        UserInfo newContact = new UserInfo(fullName, phoneNumber, email, address, organizationPhoneNumber, organization);
        userInfoList.add(newContact);
    }

    public void removeContact(String fullName) {
        int k=0;
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).fullName.equals(fullName)) {
                k++;
                userInfoList.remove(i);
                System.out.println("Контакт успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Контакт не найден.");
        }
    }

    public void printContacts() {
        System.out.println(userInfoList);
    }

    public void addCall(String num) {
        Date dateNowCall = new Date();
        Call call = new Call(num, dateNowCall);
        callHistory.callList.add(call);
        System.out.println("Звонок успешно сделан на номер: " + num);
    }

    public void printCallHistory() {
        System.out.println(callHistory);
    }

    public void addMessage(String messageSendingNumber, String textMessages) {
        Date dateNowMessage = new Date();
        Message message = new Message(messageSendingNumber, textMessages, dateNowMessage);
        messageHistory.messageList.add(message);
        System.out.println("Сообщение успешно отправлено на номер: " + messageSendingNumber);
    }

    public void printMessageHistory() {
        System.out.println(messageHistory);
    }

    public void contactsCallHistory(String num) {
        int k = 0;
        for (int i = 0; i < callHistory.callList.size(); i++) {
            if (callHistory.callList.get(i).number.equals(num)) {
                k++;
                System.out.println(callHistory.callList.get(i));
            }
        }
        if (k == 0) {
            System.out.println("Звонков с данным контактом не найдено");
        }
    }

    public void contactsMessageHistory(String num) {
        int k = 0;
        for (int i = 0; i < messageHistory.messageList.size(); i++) {
            if (messageHistory.messageList.get(i).messageSendingNumber.equals(num)) {
                k++;
                System.out.println(messageHistory.messageList.get(i));
            }
        }
        if (k == 0) {
            System.out.println("Сообщений с данным контактом не обнаружено");
        }
    }
    public void infoContacts(String number){
        int k=0;
        for (int i=0; i<userInfoList.size(); i++) {
            if (userInfoList.get(i).phoneNumber.equals(number)) {
                k++;

                System.out.println(userInfoList.get(i));
            }
        }
        if(k==0) {
            System.out.println("Контакт не найден.");
        }
    }
}