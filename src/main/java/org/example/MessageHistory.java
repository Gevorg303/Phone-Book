package org.example;

import java.util.HashMap;
import java.util.Map;

public class MessageHistory {
    public Map<String, String> messageContacts = new HashMap<>();

    public void addMessage(String messageSendingNumber,String textMessages){
        messageContacts.put(messageSendingNumber, textMessages);
    }
    public void printContacts() {
        if (messageContacts.isEmpty()) {
            System.out.println("История сообщений пуста.");
        } else {
            System.out.println("История сообщений:");
            for (Map.Entry<String, String> entry : messageContacts.entrySet()) {
                System.out.println("Получатель: " + entry.getKey() + " Текст сообщения: " + entry.getValue());
            }
        }
    }
}
