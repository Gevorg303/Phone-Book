package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить контакт.");
            System.out.println("2 - Удалить контакт.");
            System.out.println("3 - Показать все контакты.");
            System.out.println("4 - Сделать звонок.");
            System.out.println("5 - Показать всю историю звонков.");
            System.out.println("6 - Показать историю звонков с конкретным контактом.");
            System.out.println("7 - Написать сообщение.");
            System.out.println("8 - Показать всю историю сообщений.");
            System.out.println("9 - Показать историю сообщений с конкретным контактом..");
            System.out.println("10 - Выход.");
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

                    phoneBook.printContacts();
                    break;
                case 4:
                    System.out.println("Введите номер телефона контакта которому вы хотите позвонить: ");
                    String num = scanner.nextLine();

                    CallHistory callHistory = new CallHistory(num);
                    phoneBook.addCall(callHistory);
                    System.out.println("Звонок успешно сделан на номер: " + num);
                    break;
                case 5:
                    phoneBook.printCallHistory();
                    break;
                case 6:
                    System.out.println("Введите номер телефона контакта с которым хотите посмотреть историю звонков: ");
                    String number = scanner.nextLine();
                    phoneBook.contactsCallHistory(number);
                    break;
                case 7:
                    System.out.println("Введите номер на который вы хотите отправить сообщение: ");
                    String messageSendingNumber=scanner.nextLine();

                    System.out.println("Введите текст сообщения: ");
                    String textMessages=scanner.nextLine();

                    Date dateNowMessage = new Date();

                    MessageHistory messageHistory = new MessageHistory(messageSendingNumber, textMessages, dateNowMessage);
                    phoneBook.addMessage(messageHistory);
                    System.out.println("Сообщение успешно отправлено!");
                    break;
                case 8:
                    phoneBook.printMessageHistory();
                    break;
                case 9:
                    System.out.println("Введите номер телефона контакта с которым хотите посмотреть историю сообщений: ");
                    String numberM = scanner.nextLine();
                    phoneBook.contactsMessageHistory(numberM);
                    break;
                case 10:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
                    break;
            }
        }
    }
}