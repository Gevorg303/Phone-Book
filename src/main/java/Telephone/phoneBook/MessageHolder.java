package Telephone.phoneBook;

import java.util.*;

public class MessageHolder {
    private final List<Message> messageList;

    public MessageHolder() {
        messageList = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messageList.add(message);
        System.out.println("Сообщение успешно отправлено на номер: " + message.getMessageSendingNumber());
    }

    public List<Message> printMessageHistory(String phoneNumber) {
        List<Message> matchingMessages = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getMessageSendingNumber().equals(phoneNumber)) {
                matchingMessages.add(message);
            }
        }
        return matchingMessages;
    }
    public List<Message> getMessage() {
        return messageList;
    }

    @Override
    public String toString() {
        return "История сообщений: " + messageList;
    }
}
