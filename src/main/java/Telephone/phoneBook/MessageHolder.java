package Telephone.phoneBook;

import java.util.*;

public class MessageHolder {
    public List<Message> messageList;

    public MessageHolder() {
        messageList = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messageList.add(message);
        System.out.println("Сообщение успешно отправлено на номер: " + message.messageSendingNumber);
    }

    public List<Message> printMessageHistory(String phoneNumber) {
        return messageList;
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
