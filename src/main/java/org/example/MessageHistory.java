package org.example;

import java.util.*;

public class MessageHistory {
    public List<Message> messageList;
    public MessageHistory() {
        messageList = new ArrayList<>();
    }
    public List<Message> getMessage() {
        return messageList;
    }
    @Override
    public String toString() {
        return "История сообщений: "+messageList;
    }
}
