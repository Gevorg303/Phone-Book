package org.example;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить контакт.");
            System.out.println("2 - Удалить контакт.");
            System.out.println("3 - Показать все контакты.");
            System.out.println("4 - Выйти из телефонной книги.");
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
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
                    break;
            }
        }
    }
}