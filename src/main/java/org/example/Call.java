package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Call{
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

    short time;/*продолжительность звонка*/
    public Call(Date dateNow, short time) {
        this.dateNow = dateNow;
        this.time = time;
    }
}
