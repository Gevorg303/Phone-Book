package org.example;

import java.util.Date;

public class Message {
    String messageSendingNumber;
    String textMessages;
    Date dateNowMessage;

    public Message(String messageSendingNumber, String textMessages, Date dateNowMessage) {
        this.messageSendingNumber = messageSendingNumber;
        this.textMessages = textMessages;
        this.dateNowMessage = dateNowMessage;
    }
    @Override
    public String toString() {
        return "\nНомер на который отправили сообщение: "+messageSendingNumber + "  Текст сообщения: "+textMessages;
    }
}
