package org.example;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("1 - вывести список контактов");
        System.out.println("2 - добавить контакт");
        System.out.println("3 - удалить контакт");
        UserInfo userInfo = new UserInfo();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    userInfo.outputContact(userInfo);
                    break;
                case "2":
                    System.out.println("Введите uuid");
                    userInfo.uuid=scanner.nextLine();

                    System.out.println("Введите имя контакта");
                    userInfo.fullName=scanner.nextLine();

                    System.out.println("Введите название организации");
                    userInfo.organization=scanner.nextLine();

                    System.out.println("Введите номер организации");
                    userInfo.organizationPhoneNumber=scanner.nextLine();

                    System.out.println("Введите номер телефона");
                    userInfo.phoneNumber=scanner.nextLine();

                    System.out.println("Введите е-маил");
                    userInfo.email=scanner.nextLine();

                    System.out.println("Введите адрес");
                    userInfo.address=scanner.nextLine();
                    break;
                case "3":

                    break;
            }
        }
    }
}