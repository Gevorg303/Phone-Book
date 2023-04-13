package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Message {
    String textMessages;
    String messageSendingNumber;
    Date dateNow = new Date();

    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

    public Message(String messageSendingNumber,String textMessages){
        this.messageSendingNumber = messageSendingNumber;
        this.textMessages = textMessages;
    }
}
