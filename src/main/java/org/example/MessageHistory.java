package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageHistory {
    enum dwed{
        uuid,


    }
    String  uuid;
    String fullName;
    String phoneNumber;
    String organizationPhoneNumber;
    String userImage;
    String organization;
    String email;
    String address;
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
    Message[] message;
    /* У объекта "пользователь" может быть множество сообщений
     * А у объекта "сообщения" только один пользователь*/

}
