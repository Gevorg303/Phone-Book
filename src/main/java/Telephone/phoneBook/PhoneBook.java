package Telephone.phoneBook;

import java.util.Scanner;

public class PhoneBook{
    public UserInfoHolder userInfoHolder;
    public MessageHolder messageHolder;
    public CallHolder callHolder;
    public PhoneBook(){
        userInfoHolder = new UserInfoHolder();
        messageHolder = new MessageHolder();
        callHolder = new CallHolder();
    }
    @Override
    public String toString() {
        Scanner scanner = new Scanner(System.in);
        boolean keyPhoneBook = true;
        while (keyPhoneBook) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить контакт.");
            System.out.println("2 - Удалить контакт.");
            System.out.println("3 - Показать все контакты.");
            System.out.println("4 - Сделать звонок.");
            System.out.println("5 - Показать всю историю звонков.");
            System.out.println("6 - Показать историю звонков с конкретным контактом.");
            System.out.println("7 - Написать сообщение.");
            System.out.println("8 - Показать всю историю сообщений.");
            System.out.println("9 - Показать историю сообщений с конкретным контактом.");
            System.out.println("10 - Показать всю информацию о пользователе.");
            System.out.println("11 - Выход.");
            int choicePhoneBook = scanner.nextInt();
            scanner.nextLine();
            switch (choicePhoneBook) {
                case 1 -> userInfoHolder.addContact();
                case 2 -> userInfoHolder.removeContact();
                case 3 -> userInfoHolder.printContacts();
                case 4 -> callHolder.addCall();
                case 5 -> callHolder.printCallHistory();
                case 6 -> {
                    System.out.println("Введите номер телефона контакта с которым хотите посмотреть историю звонков: ");
                    String number = scanner.nextLine();
                    callHolder.contactsCallHistory(number);
                }
                case 7 -> messageHolder.addMessage();
                case 8 -> messageHolder.printMessageHistory();
                case 9 -> {
                    System.out.println("Введите номер телефона контакта с которым хотите посмотреть историю сообщений: ");
                    String numberM = scanner.nextLine();
                    messageHolder.contactsMessageHistory(numberM);
                }
                case 10 -> {
                    System.out.println("Введите номер телефона контакта информация о котором вы хотите посмотреть: ");
                    String number_search = scanner.nextLine();
                    System.out.println("Вся информация об этом пользоватле: ");
                    userInfoHolder.infoContacts(number_search);
                    callHolder.contactsCallHistory(number_search);
                    messageHolder.contactsMessageHistory(number_search);
                }
                case 11 -> keyPhoneBook = false;
                default -> System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
        return "Вы закрыли телефонную книгу";
    }
}