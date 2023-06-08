package Telephone.alarmclock;

import java.text.SimpleDateFormat;
import java.util.*;
public class AlarmClock {
    private final List<Alarm> alarms; // список для хранения вызовов
    public AlarmClock(){
        alarms = new ArrayList<>();
    }
    public String addAlarm(Alarm alarm){
        try {
            alarms.add(alarm);
            return "Будильник успешно добавлен!";
        } catch (Exception e) {
            return null;
        }
    }
    public void removeAlarm(){
        int k=0;
        System.out.println("Введите ключ будильника который вы хотите удалить: ");
        String key = "?";
        for (int i=0; i<alarms.size(); i++) {
            if (alarms.get(i).getKey().equals(key)) {
                k++;
                alarms.remove(i);
                System.out.println("Будильник успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Будильник с таким ключем не найден..");
        }
    }

    public List<Alarm> getAlarm() {
        return alarms;
    }
}
