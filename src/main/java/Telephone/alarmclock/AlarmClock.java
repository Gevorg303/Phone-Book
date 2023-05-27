package Telephone.alarmclock;

import java.text.SimpleDateFormat;
import java.util.*;
public class AlarmClock {
    Scanner scanner = new Scanner(System.in);
    List<Alarm> alarms; // список для хранения вызовов
    public AlarmClock(){
        alarms = new ArrayList<>();
    }
    public String addAlarm(){
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
    public void printAlarm(){
        System.out.println("Список установленных будильников: ");
        System.out.println(alarms);
    }
    public void removeAlarm(){
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
    @Override
    public String toString() {
        boolean keyAlarmClock = true;
        while (keyAlarmClock) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить новый будильник.");
            System.out.println("2 - Удалить уже поставленный будильник.");
            System.out.println("3 - Посмотреть установленные будильники.");
            System.out.println("4 - Выход.");
            int choiceAlarmClock = scanner.nextInt();
            switch (choiceAlarmClock) {
                case 1 -> System.out.println(addAlarm());
                case 2 -> removeAlarm();
                case 3 -> printAlarm();
                case 4 -> keyAlarmClock = false;
                default -> System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
        return "Вы закрыли будильник";
    }
}
