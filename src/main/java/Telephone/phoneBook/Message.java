package Telephone.phoneBook;

import java.util.Date;

public class Message {
    private final String messageSendingNumber;
    private final String textMessages;
    private final Date dateNowMessage;

    public String getMessageSendingNumber() {
        return messageSendingNumber;
    }

    public String getTextMessages() {
        return textMessages;
    }

    public Date getDateNowMessage() {
        return dateNowMessage;
    }

    public Message(String messageSendingNumber, String textMessages, Date dateNowMessage) {
        this.messageSendingNumber = messageSendingNumber;
        this.textMessages = textMessages;
        this.dateNowMessage = dateNowMessage;
    }
    @Override
    public String toString() {
        return "\nНомер на который отправили сообщение: "+messageSendingNumber + "  Текст сообщения: "+textMessages + "    Дата отпрвки сообщения: " + dateNowMessage;
    }
}
