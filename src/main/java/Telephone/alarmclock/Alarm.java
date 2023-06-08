package Telephone.alarmclock;

import java.util.Random;

public class Alarm {
    private final boolean vibration; /* вкл/выкл вибрацию */
    private final String sequence; /* мелодия*/
    private final String date;/* ГГГГ-ММ-ДД ЧЧ:ММ:СС */
    private final String key; /* уникальный идентификатор (3 значное число)*/
    private final String description; /* комментарий к будильнику */
    public String getKey() {
        return key;
    }

    public Alarm(String date, boolean vibration, String sequence, String description) {
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
