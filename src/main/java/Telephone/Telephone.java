package Telephone;

import Telephone.alarmclock.MainAlarmClock;
import Telephone.gallery.MainGallery;
import Telephone.phoneBook.MainPhoneBook;

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Открыть телефонную книгу.");
            System.out.println("2 - Открыть галерею фотографий.");
            System.out.println("3 - Открыть будильник.");
            System.out.println("4 - Выключить телефон.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    MainPhoneBook.main();
                    break;
                case 2:
                    MainGallery.main();
                    break;
                case 3:
                    MainAlarmClock.main();
                    break;
                case 4:
                    isRunning=false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}
