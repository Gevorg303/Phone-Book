package Telephone.phoneBook;

import java.util.*;

public class MessageHistory {
    public List<Message> messageList;

    public MessageHistory() {
        messageList = new ArrayList<>();
    }

    public void addMessage(String messageSendingNumber, String textMessages) {
        Date dateNowMessage = new Date();
        Message message = new Message(messageSendingNumber, textMessages, dateNowMessage);
        messageList.add(message);
        System.out.println("Сообщение успешно отправлено на номер: " + messageSendingNumber);
    }

    public void printMessageHistory() {
        System.out.println(messageList);
    }

    public void contactsMessageHistory(String num) {
        int k = 0;
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).messageSendingNumber.equals(num)) {
                k++;
                System.out.println(messageList.get(i));
            }
        }
        if (k == 0) {
            System.out.println("Сообщений с данным контактом не обнаружено");
        }
    }

    public List<Message> getMessage() {
        return messageList;
    }

    @Override
    public String toString() {
        return "История сообщений: " + messageList;
    }
}
