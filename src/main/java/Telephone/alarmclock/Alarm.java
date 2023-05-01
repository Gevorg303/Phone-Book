package Telephone.alarmclock;

import javax.sound.midi.Sequence;
import java.util.Date;
import java.util.Random;

public class Alarm {
    Date date;/* ГГГГ-ММ-ДД ЧЧ:ММ:СС */
    boolean vibration; /* вкл/выкл вибрацию */
    String sequence; /* путь к мелодии*/
    String key; /* уникальный идентификатор (3 значное число)*/
    String description; /* комментарий к будильнику */

    public Alarm(Date date, boolean vibration, String sequence, String description) {
        this.key = generatedKey();
        this.date = date;
        this.vibration = vibration;
        this.sequence = sequence;
        this.description = description;
    }

    private String generatedKey() {
        Random random = new Random();
        String key;
        key = String.valueOf(random.nextInt(900) + 100);
        return key;
    }

    @Override
    public String toString() {
        return "\nКлюч будильника: " + key + "    Звонок прозвенит: " + date + "    Вибрация: " + vibration + "   Мелодия звонка: " + sequence + "    Комментарий: " + description;
    }
}
