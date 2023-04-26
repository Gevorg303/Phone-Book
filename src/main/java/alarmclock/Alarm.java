package alarmclock;

import javax.sound.midi.Sequence;
import java.util.Date;

public class Alarm {
    Date date;/* ГГГГ-ММ-ДД ЧЧ:ММ:СС */
    boolean vibration; /* вкл/выкл вибрацию */
    Sequence sequence; /* храним мелодия будильника*/
    String key; /* уникальный идентификатор */
    String description; /* комментарий к будильнику */
}
