package Telephone;

import Telephone.alarmclock.Alarm;
import Telephone.alarmclock.AlarmClock;
import Telephone.gallery.Gallery;
import Telephone.phoneBook.Call;
import Telephone.phoneBook.Message;
import Telephone.phoneBook.PhoneBook;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Telephone telephone = new Telephone();

        telephone.doNewCall(new Call("+73333333333", new Date()));
        List<Call> callHistory = telephone.getCallHistory("+7888888888");

        telephone.doNewMassage(new Message("+7111111111", "Ура, я заработал!", new Date()));
        List<Message> messageHistory = telephone.getMessageHistory("+7222222222");

        System.out.println(callHistory);
        System.out.println(messageHistory);

        //telephone.addAlarm(new Alarm());


//        while (isRunning) {
//            System.out.println("Выберите действие: ");
//            System.out.println("1 - Открыть телефонную книгу.");
//            System.out.println("2 - Открыть галерею фотографий.");
//            System.out.println("3 - Открыть будильник.");
//            System.out.println("4 - Выключить телефон.");
//            int choice = scanner.nextInt();
//            switch (choice) {
//                //телефонная книга
//                case 1 -> System.out.println(phoneBook);
//                //галерея
//                case 2 -> System.out.println(gallery);
//                //будильник
//                case 3 -> System.out.println(alarmClock);
//                case 4 -> isRunning = false;
//                default -> System.out.println("Неверный ввод. Попробуйте еще раз.");
//            }
//        }
    }
}
