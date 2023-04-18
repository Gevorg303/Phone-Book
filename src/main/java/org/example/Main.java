package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        CallHistory callHistory = new CallHistory();
        MessageHistory messageHistory = new MessageHistory();

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить контакт.");
            System.out.println("2 - Удалить контакт.");
            System.out.println("3 - Показать все контакты.");
            System.out.println("4 - Сделать звонок.");
            System.out.println("5 - Показать историю звонков.");
            System.out.println("6 - Написать сообщение.");
            System.out.println("7 - Показать историю сообщений.");
            System.out.println("8 - Выход.");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя контакта: ");
                    String fullName = scanner.nextLine();
                    System.out.println("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Введите е-маил: ");
                    String email = scanner.nextLine();
                    System.out.println("Введите адрес контакта: ");
                    String address = scanner.nextLine();
                    System.out.println("Введите номер организации: ");
                    String organizationPhoneNumber = scanner.nextLine();
                    System.out.println("Введите название организации: ");
                    String organization = scanner.nextLine();
                    phoneBook.addContact(fullName, phoneNumber, email, address, organizationPhoneNumber, organization);
                    System.out.println("Контакт успешно добавлен.");
                    break;
                case 2:
                    System.out.println("Введите имя контакта, который хотите удалить: ");
                    String nameToRemove = scanner.nextLine();
                    phoneBook.removeContact(nameToRemove);
                    break;
                case 3:
                    phoneBook.addContact(fullName="Петя (это мы)",
                            phoneNumber="89536446112",
                            email="robor@mail.ru",
                            address="Кострома",
                            organizationPhoneNumber="23-54-12",
                            organization="Дом деда мороза");
                    phoneBook.printContacts();
                    break;
                case 4:
                    System.out.println("Введите номер телефона контакта которому вы хотите позвонить: ");
                    String num = scanner.nextLine();
                    callHistory.addCall(num);
                    System.out.println("Звонок успешно сделан на номер: " + num);
                    break;
                case 5:
                    System.out.println("История звонков: ");
                    callHistory.addHistory();
                    break;
                case 6:
                    System.out.println("Введите номер на который вы хотите отправить сообщение: ");
                    String messageSendingNumber=scanner.nextLine();

                    System.out.println("Введите текст сообщения: ");
                    String textMessages=scanner.nextLine();

                    System.out.println("Дата отправки сообщения: "+formatForDateNow.format(dateNow));
                    messageHistory.addMessage(messageSendingNumber, textMessages);
                    System.out.println("Сообщение успешно отправлено!");
                    break;
                case 7:
                    messageHistory.printContacts();
                    break;
                case 8:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
                    break;
            }
        }
    }
}