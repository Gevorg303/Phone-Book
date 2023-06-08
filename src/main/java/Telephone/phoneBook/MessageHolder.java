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
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getMessageSendingNumber().equals(phoneNumber)) {
                return Collections.singletonList(messageList.get(i));
            }
        }
        return null;
    }
    public List<Message> getMessage() {
        return messageList;
    }

    @Override
    public String toString() {
        return "История сообщений: " + messageList;
    }
}
