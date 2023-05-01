package Telephone.alarmclock;

import java.text.SimpleDateFormat;
import java.util.*;
public class AlarmClock {
    Scanner scanner = new Scanner(System.in);
    List<Alarm> alarms; // список для хранения вызовов
    public AlarmClock(){
        alarms = new ArrayList<>();
    }
    protected String addAlarm(){
        try {
            System.out.println("Введите дату и время в формате ГГГГ-ММ-ДД ЧЧ:ММ:СС: ");
            String dateString = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Включить вибрация (true или false): ");
            Boolean vibration = Boolean.valueOf(scanner.nextLine());
            System.out.println("Введите название мелодии для будильника: ");
            String sequence = scanner.nextLine();
            System.out.println("Оставьте комментарий к будильнику: ");
            String description=scanner.nextLine();
            Alarm newAlarm = new Alarm(dateFormat.parse(dateString), vibration, sequence, description);
            alarms.add(newAlarm);
            return "Будильник успешно добавлен!";
        } catch (Exception e) {
            return null;
        }
    }
    protected void printAlarm(){
        System.out.println("Список установленных будильников: ");
        System.out.println(alarms);
    }
    protected void removeAlarm(){
        int k=0;
        System.out.println("Введите ключ будильника который вы хотите удалить: ");
        String key = scanner.nextLine();
        for (int i=0; i<alarms.size(); i++) {
            if (alarms.get(i).key.equals(key)) {
                k++;
                alarms.remove(i);
                System.out.println("Будильник успешно удален.");
            }
        }
        if(k==0) {
            System.out.println("Будильник с таким ключем не найден..");
        }
    }
}
