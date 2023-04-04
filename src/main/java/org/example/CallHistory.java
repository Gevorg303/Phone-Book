package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CallHistory {
    String  uuid;
    String fullName;
    String organizationPhoneNumber;
    String phoneNumber;
    String userImage;
    String organization;
    String email;
    String address;
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
    Call[] calls;
    /*У объекта "пользователь" может быть множество звонков
    * А у объекта "звонок" только один пользователь*/
}
