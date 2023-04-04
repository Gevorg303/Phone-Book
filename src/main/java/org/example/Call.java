package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Call {

    /*У объекта звонок может быть только один пользователь*/
    CallHistory callHistory;
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

    short time;/*продолжительность звонка*/

    Boolean status;/*мы позвонили или нам позвонили*/
}
