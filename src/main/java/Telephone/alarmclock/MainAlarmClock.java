package Telephone.alarmclock;

import java.util.Scanner;

public class MainAlarmClock {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        AlarmClock alarmClock = new AlarmClock();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить новый будильник.");
            System.out.println("2 - Удалить уже поставленный будильник.");
            System.out.println("3 - Посмотреть установленные будильники.");
            System.out.println("4 - Выход.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(alarmClock.addAlarm());
                    break;
                case 2:
                    alarmClock.removeAlarm();
                    break;
                case 3:
                    alarmClock.printAlarm();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}
