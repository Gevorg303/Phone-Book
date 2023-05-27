package Telephone;

import Telephone.alarmclock.AlarmClock;
import Telephone.gallery.Gallery;
import Telephone.phoneBook.PhoneBook;

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args){

        Gallery gallery = new Gallery();
        PhoneBook phoneBook = new PhoneBook();
        AlarmClock alarmClock = new AlarmClock();

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Открыть телефонную книгу.");
            System.out.println("2 - Открыть галерею фотографий.");
            System.out.println("3 - Открыть будильник.");
            System.out.println("4 - Выключить телефон.");
            int choice = scanner.nextInt();
            switch (choice) {
                //телефонная книга
                case 1 -> System.out.println(phoneBook);
                //галерея
                case 2 -> System.out.println(gallery);
                //будильник
                case 3 -> System.out.println(alarmClock);
                case 4 -> isRunning = false;
                default -> System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}
