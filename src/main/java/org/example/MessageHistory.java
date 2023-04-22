package org.example;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MessageHistory {
    String messageSendingNumber;
    String textMessages;
    Date dateNowMessage;

    public MessageHistory(String messageSendingNumber, String textMessages, Date dateNowMessage) {
        this.messageSendingNumber = messageSendingNumber;
        this.textMessages = textMessages;
        this.dateNowMessage = dateNowMessage;
    }

    @Override
    public String toString() {
        return "Кому отправили: " + messageSendingNumber + "    Текст сообщения: " + textMessages + "   Дата отправки сообщения: " + dateNowMessage;
    }
}
