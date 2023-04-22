package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Message {
    String textMessages;
    String messageSendingNumber;
    public Message(String messageSendingNumber,String textMessages){
        this.messageSendingNumber = messageSendingNumber;
        this.textMessages = textMessages;
    }
}
