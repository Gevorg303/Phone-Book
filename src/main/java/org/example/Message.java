package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    /*У объекта сообщения может быть только один пользователь*/
    MessageHistory messageHistory;
    String textMessages;
    Boolean status;/*мы отправили или нам отправили*/
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

}
